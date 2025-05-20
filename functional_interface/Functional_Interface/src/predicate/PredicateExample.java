/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Windows 10 PRO
 */
public class PredicateExample {
    public static void main(String[] args) {
        /*List<String> palavras = Arrays.asList("java","kotlin", "python", "javascript","c","go","ruby");
        
        Predicate <String> maisDeCincoCaracteres = palavra->palavra.length()>5;
        
        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);*/
        
        //entendendo a logica do codigo
        
        /*List<String> palavras = Arrays.asList("java","kotlin", "python", "javascript","c","go","ruby");
        
        Predicate <String> maisDeCincoCaracteres = palavra->palavra.length()>5;
        
        palavras.stream()
                .filter(cd
                         new Predicate<String>(){
            @Override
            public boolean test(String p) {
                return p.length()>5;
                
            }
                         }                 
                )
              .forEach(System.out::println);*/
        
        
        // com o lambda
        
        List<String> palavras = Arrays.asList("java","kotlin", "python", "javascript","c","go","ruby");
        
        Predicate <String> maisDeCincoCaracteres = palavra->palavra.length()>5;
        
        palavras.stream()
                .filter(p -> p.length()>5)
              .forEach(System.out::println);
                
                
    }
    
}
