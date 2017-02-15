package sort_evaluations;

import java.util.ArrayList;

/**
 * @author H. James de St. Germain
 * @date   Spring 2007
 * 
 * This interface allows a sort routine to be tested by turning the
 * sort into a "functor".  All the sorts of interest must
 * be created to follow the functions required by this interface. 
 *
 */
public interface Sorter<Type extends Comparable<? super Type>>
{
  /**
   * put the array list in order from smallest to largest
   * @param array - an array of comparable objects
   */
  public  abstract void sort(ArrayList<Type> array);
  
  /**
   * for testing purposes, get the name of the sort
   * @return the name of the sort
   */
  public  abstract String name_of_sort();
  
  /**
   * If you want to change the behavior of the sort, such as for
   * quicksort, changing, the insertion sort cutoff or for 
   * shell sort, the gap size.
   * 
   * @param constant - any one constant in an algorithm
   */
  public default void set_constant(double constant)
  {
	// the default case is to do nothing....
  }

  /**
   * @return the expected complexity class of the sort
   * 
   * For example, NLogN, NSquared, etc.
   */
  public abstract Complexity_Class get_expected_complexity_class();


  /**
   * Swap Routine that will swap the given two values in the array 
   */
  public static <Type> void swap(ArrayList<Type> array, int from, int to)
  {
	  	Type temp1 = array.get(from);
		Type temp2 = array.get(to);
		array.set(from, temp2);
		array.set(to, temp1);
	  
  }
  
}
