package Exercicios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        try {
            System.out.println("Digite o nome do usuario: ");
            String username = leitura.nextLine();
            String url = "https://api.github.com/users/" + username;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException ("Mensagem Amigavel");
            }
        } catch (ErroConsultaGitHubException | IOException | InterruptedException e) {
            System.out.println(e.getMessage());

        }
    }
}
