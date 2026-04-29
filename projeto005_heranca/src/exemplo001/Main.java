package exemplo001;

public class Main {
    public static void main(String[] args) {
        SuperClasse objSuper = new SuperClasse(30,50);
        SubClasse objSub = new SubClasse(30,50,80);
        // objSuper.setSuperA(5);
        // objSuper.setSuperB(9);

        // objSub.setSubA(50);
        // objSub.setSuperA(6);
        // objSub.setSuperB(90);

        objSuper.info();
        
        objSub.info();
        
        
    }
}
