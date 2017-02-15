
package sort_evaluations;

import java.util.ArrayList;

/**
 * @author H. James de St. Germain
 * @date Spring 2017
 * 
 *       regular merge sort
 */
public class Merge_Sort <Type  extends Comparable <? super Type>> implements Sorter<Type>
{

	/**
	 * FIXME: have a value for switching over to insertion sort
	 */
	double SWITCH_OVER;
	/**
	 * FIXME: The name of the sort
	 */
	public String name_of_sort()
	{
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
	private void merge_sort( ArrayList<Type> array, ArrayList<Type> auxillary, int low, int high )
	{
		
		if(high-low>SWITCH_OVER)
		{
			int mid =(low+high)/2;
			merge_sort(array, auxillary, low, mid);
			merge_sort(array,auxillary,mid+1,high);
			combine(array,auxillary, low, mid, high);
		}
		else
		{
			Sort_Utils.insertion_sort(array, low,high);
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

	private void combine( ArrayList<Type> array, ArrayList<Type> auxillary, int low, int mid, int high )
	{
		int left = low;
		int right = mid+1;
		int count = low;
		
		while(count <= high){
			if(array.get(left).compareTo(array.get(right)) < 0){
				auxillary.add(array.get(left));
				left++;
				if(left > mid){
					//finish right side
					for(int rightIndex = right; rightIndex < high+1; rightIndex++){
						auxillary.add(array.get(rightIndex));
					}
					break;
				}
				count++;
			}
			else {
				auxillary.add(array.get(right));
				right++;
				if(right > high){
					//finish left side
					for(int leftIndex = left; leftIndex < mid+1; leftIndex++){
						auxillary.add(array.get(leftIndex));
					}
					break;
				}
				count++;
			}
			
		}
		
		//copy aux values to array
		int auxIndex = 0;
		for(int index = low; index <= high; index++){
			array.set(index, auxillary.get(auxIndex));
			auxIndex++;
		}
		//clear aux array
		auxillary.clear();
	}

	/**
	 * Allow the insertion sort cut off to be changed
	 */
	public void set_constant( double cutoff )
	{
		SWITCH_OVER = cutoff;
	}

	/**
	 * sort the array
	 */
	@Override
	public void sort( ArrayList<Type> array )
	{
		ArrayList <Type> auxillaryArray = new ArrayList<Type>();
		merge_sort(array,auxillaryArray,0,array.size()-1);
	}

	@Override
	public Complexity_Class get_expected_complexity_class()
	{
		return Complexity_Class.NLOGN;
	}

}
