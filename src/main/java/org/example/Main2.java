package org.example;

public class Main2 {
    public static boolean esPalindromo(String cadena) {
        cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
                .replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
        String invertida = new StringBuilder(cadena).reverse().toString();
        return invertida.equals(cadena);
    }
}
