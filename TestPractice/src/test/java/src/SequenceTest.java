package src;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class SequenceTest {
	
	private static Sequence seq = null; 
	
	@BeforeClass
	public static void makeSequence() {
		seq = new Sequence();
	}
	
	@Test
	public void addTest() {
		assertEquals(10,seq.loopAdd2(5, 2));
	}
	
	@Test
	public void subTest() {
		assertEquals(-10,seq.loopSub2(5, 2));
	}
	
	@Test
	public void divTest() {
		assertEquals(0,seq.loopAdd2(5, 2));
	}
	
	@Test
	public void mulTest() {
		assertEquals(32,seq.loopMul2(5, 2));
	}
}
