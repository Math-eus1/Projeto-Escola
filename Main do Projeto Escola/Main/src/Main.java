import Projeto_Escola_Pasta.*;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static List<Aluno> alunos = new ArrayList<>();
    static List<Professor> professores = new ArrayList<>();
    static List<Diario> diarios = new ArrayList<>();

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\n=== SISTEMA ESCOLAR ===");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Criar Diário (Turma)");
            System.out.println("4 - Matricular Aluno no Diário");
            System.out.println("5 - Configurar Tipo de Média");
            System.out.println("6 - Exibir Diário");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> cadastrarAluno();
            }

        } while (opcao != 0);

    }

    static void cadastrarAluno() {
        Aluno a = new Aluno();

        System.out.print("Nome: ");
        a.setNome(sc.nextLine());

        System.out.print("Nascimento: ");
        a.setNascimento(sc.nextLine());

        System.out.print("Matrícula: ");
        a.setMatricula(sc.nextLine());

        alunos.add(a);
        System.out.println("Aluno cadastrado!");
    }

}
