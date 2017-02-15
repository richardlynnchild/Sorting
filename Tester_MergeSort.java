package sort_evaluations;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Tester_MergeSort
{

	@Test
	public void mergeSortTest()
	{
		ArrayList<Integer> array = Sort_Utils.generate_random_array(4000, 20);
		Merge_Sort<Integer> mergesorter = new Merge_Sort<Integer>();
		mergesorter.set_constant(10);
		mergesorter.sort(array);
		assertTrue(Sort_Utils.is_sorted(array));
	}

}
