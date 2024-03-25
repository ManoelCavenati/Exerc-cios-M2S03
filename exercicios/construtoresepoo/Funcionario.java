package exercicios.construtoresepoo;

public class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentar(float valorAumento) {
        salario += valorAumento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
