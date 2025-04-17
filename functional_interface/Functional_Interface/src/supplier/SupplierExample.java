/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Windows 10 PRO
 */
public class SupplierExample {
    public static void main(String[] args) {
        /*Supplier<String>saudacao = () -> "Olá, seja bem-vindo(a)";
        List<String>listaSaudacoes = (List<String>) Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());
        
        listaSaudacoes.forEach(s -> System.out.println(s));*/
        
        
        
   // Para entender como o Supplier funciona podemos fazer:
   /*Supplier<String>saudacao = () -> "Olá, seja bem-vindo(a)";
   
   List<String>listaSaudacoes = Stream.generate(
    new Supplier<String>(){
       @Override
       public String get() {
           return "Olá, seja bem-vindo(a)!";
       }
        
    }
   )
           .limit(5)
           .collect(Collectors.toList());
        listaSaudacoes.forEach(System.out::println);*/
   
   
   Supplier<String> saudacao = () ->"Olá, seja bem-vindo(a)!";
   
   List<String>listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo(a)!")
           .limit(5)
           .collect(Collectors.toList());
   
   listaSaudacoes.forEach(System.out::println);
   
    }
}
