package modelos;

public class Cliente {
    // atributos
    private String nome;
    private String cpf;
    private String dataNascimento;
    private Endereco end;

    // metodos de acesso - modificadores e acessadores
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Endereco getEnd() {
        return end;
    }
    public void setEnd(Endereco end) {
        this.end = end;
    }
}

class Endereco{
    String rua;
    String bairro;
    int numero;

    String getRua(){
        return rua;
    }

    void setRua(String r){
        this.rua = r;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
}