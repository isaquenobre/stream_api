/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 *
 * @author Windows 10 PRO
 */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        /*List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        
        BinaryOperator<Integer> somar = (num1,num2) -> num1 + num2;
        
        int resultado = numeros.stream()
                .reduce(0, somar);
        
        System.out.println("A soma dos numeros é: " + resultado);*/
        
         /*List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        
        BinaryOperator<Integer> somar = (num1,num2) -> num1 + num2;
        
        int resultado = numeros.stream()
                .reduce(0, new BinaryOperator<Integer>() {
             @Override
             public Integer apply(Integer n1, Integer n2) {
                 return n1+n2;
             }
                });
        
        System.out.println("A soma dos numeros é: " + resultado);*/
        
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        
        BinaryOperator<Integer> somar = (num1,num2) -> num1 + num2;
        
        int resultado = numeros.stream()
               // .reduce(0,(n1,n2)-> n1+n2); pode ser assim ou com o method reference
               //com method reference
                .reduce(0,Integer::sum);
        
        System.out.println("A soma dos numeros é: " + resultado);
    }
    
}
