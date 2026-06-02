public class Professor extends Usuario {
    String departamento;

    public Professor(String nome, String departamento) {
        super(nome);
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return departamento;
    }

    @Override
    public int limiteEmprestimos() {
        return 5;
    }
    
}
