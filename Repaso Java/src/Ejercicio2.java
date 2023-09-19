import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Crear Scanner
        Scanner sc = new Scanner(System.in);

        //Programa Java para comprobar si un número entero de tres cifras es capicúa.
        System.out.println("Bienvenido, a continuación ingrese un número Entero de 3 cifras");
        int num;

        System.out.print("Ingrese un Número (3 cifras): ");
        num = sc.nextInt();

        if (num >= 100 && num <= 999) {
            int primeraC, terceraC;

            primeraC = num/100;
            terceraC = num%10;

            if (primeraC == terceraC) {
                System.out.print("El número " + num + " ES capicúa");
            }
            else {
                System.out.print("El número " + num + " NO es caícúa");
            }
        }
        else {
            System.out.print("El número " + num + " NO tiene 3 cifras");
        }

    }
}