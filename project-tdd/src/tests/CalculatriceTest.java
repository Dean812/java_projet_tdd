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

	@Test
	public void testsub() {
		Calculatrice c = new Calculatrice();
		int aInput = 8;
		int bInput = 5;
		int valeurAttendu = 3;
		// passé le asserEquals en méthode statique
		assertEquals("Le résultat doit retourner une soustraction", valeurAttendu, c.sub(aInput, bInput));
	}

	@Test
	public void testMul() {
		Calculatrice c = new Calculatrice();
		int aInput = 8;
		int bInput = 5;
		int valeurAttendu = 40;
		// passé le asserEquals en méthode statique
		assertEquals("Le résultat doit retourner une multiplication", valeurAttendu, c.mul(aInput, bInput));
	}

	@Test
	public void testDiv() {
		Calculatrice c = new Calculatrice();
		int aInput = 30;
		int bInput = 10;
		int valeurAttendu = 3;
		// passé le asserEquals en méthode statique
		assertEquals("Le résultat doit retourner une division", valeurAttendu, c.div(aInput, bInput));
	}
	
//	@Test
//	(expected=ArithmeticException.class)
//	public void testDivision2() {
//		Calculatrice c = new Calculatrice();
//		int aInput = 10;
//		int bInput = 0;
//		c.div(aInput, bInput);		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
