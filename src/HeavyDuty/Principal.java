package HeavyDuty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        List<Rotinas> rotinasSalvas = new ArrayList<>();

        System.out.println("CRIADOR DE ROTINAS");
        int opcao = 0;
        while (true) {
            System.out.println("""
                    [1] CRIAR NOVA ROTINA
                    [2] MOSTRAR ROTINAS
                    """);
            opcao = leitura.nextInt();
            leitura.nextLine();
            if (opcao == 1) {
                List<Exercicio> lista = new ArrayList<>();
                int resp = 1;

                while (resp == 1 ) {
                    Exercicio exercicio = new Exercicio();
                    System.out.println("Digite o nome que deseja salvar o exercicio");
                    exercicio.setNome(leitura.nextLine());
                    System.out.println("Series validas");
                    exercicio.setQuantidadeDeSeries(leitura.nextInt());
                    System.out.println("Carga utilizada");
                    exercicio.setCarga(leitura.nextDouble());
                    System.out.println("reps realizadas");
                    exercicio.setRepeticoes(leitura.nextInt());
                    leitura.nextLine();
                    lista.add(exercicio);
                    System.out.println("EXERCICIO ADCIONADO COM SUCESSO");
                    System.out.println("----------------------------");
                    System.out.println("""
                            Adcionar novo exercicio:
                            [1] Sim
                            [2] Não""");
                    resp = leitura.nextInt();
                    leitura.nextLine();
                    if (resp == 2) {
                        Rotinas rotina = new Rotinas();
                        System.out.println("Nome que deseja salvar essa rotina");
                        rotina.setNome(leitura.nextLine());
                        rotina.setRotinas(lista);
                        rotinasSalvas.add(rotina);
                        System.out.println("ROTINA CRIADA COM SUCESSO");
                        break;
                    }
                }
            }
            if (opcao == 2) {
                System.out.println(rotinasSalvas);
            }
        }
    }
}
