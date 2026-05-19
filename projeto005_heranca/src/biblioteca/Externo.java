package biblioteca;

import java.util.Random;

public class Externo extends Usuario{

    public Externo(String matricula, String nome, String email) {
        super(matricula, nome, email);
    }

    @Override
    public boolean autentica() {
        Random rnd = new Random();
        double sorteado = rnd.nextDouble();
        System.out.println("Sorteado " + sorteado);
        if (sorteado<0.5){
            return true;
        }else{
            return false;
        }
        
    }
    
}
