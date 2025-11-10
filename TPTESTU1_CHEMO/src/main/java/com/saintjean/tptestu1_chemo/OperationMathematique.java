package com.saintjean.tptestu1_chemo;

import java.util.Arrays;
import java.util.Collections;

public class OperationMathematique {
	
	public static boolean estPositif(int nombre) {
        return nombre >= 0;
    }

	public static long factoriel(int nombre) {
        long res = 1;
        for (int i = 1; i <= nombre; i++) 
        	res *= i;
        return res;
    }
	
	public static Integer[] trier(Integer[] liste) {
	    Arrays.sort(liste, Collections.reverseOrder());
	    return liste;
	}
	
}
