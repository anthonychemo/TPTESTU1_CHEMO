package com.saintjean.tptestu1_chemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class TestOperationMathematique {

	@Test
	void testEstPositif() {
		System.out.println("Je teste la methode IsPair.");
		assertEquals(true, OperationMathematique.estPositif(8));
	}

	@Test
	void testFactoriel() {
		System.out.println("Je teste la methode factoriel.");
		assertEquals(24, OperationMathematique.factoriel(4));
	}

}
