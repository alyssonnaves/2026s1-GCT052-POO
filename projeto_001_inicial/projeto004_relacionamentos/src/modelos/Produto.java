package modelos;

public class Produto {
    // atributos
    private String sku;
    private String nome;
    private double preco;

    // construtor
    public Produto(String sku){
        setSku(sku);
        setNome(nome);
        setPreco(preco);        
    }    

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        if (preco < 0){ // regra de negocio
            throw new IllegalArgumentException("preco < 0");
        }
        this.preco = preco;
    }

    private void setSku(String sku){
        //  poderiamos incluir uma consulta na base de dados pra verificar
        // unicidade deste sku
        if (sku == null || sku.isBlank()){
            throw new IllegalArgumentException("sku vazio ou nulo");
        }        
        this.sku = sku;
    }

    public String getSku() {
        return sku;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }   
}