/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   ExecTime is essentially a Driver file that times 
   how long it takes for QuickSort to sort an int[]
   of size n.
   1) We first created four arrays of increasing size
      (from 10 to 10,000).
   2) Then, we used the buildArray()helper method given
      to us in the QuickSort skeleton file we got from 
      the homework yesterday.
   3) Finally, we used a for loop to test QuickSort on
      each array 1,000 times, and found the average time
      to sort an array of size[n].      
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

//class ExecTime
public class ExecTime {
    
    public static void main( String[] args ) {
	int max = 10000;

	//create arrays of increasing size to use for testing
	int[] ten;
	int[] hun;
	int[] thou;
	int[] hunthou;

	//use the method buildArray() to randomly populate
	//previously created arrays
	ten = QuickSort.buildArray(10, max);
	hun = QuickSort.buildArray(100, max);
	thou = QuickSort.buildArray(1000, max);
	hunthou = QuickSort.buildArray(100000, max);

	//timing how long it takes to QuickSort an array of size 10
	int tenTime = 0;

	for ( int x = 0; x < 1000; x++ ) {
	    
	    long y = System.nanoTime();
	    QuickSort.qsort(ten);
	    long z = System.nanoTime();
	    tenTime += (z - y);
	    QuickSort.shuffle(ten);
	    
	}

	tenTime /= 1000; 
	System.out.println("Time for sorting array of size ten: ");
	System.out.println(tenTime);

	//timing how long it takes to QuickSort an array of size 100
	int hunTime = 0;

	for ( int x = 0; x < 1000; x++ ) {
	    
	    long y = System.nanoTime();
	    QuickSort.qsort(hun);
	    long z = System.nanoTime();
	    hunTime += (z - y);
	    QuickSort.shuffle(hun);
	    
	}

	hunTime /= 1000; 

	System.out.println("Time for sorting array of size 100: ");
	System.out.println(hunTime);

	//timing how long it takes to QuickSort an array of size 1,000
	int thouTime = 0;

	for ( int x = 0; x < 1000; x++ ){
	    
	    long y = System.nanoTime();
	    QuickSort.qsort(thou);
	    long z = System.nanoTime();
	    thouTime += (z - y);
	    QuickSort.shuffle(thou);
	    
	}

	thouTime /= 1000; 

	System.out.println("Time for sorting array of size 1000: ");
	System.out.println(thouTime);

	//timing how long it takes to QuickSort an array of size 10,000
	int hunthouTime = 0;

	for ( int x = 0; x < 100; x++ ) {
	    
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
