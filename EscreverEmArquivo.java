//Java Code...
//

import java.io.FileWriter;
import java.io.IOException;

public class EscreverEmArquivo {
    public static void main(String[] args) {
        try {
            FileWriter testeEscrita = new FileWriter("C:\\Users\\fabricio\\Desktop\\testearquivo.txt"); // Caminho até o
                                                                                                        // arquivo
            testeEscrita.write("Olá Mundo!"); // Conteúdo a ser escrito
            testeEscrita.close();
            System.out.print("Sucesso ao escrever no Arquivo!");
        } catch (IOException e) {
            System.out.print("Ocorreu um erro inesperado"); // Caso aconteça algo que não está programado no sistema ele
                                                            // exibira esta mensagem;
            e.printStackTrace();
        }
    }
}
