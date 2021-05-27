/*

 */
package Examen_U3;

import java.util.Scanner;

/**
 * @author KAREN CECILIA CARO ESCUDERO :)
 */
public class Pruebas {
//CAMBIOS
    public static void main(String[] args) {
       //atributos
        double valor1;
        double valor2;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa los 2 valores para darte los resultados de: "
                + "\n suma"
                + "\n resta"
                + "\n multiplicaion"
                + "\n division");
        valor1=entrada.nextDouble();
        valor2=entrada.nextDouble();
        
    //suma
    Suma sum = new Suma(valor1, valor2);
    sum.mostrarResultado();
    
    //resta
    Resta rest = new Resta(valor1, valor2);
    rest.mostrarResultado();
    
    //Multiplicacion
    Multiplicacion mult = new Multiplicacion(valor1, valor2);
    mult.mostrarResultado();
    
    //division
    Division div = new Division(valor1, valor2);
    div.mostrarResultado();
  }
    
}
