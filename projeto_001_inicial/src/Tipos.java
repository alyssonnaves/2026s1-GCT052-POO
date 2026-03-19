public class Tipos {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        int x = 2147483640;
        for (int i = 0; i < 10; i++) {
            x = x + 1;
            System.out.println(x);
        }
    }
}
