package modelos14abr;

import java.util.Date;

public class DemoBug {
    public static void main(String[] args) {
        Date dataNascimento = new Date();  // data de agora!!!
        Date outraData = new Date(100, 0, 1);
        Pessoa obj1 = new Pessoa(outraData);
        System.out.println(obj1.info());
        Date nascimentoAlterada = obj1.getNascimento();
        nascimentoAlterada.setMonth(10);
        System.out.println(obj1.info());
        outraData.setDate(14);
        System.out.println(obj1.info());
    }
}
