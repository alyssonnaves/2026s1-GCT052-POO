public class TestePessoa {
    public static void main(String[] args) {
        Pessoa objeto1 = new Pessoa();
        objeto1.cumprimentar();
        objeto1.nome = "Jose";
        objeto1.cumprimentar();  
        
        Pessoa objeto2 = new Pessoa();
        objeto2.nome = "Josefina";
        objeto2.cumprimentar();
        objeto2 = objeto1;
        System.out.println("-------------------");
        System.out.println(objeto1);
        System.out.println(objeto2);
        objeto2.nome = "Ronaldinho Gaucho";
        objeto1.cumprimentar();

    }
}
