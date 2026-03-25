public class AppNum {
    public static void parametros(String... p){
        System.out.println(p);
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }
    public static void main(String[] args) {
        Num m = new Num();
        Num n = new Num();
        Num o = new Num();
        m.somar(10);
        n.somar(5);

        System.out.println("m---->i: " + m.i );
        System.out.println("n---->i: " + n.i );
        System.out.println("o---->i: " + o.i );

        m.somar(20);
        m.somar(30);
        System.out.println("m---->i: " + m.i );

        parametros();
        parametros("ooooo");
        parametros("ola", "mundo", "Java", "teste");
    }
}
