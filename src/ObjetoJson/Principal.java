package ObjetoJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {
        List<Titulo> listaDeTitulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting().create();

        Titulo filme1 = new Titulo("Matrix", 1999, 90);
        Titulo filme2 = new Titulo("Guerra do amanhã ", 2024, 120);

        listaDeTitulos.add(filme1);
        listaDeTitulos.add(filme2);

        String formatado = gson.toJson(listaDeTitulos);

        FileWriter escrita = new FileWriter("Filmes.json");
        escrita.write(formatado);
        escrita.close();
    }
}
