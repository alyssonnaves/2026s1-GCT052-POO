import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a idade: ");
        int idade = teclado.nextInt();
        System.out.println("_______________________");
        System.out.println("Bem-vindo " + nome);
        if (idade >= 18){
            System.out.println("maior de idade");
        }else{
            System.out.println("menor de idade");
        }
        teclado.close();
    }
    
}
