package modelos14abr;

import java.time.LocalDate;
import java.time.Period;

public class DemoFuncionario {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2000, 2, 5);  // imutavel
        Funcionario func = new Funcionario(data);
        LocalDate novaData = data.plusDays(9);
        System.out.println(func.info());
        System.out.println(data);
        System.out.println(novaData);
        LocalDate hoje = LocalDate.now();
        int idade = Period.between(func.getNascimento(), hoje).getYears();
        System.out.println("IDADE: " + idade);
    }
}

