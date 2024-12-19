// Java Code...
//
//Métodos e Delay..

public class MetodoEDelay {
    static void meuMetodo() {
        System.out.println("Executando...bip...bip");
    }

    static void metodoDois() {
        System.out.print("Programa executado! \nFinalizando Execução!");

    }

    public static void main(String[] args) throws InterruptedException {
        meuMetodo();
        Thread.sleep(1500);
        meuMetodo();
        Thread.sleep(1500);
        meuMetodo();
        Thread.sleep(1500);
        metodoDois();
    }
}
