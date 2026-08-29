package HeavyDuty;

import java.util.List;

public class Rotinas {
    private String nome;
    private List<Exercicio> rotinas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRotinas(List<Exercicio> rotinas) {
        this.rotinas = rotinas;
    }

    @Override
    public String toString() {
        return "\n" + nome +
        rotinas;
    }
}