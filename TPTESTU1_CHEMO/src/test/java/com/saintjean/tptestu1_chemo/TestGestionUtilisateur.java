package com.saintjean.tptestu1_chemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestGestionUtilisateur {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAjouter() throws EmailInvalidException {
		System.out.println("Test de la methode ajouter etudiant");
		Utilisateur u = new Utilisateur(1, "Anthony", 25, "anthony@mail.com", "699999999", "Douala", 50000);
        Utilisateur.ajouter(u);
        assertEquals(1, Utilisateur.lister().size());
	}

	@Test
	void testSupprimer() throws EmailInvalidException, SuppressionInvalidException {
		System.out.println("Test de la methode supprimer étudiant");
		 Utilisateur u = new Utilisateur(3, "Sara", 21, "sara@mail.com", "655555555", "Bafoussam", 30000);
	     Utilisateur.ajouter(u);
	     Utilisateur.supprimer(3);
	}

	@Test
	void testLister() {
	  System.out.println("Test de la methode lister étudiant");
	}

	@Test
	void testAfficher() {
		System.out.println("Test de la methode afficher étudiant");
	}

}
