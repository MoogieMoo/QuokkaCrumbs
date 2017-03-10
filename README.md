# QuokkaCrumbs
#### Brian Kwong, Max Chan, Maggie Xia

##### *Table to Showcase Our Data* (Averaged over 1000 trials)

| Array Size       | Time (nanoseconds)    |
|------------------|-----------------------|
| 10               | 3,236                 |
| 100              | 8,498                 |
| 1,000            | 47,900                |
| 100, 000         | 6,772,927             |


### Our assessment of QuickSort’s Big-Oh runtime classification, abstracted to the algorithm level, in the
+ best case: nlogn
+ average or most likely case: nlogn
+ worst case: n^2
- Our methodology: first generate an array of random ints for each of the 4 categories (size 10, 100, 1000, and 100,000).
time how long a single QuickSort would take on the array, then shuffle the array and repeat 1000 times for each category*
*** for the size 100,000 category, only 100 trials were averaged instead of the standard 1000. Due to the sheer size of
time taken to complete the category, the value would overflow and result in negative time, which makes no sense. Thus we chose
a smaller sample size that could still capture the average runtime. 
- Our time measurements and analysis of same: The chart above helped us determine the average runtime case, O(nlogn)
- How pivot selection and data arrangement affect execution time: pivot selection and data arrangement play an important role in determining
whether a certain setup will run in O(nlogn) or O(n^2) time. If the array is already in ascending order and we choose our pivot point to
be one greater than the lower bound, it will take O(n^2) time to determine that the array is already sorted. This can easily be fixed
with a quick linear time check at the beginning to determine whether the array is sorted or not, thus eliminating the worst case.
