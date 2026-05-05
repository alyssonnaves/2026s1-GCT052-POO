package biblioteca;

public class Professor extends Usuario{
    private String departamento;

    public Professor(String matricula, String nome, String email) {
        super(matricula, nome, email);
        this.limiteEmprestimo = 5;
        setDepartamento("ICTIN");
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString()+"\ndepartamento: " + this.getDepartamento();
    }   
    
    
}
