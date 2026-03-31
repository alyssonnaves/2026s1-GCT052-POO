public class App_Cliente {
    public static void main(String[] args) {
        Cliente anibal = new Cliente("Anibal", "Gamma", "28/02/1999", "000.123.456-78");
        ContaNova contaAnibal = new ContaNova(123, anibal);
        System.out.println(anibal);
        System.out.println(anibal.info());

        System.out.println(contaAnibal.titular);

        String infoAnibal = contaAnibal.titular.info();
        System.out.println(infoAnibal);

        System.out.println("------TESTE------");
        System.out.println(contaAnibal.detalhe());
        contaAnibal.depositar(2500.99);
        contaAnibal.limite = 1000;
        Cliente cebolinha = new Cliente("Cebolinha", "Cebola","01/01/2000","999.999.999-99");
        ContaNova contaCebolinha = new ContaNova(689, cebolinha);
        contaCebolinha.limite = 5000;
        contaCebolinha.depositar(6000.80);
        System.out.println("----cebolinha----");
        System.out.println(contaCebolinha.detalhe());
        System.out.println("---- anibal ----");
        System.out.println(contaAnibal.detalhe());
        
        Cliente gasparzinho = null;
        ContaNova contaFalhar = new ContaNova(524, gasparzinho);
        System.out.println(contaFalhar.detalhe());
        
    }
}
