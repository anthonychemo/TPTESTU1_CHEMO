package com.saintjean.tptestu1_chemo;

import java.util.Arrays;
import java.util.Collections;

public class OperationMathematique {
	
	public static boolean estPositif(int nombre) {
        return nombre >= 0;
    }

	public static long factoriel(int nombre) throws IllegalParamISIException {
		if (nombre < 0)
	        throw new IllegalParamISIException("Le factoriel d’un nombre négatif est impossible !");
        long res = 1;
        for (int i = 1; i <= nombre; i++) 
        	res *= i;
        return res;
    }
	
	public static Integer[] trier(Integer[] liste) {
	    Arrays.sort(liste, Collections.reverseOrder());
	    return liste;
	}
	
	public static double maxNumba(double[] valeurs) {
	    if (valeurs == null || valeurs.length == 0) {
	        throw new IllegalArgumentException("Le tableau ne doit pas être vide ou null !");
	    }
	    double max = valeurs[0];
	    for (double v : valeurs) {
	        if (v > max) {
	            max = v;
	        }
	    }
	    return max;
	}

	
}
