package modelos7abr;

public class AppConta {
    public static void main(String[] args) {
        Conta cc = new Conta();
        try {
            cc.depositar(-500);
        } catch (Exception e) {
            System.out.println("Algo deu ruim");
        }
        // cc.setSaldo(0.5/0);
        cc.depositar(0.5/0);
        System.out.println(cc.getSaldo());
        
    }
}
