package com.roshka.bootcamp;

import java.util.*;
public class CuentaNumeros {

    public static List<Long> findAll(final int sumDigits, final int numDigits) {

        List<Long> numeros = new ArrayList<>();

        int x = 1, min = 0, cifra, suma = 0, aux = 0;

        do {
            x = x * 10;
            min = (int) (Math.log10(x) + 1);
        } while (min < numDigits);

        int max = x * 10;

        int[] numerosx = new int[x];

        for (int i = x; i < max; i++) {
            aux = i;
            suma = 0;
            while (aux != 0) {
                cifra = aux % 10;
                suma = suma + cifra;
                aux = aux / 10;
            }
            if (suma == sumDigits) {
                numeros.add((long) i);
            }
        }

        List listaNumeros = new ArrayList<>();
        List listaOrdenada = new ArrayList<>();
        listaNumeros = nroOrdenado(numeros);
        if (listaNumeros.size() == 0) {
            return new ArrayList<>();
        }

        listaOrdenada.add((long) listaNumeros.size());
        listaOrdenada.add((Long) Collections.min(listaNumeros));
        listaOrdenada.add((Long) Collections.max(listaNumeros));

        for (int i = 0; i < listaOrdenada.size(); i++) {
            System.out.println(listaOrdenada.get(i));
        }
        return listaOrdenada;
    }

    public static List<Long> nroOrdenado(List<Long> listaDeNumeros) {
        List<Long> listaDeNumerosOrdenados = new ArrayList<>();

        for (int i = 0; i < listaDeNumeros.size(); i++) {
            boolean esNumeroDeseado = true;
            String strNumero = String.valueOf(listaDeNumeros.get(i));
            for (int j = 1; j < strNumero.length(); j++) {
                int valorNumerico = Character.getNumericValue(strNumero.charAt(j));
                int valorNumericoAnterior = Character.getNumericValue(strNumero.charAt(j - 1));
                if (valorNumerico < valorNumericoAnterior) {
                    esNumeroDeseado = false;
                }
            }
            if (esNumeroDeseado) {
                listaDeNumerosOrdenados.add(listaDeNumeros.get(i));
            }
        }

        return listaDeNumerosOrdenados;
    }
}



