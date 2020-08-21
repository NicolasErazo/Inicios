package ProgramaFinal;

import java.util.Scanner;

public class Ejercicio3 {
    int Inicio,Fin;
    String Palabra;
    public void Palindromos(){

        System.out.println("¡Ingrese palabra de comprobacion!");
        Scanner Scan = new Scanner(System.in);
        Palabra = Scan.nextLine();
        System.out.println("Usted eligio la palabra " + Palabra);

        Inicio = 0;
        Fin = Palabra.length() - 1;
        boolean bError = false;

        while ((Inicio < Fin) && (!bError)) {
            while ((Inicio < Fin) && (!bError)) {

                if (Palabra.charAt(Inicio) == Palabra.charAt(Fin)) {
                    Inicio++;
                    Fin--;
                } else {
                    bError = true;
                }
            }
            if (!bError)
                System.out.println(Palabra + " es un PALINDROMO");
            else
                System.out.println(Palabra + " NO es un palindromo");
        }
    }
    }

