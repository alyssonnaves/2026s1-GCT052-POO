public class Cliente {
    String nome;
    String sobrenome;
    String dataNascimento;
    String cpf;
    // construtor
    // serve pra inicializar atributos e definir parametros obrigatorios
    public Cliente(String nome, String sobrenome, String data, String doc){
        this.nome = nome;
        this.sobrenome = sobrenome;
        dataNascimento = data; 
        this.cpf = doc;
    }

    public Cliente(String cpf){
        this.cpf = cpf;
        this.nome = "Indefinido";  // opcional definir valores como default
        this.dataNascimento = "01/01/1900";
    }

    public String info(){
        String output = "Nome completo: " + this.nome + " " + this.sobrenome +"\n"+
                        "CPF: " + this.cpf +
                        "\nData de nascimento: " + this.dataNascimento;
        return output;
    }
}
