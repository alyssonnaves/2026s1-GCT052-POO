package biblioteca;

public class Main {
    public static void main(String[] args) {
        Usuario usuario001 = new Usuario("1234", "Ada Lovelace", "lovelace@email.com");
        Aluno aluno001 = new Aluno("Linus Torvalds", "564", "torvalds@email.com", "Engenharia de Software");
        System.out.println("---USUARIO---");
        System.out.println(usuario001);
        // System.out.println(usuario001.toString());
        System.out.println("----ALUNO----");
        System.out.println(aluno001);
        
    }
}
