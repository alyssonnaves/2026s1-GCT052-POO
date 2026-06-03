import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List<String> nomes = new LinkedList<>();
        System.out.println(nomes);
        System.out.println(nomes.isEmpty());
        System.out.println(nomes.size());
        nomes.add("Alan Turing");
        System.out.println(nomes);
        System.out.println(nomes.isEmpty());
        System.out.println(nomes.size());

        nomes.add("Linus Torvalds");
        nomes.add("Ada Lovelace");
        nomes.add("Cormen");

        System.out.println(nomes);
        System.out.println("Posicao 3: " + nomes.get(3));
        nomes.add(2, "Chapolin Colorado");
        System.out.println(nomes);
        boolean estaPresente = nomes.contains("Chapolin Colorado");
        System.out.println("estaPresente? " + estaPresente);
        // percorrer a lista
        for (int i = 0; i < nomes.size(); i++) {
            String nome = nomes.get(i);
            System.out.println("Nome " + i + " " + nome);
        }
        System.out.println("-----");
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }
        nomes.remove("Chapolin Colorado");
        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);
        
    }
}
