package it.uniroma3.diadia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PartitaTest {
	private Partita partitaTest;

	@Before
	public void setUp() throws Exception {
		partitaTest = new Partita();
	}

	@Test
	public void testIsFinita() {
		partitaTest.getGiocatore().setCfu(0);	
		assertTrue(partitaTest.isFinita());
	}

}
