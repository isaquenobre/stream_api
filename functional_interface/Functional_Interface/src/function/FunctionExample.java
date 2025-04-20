/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 *
 * @author Windows 10 PRO
 */

//terceira aula sobre function interface - aula 103 das anotações
public class FunctionExample {
    public static void main(String[] args) {
        /*List <Integer> numeros = Arrays.asList(1,2,3,4,5);
        
        Function<Integer, Integer> dobrar = numero -> numero * 2;
        
        List<Integer> numerosDobrados = numeros.stream()
         .map(dobrar)
         .collect(Collectors.toList());

//numerosDobrados.forEach(n -> System.out.println(n)); tanto essa forma quanto a debaixo funcionam do mesmo jeito
numerosDobrados.forEach(System.out::println); //method reference*/



// Entendendo a function

/*List <Integer> numeros = Arrays.asList(1,2,3,4,5);
        
        Function<Integer, Integer> dobrar = numero -> numero * 2;
        
        List<Integer> numerosDobrados = numeros.stream()
         
                .map(
                        
                        new Function<Integer, Integer>() {
    @Override
    public Integer apply(Integer t) {
        return t * 2;  
    }
}
                )
                .collect(Collectors.toList());
        
        
        
        numerosDobrados.forEach(System.out::println);*/





// usando a função lambda
List <Integer> numeros = Arrays.asList(1,2,3,4,5);
        
        Function<Integer, Integer> dobrar = numero -> numero * 2;
        
        List<Integer> numerosDobrados = numeros.stream()
         
                .map(n->n*2)
                .collect(Collectors.toList());
        
        numerosDobrados.forEach(System.out::println);


    }

   
}

