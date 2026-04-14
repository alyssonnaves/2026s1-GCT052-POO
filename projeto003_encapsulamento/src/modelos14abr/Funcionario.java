package modelos14abr;

import java.time.LocalDate;

public class Funcionario {
   private static int id = 0;
   private LocalDate nascimento;
   private int idFuncionario; 

   public Funcionario(LocalDate nascimento){
        this.nascimento = nascimento;  // LocalDate ja protege (imutavel por referencia)
        this.idFuncionario = ++id;
   }

   public LocalDate getNascimento(){
        return this.nascimento;
   }

   public String info(){
        return "idFuncionario = " + idFuncionario + 
                "\nNascimento " + getNascimento();
   }
}
