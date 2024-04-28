package TrabalhoHeranca;

public class Estudante extends Pessoa {

    private String disciplinaMatriculada;

    public Estudante(String nome, String dataNascimento, String cpf, String disciplinaMatriculada) {
        super(nome, dataNascimento, cpf);
        this.disciplinaMatriculada = disciplinaMatriculada;
    }

    public String getDisciplinaMatriculada() {
        return disciplinaMatriculada;
    }

    public void setDisciplinaMatriculada(String disciplinaMatriculada) {
        this.disciplinaMatriculada = disciplinaMatriculada;
    }

    @Override
    public void printResultado() {
        System.out.println("O nome do estudante é: "+getNome());
        System.out.println("A sua data de nascimento é: "+getDataNascimento());
        System.out.println("O seu CPF é: "+getCpf());
        System.out.println(getNome()+" está matriculado na disciplina de: "+getDisciplinaMatriculada()+" e está estudando!");
        System.out.println();
    }
}
