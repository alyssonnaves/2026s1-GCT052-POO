public class Aluno extends Usuario {
    private String matricula;
    public Aluno(String nome, String matricula){
        super(nome);  // chamada ao construtor da classe mae
        this.matricula = matricula;
    }

    // implementacao do metodo abstrato
    @Override
    public int limiteEmprestimos(){
        return 3;
    }
}
