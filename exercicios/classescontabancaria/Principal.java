package exercicios.classescontabancaria;

public class Principal {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(12345, 6789, "Fulano de Tal", 1000.0);

        System.out.println("Informações da conta:");
        System.out.println("Número da Conta: " + conta.getNumeroDaConta());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Nome do Titular: " + conta.getNomeDoTitular());
        System.out.println("Saldo: R$" + conta.getSaldo());

        conta.depositar(500.0);
        System.out.println("Saldo após depósito: R$" + conta.getSaldo());

        conta.sacar(200.0);
        System.out.println("Saldo após saque: R$" + conta.getSaldo());

        conta.sacar(2000.0);
    }
}
