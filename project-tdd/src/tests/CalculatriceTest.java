package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classes.Calculatrice;

class CalculatriceTest {

	@Test
	public void testAdd() {
		Calculatrice c = new Calculatrice(); 
		int aInput = 8;
		int bInput = 5;
		int valeurAttendu = 13;
		// pass� le asserEquals en m�thode statique
		assertEquals("Le r�sultat doit retourner une somme", valeurAttendu, c.add(aInput, bInput)); 
	}

}
