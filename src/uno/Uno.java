/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;
import java.util.Scanner;

/**
 *
 * @author marcelino
 */
public class Uno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        System.out.println("Cesun");
        
        //Ejercicio 1 Factorial//
        
        int numero = 0;
        int factorial = 1;
        
        System.out.println("Dame Un Numero");
        Scanner leer = new Scanner(System.in);
        numero = leer.nextInt();
        
        for (int i = 1; i < numero; i++) {
            factorial += factorial * i;
        }
        
        System.out.println(factorial);
        
        // Ejercicio 2 Dado un numero N imprimir su tabla de multiplciar//
        
        numero = 0;
        int multiplicacion = 0;
        System.out.println("Dama N Para Mostrar Tabla de Multiplicar");
        numero = leer.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            multiplicacion = numero * i;
            System.out.println(numero + " X " + i + " = " + multiplicacion);
        }
        
        // Ejercicio 3 Obtener el valor absoluto de un numero
        numero = 0;
        int absoluto = 0;
        System.out.println("Dame un numero");
        numero = leer.nextInt();
        
        if (numero > 0)
        {
            System.out.println(numero);
        }
        else{
            absoluto = numero * -1;
            System.out.println(absoluto);
        }
        
        //Ejercicio 4 Obtener el mayor y menor de 3 numeros dados//
        int a = 0;
        int b = 0;
        int c = 0;
        
        System.out.println("Dame a");
        a = leer.nextInt();
        System.out.println("Dame b");
        b = leer.nextInt();
        System.out.println("Dame c");
        c = leer.nextInt();
        
        
        //Sacar el mayor//
        if ( a > b && a > c ){
            System.out.println("El mayor es a = " + a);
        }
        
        if (b > a && b > c){
            System.out.println("El mayor es b = " + b);
        }
        
        if (c > a && c > b){
            System.out.println("El mayor es c = " + c);
        }
        
        //Sacar el menor//
        if ( a < b && a < c ){
            System.out.println("El menor es a = " + a);
        }
        
        if (b < a && b < c){
            System.out.println("El menor es b = " + b);
        }
        
        if (c < a && c < b){
            System.out.println("El menor es c = " + c);
        }
        
     
        
        
        //Ejercicio 5 Decir si un numero es par impar o cero//
        numero = 0;
        System.out.println("Dame un numero");
        numero = leer.nextInt();
        
        if(numero == 0){
            System.out.println("El numero es cero");
        }
        
        else if (numero % 2 == 0){
            System.out.println("El numero es par");
        }
        
        else if (numero % 2 != 0){
            System.out.println("El numero es impar");
        }
    }
    
}
