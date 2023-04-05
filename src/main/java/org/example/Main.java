package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String palabra;
        Scanner teclado = new Scanner(System.in);
        palabra = teclado.next();
        if (esPalindromo(palabra)==true){
            System.out.println("la palabra es un palindromo");
        }else{
            System.out.println("La palabra no es un palindromo");
        }


    }

    private static boolean esPalindromo(String palabra) {

        String resultado="";
        for (int i = 0; i < palabra.length(); i++) {
            resultado+=palabra.charAt(palabra.length()-1-i);
        }
        if(resultado.equals(palabra)){
            return true;
        }
        return false;
    }

}