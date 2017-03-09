public class ExecTime{
    public static void main(String[] args){
	int max = 10000;
	
	int[] ten;
	int[] hun;
	int[] thou;
	int[] hunthou;

	ten = QuickSort.buildArray(10, max);
	hun = QuickSort.buildArray(100, max);
	thou = QuickSort.buildArray(1000, max);
	hunthou = QuickSort.buildArray(100000, max);
	
	int tenTime = 0;

	for (int x = 0; x < 1000; x ++){
	    long y = System.nanoTime();
	    QuickSort.qsort(ten);
	    long z = System.nanoTime();
	    tenTime += (z - y);
	    QuickSort.shuffle(ten);
	}

	tenTime /= 1000; 
	System.out.println("Time for sorting array of size ten: ");
	System.out.println(tenTime);
	
	int hunTime = 0;

	for (int x = 0; x < 1000; x ++){
	    long y = System.nanoTime();
	    QuickSort.qsort(hun);
	    long z = System.nanoTime();
	    hunTime += (z - y);
	    QuickSort.shuffle(hun);
	}

	hunTime /= 1000; 

	System.out.println("Time for sorting array of size 100: ");
	System.out.println(hunTime);

	int thouTime = 0;

	for (int x = 0; x < 1000; x ++){
	    long y = System.nanoTime();
	    QuickSort.qsort(thou);
	    long z = System.nanoTime();
	    thouTime += (z - y);
	    QuickSort.shuffle(thou);
	}

	thouTime /= 1000; 

	System.out.println("Time for sorting array of size 1000: ");
	System.out.println(thouTime);

	int hunthouTime = 0;

	for (int x = 0; x < 100; x ++){
	    long y = System.nanoTime();
	    QuickSort.qsort(hunthou);
	    long z = System.nanoTime();
	    hunthouTime += (z - y);
	    QuickSort.shuffle(hunthou);
	}

	hunthouTime /= 100; 

	System.out.println("Time for sorting array of size 100000: ");
	System.out.println(hunthouTime);
    }
}
