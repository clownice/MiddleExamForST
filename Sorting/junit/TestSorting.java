import static org.junit.Assert.*;

import org.junit.Test;


public class TestSorting {

	@Test
	public void test() {
		int[] testcase= {2,1,5,3,2,1,0,4};
		int[] testcase2 = {7,1,5,3,2,1,0,4,2,3,0,2,1,1,0,2,5,3,6,5};
		int[] testcase3 = {1,5,3};
		Sorting sor = new Sorting();
		assertEquals(false,sor.isSorted(testcase));
		sor.insertionSort(testcase);
		assertEquals(true,sor.isSorted(testcase));
		Sorting.quicksort(testcase2);
		assertEquals(true,sor.isSorted(testcase2));
		Sorting.swapReferences(new Object[]{testcase3[0],testcase3[1],testcase3[2]}, 0,2);
		
	}

}
