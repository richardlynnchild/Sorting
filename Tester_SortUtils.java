package sort_evaluations;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class Tester_SortUtils {
	ArrayList<Integer> numbers1, numbers2, numbers3;
	
	@Before
	public void setUp() throws Exception {
		numbers1 = new ArrayList<Integer>();
		numbers1.add(1);
		numbers1.add(2);
		numbers1.add(3);
		numbers1.add(4);
		numbers1.add(5);
		numbers1.add(6);
		numbers1.add(7);
		numbers1.add(8);
		numbers1.add(9);
		numbers1.add(10);
		
		numbers2 = new ArrayList<Integer>();
		numbers2.add(10);
		numbers2.add(10);
		numbers2.add(10);
		numbers2.add(10);
		numbers2.add(10);
		numbers2.add(5);
		
	}

	@Test
	public void isSortedTest() {
		assertTrue(Sort_Utils.is_sorted(numbers1));
	}
	
	@Test
	public void sumEqualsTest(){
		assertTrue(Sort_Utils.sum_equals(numbers1, numbers2));
		
	}
	
	@Test
	public void generateSortedArrayTest() {
		ArrayList<Integer> sorted = Sort_Utils.generate_sorted_array(250);
		assertTrue(Sort_Utils.is_sorted(sorted));
		
	}
	
	@Test
	public void generateReverseSortedArrayTest() {
		ArrayList<Integer> reverse = Sort_Utils.generate_reverse_sorted_array(10);
		Integer num = 9;
		for(int index = 0; index < reverse.size(); index++){
			assertEquals(0, num.compareTo(reverse.get(index)));	
			num--;
		}
		
	}
	
	@Test
	public void generateSameArrayTest() {
		ArrayList<Integer> same = Sort_Utils.generate_same_array(25, 13);
		Integer num = 13;
		assertEquals(25, same.size());
		for(int index = 0; index < 25; index++){
			assertEquals(num, same.get(index));
		}
	}
	
	@Test
	public void insertionSortTest(){
		ArrayList<Integer> array = Sort_Utils.generate_random_array(10, 20);
		Sort_Utils.insertion_sort(array, 0, 9);
		assertTrue(Sort_Utils.is_sorted(array));
	}

}
