package biblioteca;

public class AppPolimorfismo {
    public static void cadastro(Usuario u){
        String nome = u.getNome();
        String email = u.getEmail();
        System.out.println("--"+u.tipo()+"--");
        System.out.println("nome\temail");
        System.out.println(nome+"\t"+email);
    }

    public static void permiteAcesso(Usuario u){
        if (u.autentica()){
            System.out.println("Acesso liberado");
        }else{
            System.out.println("Acesso negado");
        }
    }

    public static void main(String[] args) {
        // Usuario usuario = new Usuario("123","Fulano","fulano@email.com");
        Aluno aluno = new Aluno("Beltrano","234","beltrano@email.com","Eng. Software");
        Professor professor = new Professor("567","John Doe","johndoe@email.com");

        // cadastro(usuario);
        // cadastro(aluno);
        // cadastro(professor);
        permiteAcesso(aluno);
        permiteAcesso(professor);

        Externo externo = new Externo("111", "aaaa", "aaa@aaa");
        permiteAcesso(externo);


        
        
    }
    
}
