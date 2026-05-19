package biblioteca;

import java.util.Scanner;

public class Professor extends Usuario{
    private String departamento;

    public Professor(String matricula, String nome, String email) {
        super(matricula, nome, email);
        // this.limiteEmprestimo = 5;
        setDepartamento("ICTIN");
    }

    @Override
    public boolean autentica(){
        Scanner input = new Scanner(System.in);
        String minuscula = getNome().toLowerCase();
        System.out.print("Digite sua senha: ");
        String senha = input.nextLine();
        input.close();
        if (senha.equals(minuscula)){ // senha==minuscula
            return true;
        }else{
            return false;
        }
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    protected void setLimiteEmprestimo(){
        System.out.println("setLimiteEmprestimo - Professor");
        this.limiteEmprestimo = 5;
    }

    @Override
    public String toString() {
        return super.toString()+"\ndepartamento: " + this.getDepartamento();
    }   
    
    @Override
    public String tipo(){
        return "PROFESSOR";
    }
    
}
