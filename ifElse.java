// Java Code...
//
//Usando "?" e ":" no lugar de if-else.
// Usar somente em condições simples..

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();
        String resultado = (idade >= 18) ? "Maior de Idade!" : "Menor de Idade!";
        System.out.print(resultado);
        scanner.close();
    }
}
