package modelos;

public class Cliente {
    private final String id;
    private String nome;

    public Cliente(String id, String nome){
        this.id = id;
        setNome(nome);
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome.toUpperCase();
        this.nome = nome;
    }

    // se final, nao pode atribuir valor fora do construtor
    // public void setId(String id){
    //     this.id = id;
    // }

    
}
