package pacote;

public class Conta {
    // atributos
    int numero;
    String dono;
    double saldo;
    public double limite;

    // construtor
    Conta(int numero, String nome){
        this.numero = numero;
        dono = nome;
    }

    // metodos
    void depositar(double valor){
        this.saldo += valor;
    }

    boolean sacar(double valor){
        if (valor <= this.saldo+this.limite){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    double extrato(){
        return saldo;
    }
}
