//Java Code..
//
//Verificar se uma palvra é palíndromo..
//Não consegui fazer com frases

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        System.out.print("Escreva uma palavra: ");
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.next();
        String palavra_reversa = "";

        for (int i = (palavra.length() - 1); i >= 0; i--) {
            palavra_reversa += palavra.charAt(i);
        }
        if (palavra_reversa.toLowerCase().equals(palavra.toLowerCase())) {
            System.out.print("É palíndromo!");
        } else {
            System.out.print("Não é palíndromo!");
            scanner.close();
        }
    }
}
