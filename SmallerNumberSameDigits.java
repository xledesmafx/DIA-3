package com.roshka.bootcamp;

import java.sql.SQLOutput;
import java.util.Arrays;

import static java.lang.System.*;


public class SmallerNumberSameDigits {
    public static long nextSmaller(long n) {
        char[] digitos = String.valueOf(n).toCharArray();
        int i = digitos.length - 1;

        while (i > 0 && digitos[i - 1] <= digitos[i]) {
            i--;
        }
        if (i == 0 || digitos[i - 1] == '0') {
            return -1;
        }

        int j = digitos.length - 1;
        while (digitos[j] >= digitos[i - 1]) {
            j--;
        }

        // se intercambia los digitos
        char temp = digitos[i - 1];
        digitos[i - 1] = digitos[j];
        digitos[j] = temp;

        // Ordena los dígitos de la derecha en orden descendente
        Arrays.sort(digitos, i, digitos.length);

        for (int k = i, l = digitos.length - 1; k < l; k++, l--) {
            char tmp = digitos[k];
            digitos[k] = digitos[l];
            digitos[l] = tmp;
        }

        int resultado = Integer.parseInt(new String(digitos));

        // Si el resultado comienza con cero, devuelve -1
        if (String.valueOf(resultado).length() != String.valueOf(n).length()) {
            return -1;
        }

        return resultado;
    }
}
