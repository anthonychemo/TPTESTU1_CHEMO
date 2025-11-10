package com.saintjean.tptestu1_chemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class TestOperationMathematique {

	@Test
	void testEstPositif() {
		System.out.println("Je teste la methode estPositif.");
		assertEquals(true, OperationMathematique.estPositif(8));
	}

	@Test
	void testFactoriel() throws IllegalParamISIException {
		System.out.println("Je teste la methode factoriel.");
		assertEquals(24, OperationMathematique.factoriel(4));
	}
	@Test
	void testFactorielNegatif() {
		System.out.println("Je teste la methode factoriel négatif.");
	    assertThrows(IllegalParamISIException.class, () -> OperationMathematique.factoriel(-3));
	}
	@Test
	void testTrier() {
		System.out.println("Je teste la methode tri décroissant.");
	    Integer[] data = {3, 1, 5, 2};
	    Integer[] expected = {5, 3, 2, 1};
	    assertArrayEquals(expected, OperationMathematique.trier(data));
	}


}
