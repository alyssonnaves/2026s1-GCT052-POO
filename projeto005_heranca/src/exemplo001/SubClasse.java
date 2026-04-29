package exemplo001;

public class SubClasse extends SuperClasse {
    private int subA;

    public SubClasse(int a, int b, int c){
        super(a,b);
        setSubA(c);
    }
    public void setSuperA(int x){
        this.superA = x*100;
    }
    public int getSubA() {
        return subA;
    }

    public void setSubA(int subA) {
        this.subA = subA;
    }
    
    public void info(){
        System.out.println("-----SUB CLASSE-----");
        super.info();  // chamar info da super classe
        // System.out.println("SuperA: " + getSuperA());
        // System.out.println("SuperB: " + super.getSuperB());
        System.out.println("SubA: " + this.getSubA());
    }
}
