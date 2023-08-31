package entities;

import javax.print.attribute.standard.MediaSize;

public class Funcionario implements Comparable<Funcionario> {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }




    public String toString() {
        return this.nome + " => R$ " + String.format("%.2f", this.salario);
    }

    @Override
    public int compareTo(Funcionario outro) {
        return nome.compareTo(outro.getNome());
    }
}
