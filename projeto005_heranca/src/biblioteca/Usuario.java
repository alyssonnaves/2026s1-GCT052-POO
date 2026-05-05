package biblioteca;

public class Usuario {
    private String matricula;
    private String nome;
    private String email;
    protected int limiteEmprestimo; //  posso acessar na classe ou subclasse

    public Usuario(String matricula, String nome, String email){
        setNome(nome);
        setMatricula(matricula);
        setEmail(email);
        this.limiteEmprestimo = 2;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLimiteEmprestimo(){
        return limiteEmprestimo;
    }
    
    // sobreescrita
    @Override   // anotacao opcional
    public String toString(){
        return "matricula: " + getMatricula() +"\nnome: " + getNome() + "\nEmail: " + getEmail() + "\nlimite de emprestimo: " + getLimiteEmprestimo();
    }

}
