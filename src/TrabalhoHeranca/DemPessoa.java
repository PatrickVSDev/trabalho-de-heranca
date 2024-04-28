package TrabalhoHeranca;

import java.util.Scanner;

public class DemPessoa {

    public static boolean checkLetters(String str)
    {
        return str.matches("[a-zA-Z]+");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome = null;
        String dataNascimento;
        String cpf;
        String disciplinaMatriculada;
        String disciplinaLecionada;
        String linhaDePesquisa;
        float salarioHora;
        float horasTrabalhadas;
        float salario;
        float bonusSalario;
        boolean stop = true;


        while (stop){
            System.out.println("Qual o nome do aluno?");
            nome = sc.nextLine();

            if (checkLetters(nome)) {
                stop = false;
            } else {
                System.out.println("Neste campo não é permitido números. Tente Novamente.");
            }
        }

        System.out.println("Qual a data de nascimento do aluno? (dd/mm/yyyy)");
        dataNascimento = sc.nextLine();

        System.out.println("Qual o cpf aluno?(Ex: 123.456.789.10)");
        cpf = sc.nextLine();

        System.out.println("Qual a matéria ele está matriculado?");
        disciplinaMatriculada = sc.nextLine();

        Estudante aluno = new Estudante(nome,dataNascimento,cpf,disciplinaMatriculada);

        stop = true;
        while (stop){
            System.out.println("Qual o nome do docente?");
            nome = sc.nextLine();

            if (checkLetters(nome)) {
                stop = false;
            } else {
                System.out.println("Neste campo não é permitido números. Tente Novamente.");
            }
        }

        System.out.println("Qual a data de nascimento do docente? (dd/mm/yyyy)");
        dataNascimento = sc.nextLine();

        System.out.println("Qual o cpf docente?(Ex: 123.456.789.10)");
        cpf = sc.nextLine();

        System.out.println("Qual a matéria lecionada por ele?");
        disciplinaLecionada = sc.nextLine();

        System.out.println("Quanto é o salário dele por hora?");
        salarioHora = sc.nextFloat();

        System.out.println("Quantas horas ele trabalha no mês?");
        horasTrabalhadas = sc.nextFloat();
        sc.nextLine();

        salario = salarioHora * horasTrabalhadas;

        Professor docente = new Professor(nome,dataNascimento,cpf,disciplinaLecionada,salario);

        stop = true;
        while (stop){
            System.out.println("Qual o nome do pesquisador?");
            nome = sc.nextLine();

            if (checkLetters(nome)) {
                stop = false;
            } else {
                System.out.println("Neste campo não é permitido números. Tente Novamente.");
            }
        }

        System.out.println("Qual a data de nascimento do pesquisador? (dd/mm/yyyy)");
        dataNascimento = sc.nextLine();

        System.out.println("Qual o cpf pesquisador?(Ex: 123.456.789.10)");
        cpf = sc.nextLine();

        System.out.println("Qual a linha de pesquisa dele?");
        linhaDePesquisa = sc.nextLine();

        System.out.println("Quanto é o salário dele por hora?");
        salarioHora = sc.nextFloat();

        System.out.println("Quantas horas ele trabalha no mês?");
        horasTrabalhadas = sc.nextFloat();
        sc.nextLine();

        System.out.println("Qual o seu bônus salárial mensal?");
        bonusSalario = sc.nextFloat();
        sc.nextLine();

        salario = (salarioHora * horasTrabalhadas) + bonusSalario;

        ProfessorPesquisador pesquisador = new ProfessorPesquisador(nome,dataNascimento,cpf,linhaDePesquisa,salario);

        aluno.printResultado();
        docente.printResultado();
        pesquisador.printResultado();
    }
}
