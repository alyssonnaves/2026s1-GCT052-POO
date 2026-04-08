package modelos7abr;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    
    public void depositar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor incorreto");
        }
        this.saldo += valor;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}