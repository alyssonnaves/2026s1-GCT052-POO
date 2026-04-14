package modelos14abr;

import java.util.Date;

public class Pessoa {
    private Date nascimento;
    private static int id = 0; // id auto incremento
    private int idPessoa;

    public Pessoa(Date nascimento){
        this.idPessoa = ++id;
        // this.nascimento = nascimento;
        this.nascimento = new Date(nascimento.getTime()); // copia de seguranca
        
    }

    public Date getNascimento(){
        // return this.nascimento;
        return new Date(this.nascimento.getTime()); // devolve uma copia
    }
    public int getIdPessoa(){
        return this.idPessoa;
    }
    public String info(){
        return "idPessoa = " + getIdPessoa() + "\nNacimento: " + getNascimento();
    }
}
