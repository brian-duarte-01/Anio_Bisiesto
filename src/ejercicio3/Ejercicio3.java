// tarea 7 ejercicio 3 del curso de JAVA
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // declaracion de varibales
        int anio;
        //entrada de datos
        System.out.println("ingrese el año");
        anio = in.nextInt();
        //condicional IF ELSE
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }

}
