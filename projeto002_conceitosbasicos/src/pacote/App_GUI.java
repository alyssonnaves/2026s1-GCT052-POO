package pacote;
import javax.swing.JOptionPane;

public class App_GUI {
    public static void extrato_padronizado(Conta obj){
        String extrato = "---Extrato---\n"+
                        "Numero: " + obj.numero + "\n" +
                        "Titular: " + obj.dono + "\n" +
                        "Saldo: R$ " + obj.saldo + "\n" +
                        "Limite: R$ " + obj.limite + "\n" +
                        "-------------";
        JOptionPane.showMessageDialog(null, extrato);
    }

    public static void main(String[] args) {
        Conta c = new Conta(123, "Alan Turing");
        //c.saldo = 15000;  // nao funciona se saldo for privado
        c.limite = 3000;
        c.depositar(15000);
        JOptionPane.showMessageDialog(null, c.extrato());
        String valorStr = JOptionPane.showInputDialog("Valor do saque: R$");
        double valor = Double.parseDouble(valorStr); // converte de string pra double
        boolean ok = c.sacar(valor);
        if (ok){
            JOptionPane.showMessageDialog(null, "Saque de R$ " + valor + " realizado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
        //JOptionPane.showMessageDialog(null, c.extrato());
        extrato_padronizado(c);

    }
}
