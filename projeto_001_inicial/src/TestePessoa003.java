import javax.swing.JOptionPane;

public class TestePessoa003 {
    public static void main(String[] args) {
        // int listaNumeros[] = new int[5];

        Pessoa listaPessoa[] = new Pessoa[6];
        //for (int i = 0; i < 15; i++) {
        for(int i = 0; i < listaPessoa.length; i++){
            String n = JOptionPane.showInputDialog("Digite o nome: ");
            Pessoa obj = new Pessoa(n); //new Pessoa("Fulano_"+i);
            listaPessoa[i] = obj;
            System.out.println("posicao: " + i + " end: " + obj);
        }
        System.out.println("------------------------");
        for (int i = 0; i < listaPessoa.length; i++) {
            listaPessoa[i].cumprimentar();
        }
       
    }
}
