package ConsultandoEndereco;

import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        Endereco local1 = new Endereco();
        System.out.println("Digite o CEP que deseja consultar: ");
        local1.setCep(leitura.nextLine());
        local1.buscando();

    }
}