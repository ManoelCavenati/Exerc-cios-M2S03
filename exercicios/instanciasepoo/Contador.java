package exercicios.instanciasepoo;

public class Contador {
    private String frase;

    public Contador(String frase) {
        this.frase = frase;
    }

    public int contarPalavras() {

        String[] palavras = frase.split("\\s+");
        return palavras.length;
    }
}
