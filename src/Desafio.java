import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        System.out.println("*******************************************");
        System.out.println(" DADOS INICIAIS DO CLIENTE ");
        String nome = "Lucas Lima Assis";
        String conta = "Corrente";
        double saldo = 2500.00;
        String mensagem = ("""
                Nome:              %s
                Tipo de conta:     %s
                Saldo:             %.2f """).formatted(nome, conta, saldo);
        System.out.println(mensagem);
        System.out.println("*******************************************");
        int operacao = 0;
        Scanner leitura = new Scanner(System.in);
        while (operacao != 4) {
            System.out.println("""
                    [1]- Consultar saldo
                    [2]- Receber valor
                    [3]- Transferir valor
                    [4]- sair""");
            System.out.println("Digite a opção desejada: ");
            operacao = leitura.nextInt();
            if (operacao == 1) {
                System.out.println("O saldo atual é R$ " + saldo);
            } else if (operacao == 2) {
                System.out.println("Digite o valor que a conta vai receber: ");
                double receber = leitura.nextDouble();
                saldo += receber;
                System.out.println("Saldo atual atualizado para R$ " + saldo);
            } else if (operacao == 3) {
                System.out.println("Digite o valor que será transferido: ");
                double transferir = leitura.nextDouble();
                if (transferir <= saldo) {
                    saldo -= transferir;
                    System.out.println("Saldo atual atualizado para R$ " + saldo);
                } else {
                    System.out.println("Saldo insuficiente, não posso realizar esta operação");
                }
            } else {
                System.out.println("Opção invalida, tente novamente");
            }
        }
        System.out.println("Finalizando...");
    }
}