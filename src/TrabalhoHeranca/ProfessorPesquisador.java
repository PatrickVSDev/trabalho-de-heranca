package TrabalhoHeranca;

public class ProfessorPesquisador extends Pessoa {

    private String linhaDePesquisa;
    private float salario;

    public ProfessorPesquisador(String nome, String dataNascimento, String cpf, String linhaDePesquisa, float salario) {
        super(nome, dataNascimento, cpf);
        this.linhaDePesquisa = linhaDePesquisa;
        this.salario = salario;
    }

    public String getLinhaDePesquisa() {
        return linhaDePesquisa;
    }

    public void setLinhaDePesquisa(String linhaDePesquisa) {
        this.linhaDePesquisa = linhaDePesquisa;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public void printResultado() {
        System.out.println("O nome do pesquisador é "+getNome());
        System.out.println("A sua data de nascimento é "+getDataNascimento());
        System.out.println("O seu CPF é: "+getCpf());
        System.out.println(getNome()+" tem a linha de pesquisa sobre: "+linhaDePesquisa);
        System.out.println("O seu sálario é R$: "+salario);
    }
}
