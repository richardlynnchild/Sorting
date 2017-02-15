package sort_evaluations;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class Tester_MergeSort {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void mergeSortTest() {
		ArrayList<Integer> array = Sort_Utils.generate_random_array(10, 20);
		Merge_Sort<Integer> ms = new Merge_Sort<Integer>();
		ms.sort(array);
		assertTrue(Sort_Utils.is_sorted(array));
	}

}
