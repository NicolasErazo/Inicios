package ProgramaFinal;
import java.util.Scanner;
public class Ejercicio2 {
    int B, Array,Count;
    public void Primos(){

        while (true) {

            System.out.println("¡Ingrese el tamaño del arreglo!");
            Scanner entrada = new Scanner(System.in);
            Array = entrada.nextInt();

            if (Array > 0) {

                for (B = 2; B <= Array; B++) {

                    Count = 2;
                    boolean esPrimo = true;

                    while (esPrimo && Count < B) {

                        if (B % Count == 0) {

                            esPrimo = false;
                        } else {

                            Count++;
                        }
                    }
                    if (esPrimo) {
                        System.out.println(B + " Es un numero primo");
                    }
                }
            } else
                System.out.println("El numero ingresado no es correcto");
            break;
        }
    }
}
