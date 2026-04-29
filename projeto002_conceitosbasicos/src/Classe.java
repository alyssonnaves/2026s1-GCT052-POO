public class Classe {  
    private boolean ativo;
    private int idade;
    public Classe() {
        this.ativo = true;
        System.out.println("Construtor padrao da classe Classe");
    }

    public Classe(int x) {
        this(); // chamada construtor Classe()
        this.idade = x;
        System.out.println("Construtor com parametro da classe Classe: " + x);
    }

    public Classe(int x, int y){
        this(x); // chamada construtor Classe(int x)
        System.out.println("Construtor com x e y");
    }

    public void cumprimento(){
        System.out.println("Ola");
    }

    public void cumprimento(String idioma){
        if (idioma.equals("en")){  // idioma == "en"
            System.out.println("Hi");
        } 
    }

    @Override
    public String toString(){
        return "objeto\nativo: " + ativo + "\nidade: " + idade;
    }

    public static void main(String[] args) {
        Classe c1 = new Classe();
        System.out.println("-------------");
        Classe c2 = new Classe(10);

        c2.cumprimento();
        c2.cumprimento("en");


        // System.out.println(c2);
        // System.out.println(c2.toString());
    }
}
