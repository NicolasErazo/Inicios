package ProgramaFinal;

import java.util.Scanner;

public class Desarrollo {
    public static void main(String[] args) {
int Ejercicio,Decision;
boolean X = true;

        while (X) {

            System.out.println("¿Que ejercicio deseas ejecutar?");
            Scanner entrada = new Scanner(System.in);
            Ejercicio = entrada.nextInt();

            switch (Ejercicio){
                case 1:
                    Ejercicio1 Operacion = new Ejercicio1();
                    Operacion.ParImpar();
                    break;

                case 2:
                    Ejercicio2 Operacion2 = new Ejercicio2();
                    Operacion2.Primos();
                    break;

                case 3:
                    Ejercicio3 Operacion3 = new Ejercicio3();
                    Operacion3.Palindromos();
                    break;
            }

            System.out.println("¿Desea reiniciar el programa? Marque 1 para SI y 2 para NO");
            Scanner Scan = new Scanner(System.in);
            Decision = Scan.nextInt();
            if (Decision == 1) {
                X = true;

            } else {
                System.out.println("Gracias por utilizar el programa");
                X = false;
            }
        }
    }
}