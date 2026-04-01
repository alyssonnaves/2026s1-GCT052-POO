package modelos;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    private double limite;

    // metodos de acesso
    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        // regra - se limite negativo, transforma em positivo
        if (limite < 0){
            limite *= -1;
        }

        this.limite = limite;
    }

    
}
