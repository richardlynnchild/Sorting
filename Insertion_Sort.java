package sort_evaluations;

import java.util.ArrayList;

/**
 *        FIXME: every file should have your name (and your partner's name) on it, as well as the date, 
 *        a useful description, etc.
 */

public class Insertion_Sort <Type  extends Comparable <? super Type>> implements Sorter<Type>
{

	/**
	 * FIXME: Return the Name of the sort
	 */
	public String name_of_sort()
	{
	return "Insertion Sort";	
	}

	/**
	 * No affect on insertion sort
	 * FIXME: Simply print a debug message saying this is ignored
	 */
	public void set_constant( double constant )
	{
		
	}

	/**
	 * Note: the actual insertion sort code should be written in the Sort_Utils package
	 * call that code in this method
	 * FIXME: sort the entire array using insertion sort
	 */
	public void sort( ArrayList<Type> array, int start, int end )
	{
		
	}

	/**
	 * FIXME: return what you believe the Big O of insertion sort should be
	 * @return the expected complexity of this algorithm
	 */
	@Override
	public Complexity_Class get_expected_complexity_class()
	{
		return null;
		
	}

	@Override
	public void sort(ArrayList array)
	{
		
	}
	
	
	
	


}
