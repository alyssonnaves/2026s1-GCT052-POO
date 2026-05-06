package biblioteca;

public class Aluno extends Usuario{
    private String curso;
    private int periodo;

    public Aluno(String nome, String matricula, String email, String curso){
        // chamada ao construtor da super classe - super()
        super(matricula, nome, email); // deve ser o primeiro comando do construtor
        this.curso = curso;
        this.periodo = 1;
        // this.limiteEmprestimo = 3;
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

    @Override
    protected void setLimiteEmprestimo(){
        System.out.println("setLimiteEmprestimo - Aluno");
        this.limiteEmprestimo = 3;
    }

    // sobrecarga
    public void toString(String valor){
        System.out.println("metodo 1");
        System.out.println(valor);
    }

    public void toString(String valor, int x){
        System.out.println("metodo 2");
        System.out.println(x);
        System.out.println(valor);
    }

    // sobrescrita - relacao de heranca
    @Override
    public String toString(){
        return super.toString()+"\ncurso: " + getCurso() + "\nPeriodo: " + getPeriodo();        
    }

    @Override
    public String tipo(){
        return "ALUNO";
    }


}
