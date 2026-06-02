import java.util.LinkedList;
import java.util.List;

public class App {

    public static void relatorio(List<Usuario> lista){
        for (Usuario user : lista) {
            System.out.println("-----------------------------");
            System.out.println(user.getClass());
            System.out.println("Nome: " + user.getNome());
            System.out.println("Limite: " + user.limiteEmprestimos());
        }
    }
    public static void main(String[] args) throws Exception {
        List<Usuario> usuarios = new LinkedList<Usuario>();
        Usuario aluno1 = new Aluno("Linus Torvalds", "001");
        usuarios.add(aluno1);
        Aluno aluno2 = new Aluno("Tim Berners-Lee", "020");
        usuarios.add(aluno2);
        usuarios.add(new Aluno("Nivio Ziviani", "030"));
        usuarios.add(new Professor("Ada Lovelace", "Computacao"));
        relatorio(usuarios);
        System.out.println("==================================");
        Exemplar livro = new Exemplar("POO em Java");
        Exemplar livro2 = new Exemplar("Aprendendo fazer arroz soltinho");
        ServicoEmprestimo.emprestar(livro);
        ServicoEmprestimo.emprestar(livro);
        ServicoEmprestimo.emprestar(livro2);
        ServicoEmprestimo.devolver(livro);
        ServicoEmprestimo.devolver(livro);

        Notebook notebook1 =  new Notebook("Dell");
        ServicoEmprestimo.emprestar(notebook1);
        
        
    }
}
