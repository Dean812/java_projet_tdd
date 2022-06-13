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
		// passé le asserEquals en méthode statique
		assertEquals("Le résultat doit retourner une somme", valeurAttendu, c.add(aInput, bInput)); 
	}

}
