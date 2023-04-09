package org.example;

public class Main {

    public static boolean palindromo(String cadena1) {
        StringBuilder cadena2 = new StringBuilder();
        for (int i = cadena1.length() - 1; i >= 0; i--) {
            char letra = cadena1.charAt(i);
            cadena2.append(letra);
        }
        System.out.println(cadena2);
        boolean palindromo = cadena1.contentEquals(cadena2);
        System.out.println(palindromo);
        return palindromo;
    }
}