// import modelos.Conta;
import modelos.Cliente;
public class App {
    public static void main(String[] args) throws Exception {
        Conta contaCebolinha = new Conta();
        /* quebramos a regra de negocio e definimos valor de 
        limite negativo, pois os atributos de classe Conta 
        sao publicos
        */
        // depois que definimos os atributos como privados, 
        // nao conseguimos mais acessar
        // contaCebolinha.limite = -1_000_000; // -1000000  
        // contaCebolinha.nome = "Cebolinha";
        contaCebolinha.setNome("Cebolinha");
        contaCebolinha.setNumero(123);
        contaCebolinha.setSaldo(1000);
        contaCebolinha.setLimite(-2000);


        System.out.println("Acessar estado do objeto");
        int numConta = contaCebolinha.getNumero();
        System.out.println("CONTA: " + numConta);
        System.out.println("NOME: " + contaCebolinha.getNome());
        System.out.println("SALDO: R$ " + contaCebolinha.getSaldo());
        double limConta = contaCebolinha.getLimite();
        System.out.println("LIMITE: R$ " + limConta);
        
    }
}
