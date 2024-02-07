package com.roshka.bootcamp;

public class SumaSubarrayMasGrande {
    public static int maximoSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        boolean contiene_ceros = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                contiene_ceros = false;
            }
        }

        if (contiene_ceros != false) {
            return 0;
        }

        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int suma = 0;
                for (int k = i; k <= j; k++) {
                    suma += nums[k];
                }
                max = Math.max(max, suma);
            }
        }

        if (contiene_ceros) {
            return 0;
        } else
            return max;

    }
}
