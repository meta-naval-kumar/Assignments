import static org.junit.Assert.*;
import org.junit.Test;

public class SearchTest {

	@Test
	public void LinearTest() {
		Search rec = new Search();
		int [] arr = new int[]{1,4,2,5};
		int index = rec.linearSearch(arr, 5);
		assertEquals(3, index);
		 
	}
	@Test
	
	public void LcmTestFail() {
		Search rec = new Search();
		int [] arr = new int[]{1,4,2,5};
		int index = rec.linearSearch(arr, 5);
		assertNotEquals(5, index);
		 
	}
	@Test
	public void HcfTest() {
		Search rec = new Search();
		int [] arr = new int[]{1,2,3,4};
		int index = rec.binarySearch(arr, 0, 3,4 );
		assertEquals(3, index);
	}
	@Test
	public void HcfTestFail() {
		Search rec = new Search();
		int [] arr = new int[]{1,2,3,4};
		int index = rec.binarySearch(arr, 0, 3,4 );
		assertNotEquals(2, index);
		 
	}

}
