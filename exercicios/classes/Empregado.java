package exercicios.classes;

public class Empregado {
    private String cpf;
    private String nomeCompleto;
    private double salario;

    public Empregado(String cpf, String nomeCompleto, double salario) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.salario = salario;
    }

    public void promover(float percentualAumento) {
        double aumento = this.salario * (percentualAumento / 100);
        this.salario += aumento;
        System.out.printf("Promoção aplicada: Salário aumentado em %.2f%% ", percentualAumento);
        System.out.printf("Novo salário: R$ %.2f", this.salario);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
