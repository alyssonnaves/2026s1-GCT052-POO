class ContaNova {
    // atributos
    int numero;
    // String dono; (retirar isso)
    double saldo;
    double limite;
    Cliente titular; // alteracoes

    // construtor
    ContaNova(int numero, Cliente titular){ // alteracoes
        this.numero = numero;
        if (this.titular != null){
            this.titular = titular; // alteracoes
        }else{
            // titulo veio null
            this.titular = new Cliente("cpf padrao");
        }
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

    String detalhe(){
        String output = "---Detalhes da conta---"+
                    "\nNumero: " + this.numero +
                    "\nSaldo: R$ "+ this.saldo +
                    "\nLimite: R$ " + this.limite + 
                    "\nDados do titular:\n"+
                    this.titular.info();
                    // "\nTitular: " + this.titular.nome+
                    // "\nCPF: " + this.titular.cpf;

        return output;
    }
}
