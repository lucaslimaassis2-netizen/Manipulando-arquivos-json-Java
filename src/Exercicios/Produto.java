package Exercicios;

public class Produto {
    private String nome;
    private double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
