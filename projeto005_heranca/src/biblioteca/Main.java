package biblioteca;

public class Main {
    public static void main(String[] args) {
        Usuario usuario001 = new Usuario("1234", "Ada Lovelace", "lovelace@email.com");
        Aluno aluno001 = new Aluno("Linus Torvalds", "564", "torvalds@email.com", "Engenharia de Software");
        System.out.println(aluno001);
        System.out.println(usuario001);
        // System.out.println(usuario001.toString());
        // System.out.println(aluno001.toString());  // aluno001.toString()
        // aluno001.toString("OLA MUNDO");


        // Usuario professor001 = new Professor("789", "Alan Turing", "turing@email.com");
        // System.out.println(professor001);
        
        
    }
}
