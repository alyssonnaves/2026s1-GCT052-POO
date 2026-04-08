package modelos8abr;

public class Conta {
    private Cliente titular;

    public Conta(Cliente titular){
        // this.titular = titular;
        this.titular = new Cliente(titular.getNome());

        
    }

    public Cliente getTitular(){
        return this.titular;
    }
}
