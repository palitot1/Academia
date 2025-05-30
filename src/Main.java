import Guia_academia.model.Aluno;
import Guia_academia.model.FichaTreino;
import Guia_academia.model.Plano;
import Guia_academia.service.AcademiaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AcademiaService service = new AcademiaService();

        int opcao;
        do {
            System.out.println("\n=== Sistema de Academia ===");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Plano ao Aluno");
            System.out.println("3. Criar Ficha de Treino");
            System.out.println("4. Consultar Aluno");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF do aluno: ");
                    String cpf = sc.nextLine();
                    service.cadastrarAluno(nome, cpf);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("CPF do aluno: ");
                    cpf = sc.nextLine();
                    System.out.print("Nome do plano: ");
                    String nomePlano = sc.nextLine();
                    System.out.print("Tipo do plano (Mensal, Anual): ");
                    String tipoPlano = sc.nextLine();
                    Plano plano = new Plano(nomePlano, tipoPlano, true);
                    service.atribuirPlano(cpf, plano);
                    System.out.println("Plano atribuído!");
                    break;

                case 3:
                    System.out.print("CPF do aluno: ");
                    cpf = sc.nextLine();
                    FichaTreino ficha = new FichaTreino();
                    String exercicio;
                    do {
                        System.out.print("Digite o exercício (ou 'sair' para finalizar): ");
                        exercicio = sc.nextLine();
                        if (!exercicio.equalsIgnoreCase("sair")) {
                            ficha.adicionarExercicio(exercicio);
                        }
                    } while (!exercicio.equalsIgnoreCase("sair"));
                    service.adicionarFicha(cpf, ficha);
                    System.out.println("Ficha de treino adicionada!");
                    break;

                case 4:
                    System.out.print("CPF do aluno: ");
                    cpf = sc.nextLine();
                    Aluno aluno = service.consultarAluno(cpf);
                    if (aluno != null) {
                        System.out.println("Nome: " + aluno.getNome());
                        System.out.println("Plano: " + (aluno.getPlano() != null ? aluno.getPlano().getNome() : "Nenhum"));
                        System.out.println("Ficha: " + (aluno.getFicha() != null ? aluno.getFicha().getExercicios() : "Nenhuma ficha cadastrada"));
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        sc.close();
    }
}
