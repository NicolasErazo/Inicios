package ProgramaFinal;

public class Ejercicio1 {
    int A;
    public void ParImpar(){

        for (A = 1; A <= 100; A++)
            if (A % 2 == 0)
                System.out.println("El numero " + A + " es par ");
            else
                System.out.println("El numero " + A + " es impar ");
    }
}
