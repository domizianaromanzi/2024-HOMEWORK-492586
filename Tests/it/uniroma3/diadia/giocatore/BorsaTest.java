package it.uniroma3.diadia.giocatore;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class BorsaTest {
	private Borsa borsaTest;
	private Attrezzo a ;
	@Before
	public void setUp() throws Exception {

		borsaTest = new Borsa();
		a = new Attrezzo("a", 1);
		borsaTest.addAttrezzo(a);
	}

	@Test
	public void testAddAttrezzo() {
		assertTrue(borsaTest.addAttrezzo(new Attrezzo("attrezzotest", 1) ));
	}

	@Test
	public void testGetAttrezzo() {
		assertNull(borsaTest.getAttrezzo("abc"));
		assertEquals(a, borsaTest.getAttrezzo("a"));
	}

	@Test
	public void testHasAttrezzo() {
		assertTrue(borsaTest.hasAttrezzo("a"));
	}

	@Test
	public void testRemoveAttrezzo() {
		assertNull(borsaTest.removeAttrezzo("abc"));
		assertEquals(a, borsaTest.removeAttrezzo("a"));
	}

}
