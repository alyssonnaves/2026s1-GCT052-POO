package modelos8abr;

public class AppReferenciaExterna{
    public static void main(String[] args) {
        Cliente cli = new Cliente("A");
        Conta cc = new Conta(cli);
        String nome = cc.getTitular().getNome();
        System.out.println("---antes---");
        System.out.println(nome);
        System.out.println("--alterar--");
        cli.setNome("B");
        
        nome = cc.getTitular().getNome();
        System.out.println("---depois---");
        System.out.println(nome);
        
    }
}