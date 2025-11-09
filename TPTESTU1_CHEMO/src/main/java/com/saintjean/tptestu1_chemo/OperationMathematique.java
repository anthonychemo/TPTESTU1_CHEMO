package com.saintjean.tptestu1_chemo;

public class OperationMathematique {
	
	public boolean estPositif(int nombre) {
        return nombre >= 0;
    }

	public long factoriel(int nombre) {
        long res = 1;
        for (int i = 1; i <= nombre; i++) 
        	res *= i;
        return res;
    }
}
