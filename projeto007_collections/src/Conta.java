import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Conta implements Comparable<Conta>{
    private int numero;
    private String titular;

    public Conta(int numero, String titular){
        this.numero = numero;
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "numero=" + numero + ", titular=" + titular;
    }

    @Override
    public int compareTo(Conta outraConta) {
        // return this.numero - outraConta.numero;
        return this.titular.compareTo(outraConta.titular);
    }
    
    public static void main(String[] args) {
        
        Conta conta1 = new Conta(5452, "Phillip Lahm");
        Conta conta2 = new Conta(1234, "Lucas Podolski");
        Conta conta3 = new Conta(3145, "Arne Friedrich");
        List<Conta> lista = new ArrayList<>();
        lista.add(conta1);
        lista.add(conta2);
        lista.add(conta3);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
    }
}
