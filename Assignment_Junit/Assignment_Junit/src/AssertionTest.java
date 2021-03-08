import static org.junit.Assert.*;

import org.junit.Test;


public class AssertionTest {

	@Test
	public void maxMirrPass() {
		int [] arr = new int[]{1,2,5,7,2,1};
		ArrOperation op = new ArrOperation();
		int max = op.maxMirror(arr);
		assertEquals(2, max);
		 
	}
	@Test
	public void maxMirrFail() {
		int [] arr = new int[]{1,2,5,7,2,1};
		ArrOperation op = new ArrOperation();
		int max = op.maxMirror(arr);
		assertEquals(3, max);
		 
	}
	@Test
	public void clumpsPass() {
		int [] arr = new int[]{1,2,5,7,2,1};
		ArrOperation op = new ArrOperation();
		int clump = op.clumps(arr);
		assertEquals(2, clump);
		 
	}
	@Test
	public void clumpsFail() {
		int [] arr = new int[]{1,2,5,7,2,1};
		ArrOperation op = new ArrOperation();
		int clump = op.clumps(arr);
		assertEquals(5, clump);
		 
	}
	@Test
	public void solveTestPass(){
		int [] arr = new int[]{1,5,6,4,7,5,4,8};
		ArrOperation op = new ArrOperation();
		int [] ReArr = op.solveXY(arr, 4, 5);
		int [] res = new int[]{1,7,6,4,5,8,4,5};
		assertEquals(res, ReArr);
	}
	@Test
	public void solveTestFail(){
		int [] arr = new int[]{1,5,6,4,7,5,4,8};
		ArrOperation op = new ArrOperation();
		int [] ReArr = op.solveXY(arr, 4, 5);
		int [] res = new int[]{1,7,6,4,5,8,5,4};
		assertEquals(res, ReArr);
	}
	@Test
	public void splitTestPass(){
		int [] arr = new int[]{1,5,7};
		ArrOperation op = new ArrOperation();
		int  ReArr = op.splitArray(arr);
		assertEquals(-1, ReArr);
	}
	@Test
	public void splitTestFail(){
		int [] arr = new int[]{1,5,7};
		ArrOperation op = new ArrOperation();
		int  ReArr = op.splitArray(arr);
		assertEquals(1, ReArr);
	
	}
	

}
