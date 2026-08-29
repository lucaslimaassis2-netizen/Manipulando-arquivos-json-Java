package HeavyDuty;

public class Exercicio {
    private String nome;
    private int quantidadeDeSeries;
    private double carga;
    private int repeticoes;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeDeSeries(int quantidadeDeSeries) {
        this.quantidadeDeSeries = quantidadeDeSeries;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    @Override
    public String toString() {
        return "\n[" + nome + "]"
                + " Series validas: " + quantidadeDeSeries
                + " Carga: " + carga
                + " Rep: " + repeticoes;
    }
}
