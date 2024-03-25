package exercicios.classes;

public class Principal {
    public static void main(String[] args) {

        Empregado empregado = new Empregado("12345678910", "Manoel Cavenati", 30000D);

        System.out.println("Detalhes do empregado antes da promoção:");
        System.out.println("CPF: " + empregado.getCpf());
        System.out.println("Nome Completo: " + empregado.getNomeCompleto());
        System.out.println("Salário: R$ " + empregado.getSalario());

        empregado.promover(10);

        System.out.println("\nDetalhes do empregado após a promoção:");
        System.out.println("CPF: " + empregado.getCpf());
        System.out.println("Nome Completo: " + empregado.getNomeCompleto());
        System.out.println("Salário: R$ " + empregado.getSalario());
    }
}
