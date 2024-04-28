package TrabalhoHeranca;

public class Professor extends Pessoa {

    private String disciplinaLecionada;
    private float salario;

    public Professor(String nome, String dataNascimento, String cpf, String disciplinaLecionada, float salario) {
        super(nome, dataNascimento, cpf);
        this.disciplinaLecionada = disciplinaLecionada;
        this.salario = salario;
    }

    public String getDisciplinaLecionada() {
        return disciplinaLecionada;
    }

    public void setDisciplinaLecionada(String disciplinaLecionada) {
        this.disciplinaLecionada = disciplinaLecionada;
    }

    @Override
    public void printResultado() {
        System.out.println("O nome do docente é "+getNome());
        System.out.println("A sua data de nascimento é "+getDataNascimento());
        System.out.println("O seu CPF é: "+getCpf());
        System.out.println(getNome()+" leciona a disciplina de: "+disciplinaLecionada);
        System.out.println("O seu sálario é R$: "+salario);
        System.out.println();
    }
}
