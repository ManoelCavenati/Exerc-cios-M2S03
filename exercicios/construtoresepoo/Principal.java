package exercicios.construtoresepoo;

public class Principal {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("João");

        Funcionario funcionario2 = new Funcionario("Maria", 3000.0f);

        System.out.println("Funcionário 1:");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário: R$" + funcionario1.getSalario());

        System.out.println("\nFuncionário 2:");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Salário: R$" + funcionario2.getSalario());

        funcionario1.aumentar(500.0f);

        System.out.println("\nNovo salário de " + funcionario1.getNome() + ": R$" + funcionario1.getSalario());
    }
}
