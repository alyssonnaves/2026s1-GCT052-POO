package exemplo001;

public class SuperClasse {
    protected int superA; 
    // permite que a propria ou suas filhas acesse o atributo
    private int superB;

    // construtor
    public SuperClasse(int a, int b){
        setSuperA(a);
        setSuperB(b);
    }

    public int getSuperA() {
        return superA;
    }

    public void setSuperA(int superA) {
        this.superA = superA;
    }
    public int getSuperB() {
        return superB;
    }
    public void setSuperB(int superB) {
        this.superB = superB;
    }

    public void info(){
        System.out.println("----SUPER CLASSE----");
        System.out.println("superA: " + getSuperA());
        System.out.println("superB: " + getSuperB());
    }
    
}
