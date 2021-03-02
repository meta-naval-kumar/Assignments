import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Test;

public class MainTest {

	@Test
	public void LcmTest() {
		Recursion rec = new Recursion();
		int lcm = rec.lcm(15, 20);
		assertEquals(60, lcm);
		 
	}
	@Test
	public void LcmTestFail() {
		Recursion rec = new Recursion();
		int lcm = rec.lcm(15, 20);
		assertNotEquals(50, lcm);
		 
	}
	@Test
	public void HcfTest() {
		Recursion rec = new Recursion();
		int lcm = rec.hcf(15, 20);
		assertEquals(5, lcm);
		 
	}
	@Test
	public void HcfTestFail() {
		Recursion rec = new Recursion();
		int lcm = rec.hcf(15, 20);
		assertNotEquals(10, lcm);
		 
	}

}
