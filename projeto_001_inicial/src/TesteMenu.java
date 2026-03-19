import java.util.Scanner;

public class TesteMenu {
    public static void menu(){
        System.out.println("-".repeat(10));
        System.out.println("1- Somar");
        System.out.println("2- Subtrair");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("0- Sair");
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        do{
            menu();
            System.out.println("Digite opcao:");
            opcao = input.nextInt();
            double numA=0, numB=0, resultado;
            // ifs ou swicth-case
            if (opcao >=1 && opcao <=4){
                System.out.println("Digite primeiro valor: ");
                numA = input.nextDouble();
                System.out.println("Digite segundo valor: ");
                numB = input.nextDouble();
            }
            if (opcao == 1){
                resultado = numA+numB;
                System.out.println("Resultado: "+ resultado);
            }else if(opcao == 2){
                resultado = numA-numB;
                System.out.println("Resultado: "+ resultado);
            }else if(opcao == 3){
                resultado = numA*numB;
                System.out.println("Resultado: "+ resultado);
            }else if (opcao == 4){
                while (numB == 0){
                    System.out.println("Denominador nao pode ser 0, digite novamente: ");
                    numB = input.nextDouble();
                }
                resultado = numA/numB;
                System.out.println("Resultado: "+ resultado);
            }else if (opcao!=0) {
                System.out.println("opcao invalida");
            }
        }while(opcao != 0);

        System.out.println("Programa encerrado");
    }    
}
