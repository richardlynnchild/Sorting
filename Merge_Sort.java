
package sort_evaluations;

import java.util.ArrayList;

/**
 * @author H. James de St. Germain
 * @date Spring 2017
 * 
 *       regular merge sort
 */
public class Merge_Sort<Type extends Comparable<? super Type>> implements Sorter<Type>// implement sorter
{

	/**
	 * a value for switching over to insertion sort
	 */
	protected double SWITCH_OVER;
	
	/**
	 * The name of the sort
	 */
	public String name_of_sort(){
		return "Merge Sort";
	}

	/**
	 * Merge Sort
	 * 
	 * split array in half
	 * sort left
	 * sort right
	 * combine
	 * 
	 * 
	 * @param array          the values to sort from small to high
	 * @param low            the index of the starting value in the "virtual array"
	 * @param high           the index of the ending value in the "virtual array"
	 * 
	 */
	private void merge_sort( ArrayList<Type> array, ArrayList<Type> auxillary, int low, int high ){
		
		if(low < high){
			int mid = (low+high)/2;
			merge_sort(array, auxillary, low, mid);
			merge_sort(array, auxillary, mid+1, high);
			combine(array, auxillary, low, mid, high);
		}
	}

	/**
	 * combine the values in array into the auxiliary
	 * 
	 * @param array           - original values (the entire array)
	 * @param auxillary       - spare space 
	 * @param low             - low,mid are the lower array
	 * @param mid             - mid,high are the upper array
	 * @param high
	 * 
	 * combine the sub arrays in the _array_ parameter. use the _auxillary_ parameter for scratch space
	 */

	private void combine( ArrayList<Type> array, ArrayList<Type> auxillary, int low, int mid, int high ){
		
		int left = low;
		int right = mid+1;
		int index = low;
		
		while(index < high+1){
			
			if(array.get(left).compareTo(array.get(right)) <= 0){
				auxillary.add(array.get(left));
				left++;
				if(left > mid){
					index++;
					for(int rightIndex = right; rightIndex < high+1; rightIndex++){
						auxillary.add(array.get(rightIndex));
					}
					break;
				}
			}
			else {
				auxillary.add(array.get(right));
				right++;
				if(right > high){
					index++;
					for(int leftIndex = left; leftIndex < mid+1; leftIndex++){
						auxillary.add(array.get(leftIndex));
					}
					break;
				}
			}
			index++;
		}
		
		for(int auxIndex = 0; auxIndex < auxillary.size(); auxIndex++){
			array.set(low++, auxillary.get(auxIndex));
		}	
	}

	/**
	 * Allow the insertion sort cut off to be changed
	 */
	public void set_constant( double cutoff ){
		SWITCH_OVER = cutoff;
	}

	/**
	 * sort the array
	 */
	@Override
	public void sort( ArrayList<Type> array )
	{
		ArrayList<Type> auxillary = new ArrayList<Type>();
		merge_sort(array, auxillary, 0, array.size()-1); 
	}

	@Override
	public Complexity_Class get_expected_complexity_class(){
		return Complexity_Class.NlogN;
	}

}
