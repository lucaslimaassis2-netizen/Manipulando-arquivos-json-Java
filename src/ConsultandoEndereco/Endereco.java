package ConsultandoEndereco;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Endereco {
    private String cep;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void buscando() {
        try {
            String url = "https://viacep.com.br/ws/" + cep + "/json/";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            if (response.body().contains("Http 400</h1>"))
                throw new IOException("Endereço inexistente");

            FileWriter escrita = new FileWriter("endereço.json");
            escrita.write(response.body());
            escrita.close();

        } catch (IOException e) {
            System.out.println(e);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
