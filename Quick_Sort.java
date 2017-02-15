
package sort_evaluations;

import java.util.ArrayList;

/**
 * This code is an abstract base class for all versions of quicksort.
 * 
 * 
 *  Write Quick sort using a single array(list) and doing it in place 
 * 
 *  Instrument it to allow the changing of the Insertion Sort Switch over
 * 
 */
public abstract class Quick_Sort 
    //FIXME: make generic on type comparable
    //FIXME: must implement the Sorter interface
{
	/**
	 * create a field for the insertion sort switchover level
	 */

	/**
	 *  Choose a Pivot (return it's value in the array)
	 *  Modify array as appropriate (e.g., median of three will move smallest value to front of array)
	 *
	 * @param array - the array of all values (we only sort a sub piece of the array)
	 * @param start - the start position in the (sub) array
	 * @param end   - the end position in the (sub) array
	 * @return the pivot value
	 */
	protected abstract Type  choose_pivot( ArrayList<Type> array, int start, int end );

	/**
	 * Given an array, partition the array such that
	 * all the elements lower than or equal to the pivot are on the left,
	 * all the elements greater than the pivot are on the right.
	 * 
	 * @param array   - data data to sort
	 * @param left    - the start index of the sub array (inclusive)
	 * @param right   - the end index of the sub array (inclusive)
	 * 
	 * @return the location of the pivot
	 */

	protected int partition( ArrayList<Type> array, int left, int right )
	{
		// WARNING: this code can be tricky to get just right.  do your best
		// then pay attention in class on Tuesday
		// PLEASE: please make an attempt before Tuesday
	}

	/**
	 * The actual Quick Sort on an Array routine.
	 * 
	 * Algorithm:
	 *   1) choose a pivot (store in first bucket for convenience)
	 *   2) o) move all elements higher than the pivot to the right side of the array
	 *      o) move all elements lower than the pivot to the left side of the array
	 *   3) put the pivot back between upper and lower group
	 *   4) sort left side
	 *   5) sort right side   (WARNING: don't sort pivot again)
	 * 
	 * @param array - data to be sorted
	 * @param start is the index of the beginning element
	 * @param end is the index of the last element
	 * 
	 * 
	 */
	private void quick_sort( ArrayList<Type> array, int start, int end )
	{
		// FIXME: if the size of the array is smaller than the INSERTION SORT cutoff
		//        call the sort_utils insertion_sort code and be done with it.
		
		// 1) partition array
		// 2) sort left
		// 3) sort right           (again, don't resort the pivot)

	}

	/**
	 * the sort interface method.
	 * 
	 * call quicksort on the array
	 * 
	 */
	public void sort( ArrayList<Type> array )
	{
		quick_sort(array, 0, array.size() - 1);
	}

	/**
	 * Name the sort
	 */
	public abstract String name_of_sort();

	/**
	 * The constant in this case is the insertion sort cutoff level... always greater than 3
	 */
	public void set_constant( double constant );
	
	/**
	 * @return the expected complexity for quick sort 
	 */
	@Override
	public Complexity_Class get_expected_complexity_class();




}
