//Java Code..
//
// Código para calcular o valor de um n!

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        System.out.print("Informe o número: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        System.out.print("O fatorial de " + numero + " é " + fatorial);
        scanner.close();
    }
}
