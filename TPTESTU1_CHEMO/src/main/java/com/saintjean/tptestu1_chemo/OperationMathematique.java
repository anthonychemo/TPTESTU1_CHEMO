package com.saintjean.tptestu1_chemo;

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
}
