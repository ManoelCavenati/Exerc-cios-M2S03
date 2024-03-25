package exercicios.instanciasepoo;

public class Principal {
    public static void main(String[] args) {

        Contador contador = new Contador("Esta é uma frase de exemplo para testar o contador de palavras");

        int quantidadePalavras = contador.contarPalavras();

        System.out.println("A frase possui " + quantidadePalavras + " palavras.");
    }
}
