package Exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Principal {
    static void main(String[] args) {
        double limiteCartao = 0;
        Scanner leitura = new Scanner(System.in);
        List<Produto> listaDeCompras = new ArrayList<>();
        System.out.println("Digite o limite o cartão: ");
        limiteCartao = leitura.nextDouble();
        leitura.nextLine();
        System.out.println("LISTA DE COMPRAS");
        System.out.println("///////////////////////////////////");
        int escolha = 1;
        while (escolha == 1) {
            System.out.println("Digite o nome do produto:");
            String nome = leitura.nextLine();
            System.out.println("Digite agora o preço do produto:");
            double valor = leitura.nextDouble();
            leitura.nextLine();
            if (limiteCartao >= valor){
                limiteCartao -= valor;
            } else {
                System.out.println("Saldo inssuficiente, finalizando sua compra!!");
                break;
            }
            Produto produto1 = new Produto(nome, valor);
            listaDeCompras.add(produto1);
            System.out.println("Produto Adcionado com sucesso!!");
            System.out.println("Se deseja adcionar um novo produto [DIGITE 1]");
            escolha = leitura.nextInt();
            leitura.nextLine();
        }
        listaDeCompras.sort(Comparator.comparing(Produto::getValor));
        System.out.println("Lista: " + listaDeCompras);
        System.out.println("Disponivel ainda no limite do cartão " + limiteCartao);
    }
}
