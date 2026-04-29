package pacote;

public class App {
    public static void main(String[] args) throws Exception {
        Conta c = new Conta(123, "Alan Turing");
        //c.saldo = 15000;  // nao funciona se saldo for privado
        c.limite = 3000;
        c.depositar(15000);
        System.out.println("numero: " + c.numero);
        System.out.println("dono da conta: " + c.dono);
        //System.out.println("Saldo: R$ " + c.saldo);
        System.out.println("Saldo: R$ " + c.extrato());
        boolean ok = c.sacar(18000.01);
        if (ok){
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Saldo (saldo+limite) insuficiente");
        }
        System.out.println("Saldo: R$ " + c.extrato());
        c = null;
        // chamar o garbage collector
        System.gc();  // isso eh feito automaticamente, nao  precisams preocupar
    }
}
