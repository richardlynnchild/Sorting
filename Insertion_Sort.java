package sort_evaluations;

import java.util.ArrayList;

import javax.sound.sampled.EnumControl.Type;

/**
 *        FIXME: every file should have your name (and your partner's name) on it, as well as the date, 
 *        a useful description, etc.
 */

public class Insertion_Sort<Type extends Comparable<Type>> implements Sorter<Type>// make generic and implement Sorter 
{

	/**
	 * Return the Name of the sort
	 */
	public String name_of_sort(){
		return "Insertion Sort";
		
	}

	/**
	 * No affect on insertion sort
	 */
	public void set_constant( double constant ){
		System.out.println("This is ignored");
	}

	/**
	 * Note: the actual insertion sort code should be written in the Sort_Utils package
	 * call that code in this method
	 * sort the entire array using insertion sort
	 */
	@Override
	public void sort( ArrayList<Type> array ){
		Sort_Utils.insertion_sort(array, 0, array.size()-1);
		
	}

	/**
	 * FIXME: return what you believe the Big O of insertion sort should be
	 * @return the expected complexity of this algorithm
	 */
	@Override
	public Complexity_Class get_expected_complexity_class(){
		return Complexity_Class.Nsquared;
		
	}
	
	
	/*public void swap(ArrayList<Type> array, int from, int to){
		
		Type temp1 = array.get(from);
		Type temp2 = array.get(to);
		array.set(from, temp2);
		array.set(to, temp1);
		
	}*/

}
