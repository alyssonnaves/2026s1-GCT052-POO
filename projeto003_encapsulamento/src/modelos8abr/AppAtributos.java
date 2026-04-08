package modelos8abr;

public class AppAtributos {
    public static void main(String[] args) {
        System.out.println(Cliente.getQtd());
        Cliente obj1 = new Cliente("A");
        System.out.println(Cliente.getQtd());
        Cliente obj2 = new Cliente("B");
        System.out.println(Cliente.getQtd());
        Cliente obj3 = new Cliente("C");
        System.out.println(Cliente.getQtd());

        System.out.println(Integer.max(5, 7));
        System.out.println(Cliente.X);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.PI);
    }
}
