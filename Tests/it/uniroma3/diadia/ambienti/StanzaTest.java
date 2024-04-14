package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaTest {
	private Stanza stanzaTest;
	private Attrezzo attrezzoTest;

	@Before
	public void setUp() throws Exception {
		attrezzoTest = new Attrezzo("attrezzoTest", 1);
		stanzaTest = new Stanza("stanzaTest");

	}

	@Test
	public void testAddAttrezzo() {

		assertTrue(stanzaTest.addAttrezzo(attrezzoTest));
		assertEquals(attrezzoTest,stanzaTest.getAttrezzo("attrezzoTest"));
	}

	@Test
	public void testGetAttrezzo() {

		assertEquals(attrezzoTest,stanzaTest.getAttrezzo("attrezzoTest"));
	}
	public void testhasAttrezzo() {

		assertTrue(stanzaTest.hasAttrezzo("attrezzoTest"));
	}
	@Test
	public void testRemoveAttrezzo() {

		stanzaTest.addAttrezzo(attrezzoTest);
		assertTrue(stanzaTest.removeAttrezzo(attrezzoTest));
	}

}
