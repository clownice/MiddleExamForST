import static org.junit.Assert.*;

import org.junit.Test;


public class TestTriangle {

	@Test
	public void test() { 
		long[] testcase = {2,3,3};
		long[] testcase2 = {3,3,3};
		long[] testcase3 = {3,4,5};
		long[] testcase4 = {1,1,-1};
		Triangle tri = new Triangle(testcase[0],testcase[1],testcase[2]);
		Triangle tri2 = new Triangle(testcase2[0],testcase2[1],testcase2[2]);
		Triangle tri3 = new Triangle(testcase3[0],testcase3[1],testcase3[2]);
		Triangle tri4 = new Triangle(testcase4[0],testcase4[1],testcase4[2]);
		long[] temp = tri.getBorders();
		for(int i =0; i< 3;i++)
		{
			assertEquals((long)0,testcase[i]-temp[i]);
		}
		
		assertEquals("Isosceles",tri.getType(tri));
		assertEquals("Regular",tri.getType(tri2));
		assertEquals("Scalene",tri.getType(tri3));
		assertEquals("Illegal",tri.getType(tri4));
	}

}
