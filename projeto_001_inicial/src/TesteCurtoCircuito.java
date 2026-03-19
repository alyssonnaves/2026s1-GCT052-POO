public class TesteCurtoCircuito {
    public static void main(String[] args) {
        int x = 10, y = 0;

        if (y!=0 && (x/y)>1){
            System.out.println("OK");
        }else{
            System.out.println("y eh 0 ou entao x/y <= 1");
        }
    }
}
