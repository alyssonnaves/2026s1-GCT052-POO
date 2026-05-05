package biblioteca;

public class Aluno extends Usuario{
    private String curso;
    private int periodo;

    public Aluno(String nome, String matricula, String email, String curso){
        // chamada ao construtor da super classe - super()
        super(matricula, nome, email); // deve ser o primeiro comando do construtor
        this.curso = curso;
        this.periodo = 1;
        this.limiteEmprestimo = 3;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String toString(){
        return super.toString()+"\ncurso: " + getCurso() + "\nPeriodo: " + getPeriodo();        
    }

    


}
