package ConsultandoEndereco;

import java.io.IOException;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        Endereco local1 = new Endereco();
        GravandoArquivo formatado = new GravandoArquivo();

        System.out.println("Digite o CEP que deseja consultar: ");
        local1.setCep(leitura.nextLine());
        try {
            local1.buscando();
            formatado.gravando(local1.getBody());
        } catch (RuntimeException | IOException e) {
            System.out.println("⚠️ Ops: " + e.getMessage());
        }
    }
}