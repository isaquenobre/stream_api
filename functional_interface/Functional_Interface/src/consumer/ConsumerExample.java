/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Windows 10 PRO
 */
public class ConsumerExample {
    
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero %2 ==0){
                System.out.println(numero);
            }
        };
      numeros.stream().forEach(imprimirNumeroPar);
        
    }
    
}
