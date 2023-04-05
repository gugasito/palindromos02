package org.example;

public class Main {
    public static boolean palindromo(String cadena1) {
        String cadena2 = "";
        for (int i = cadena1.length() - 1; i >= 0; i--) {
            char letra = cadena1.charAt(i);
            cadena2 = cadena2 + letra;
        }
        System.out.println(cadena2);
        boolean palindromo = cadena1.equals(cadena2);
        System.out.println(palindromo);
        return palindromo;
    }
}