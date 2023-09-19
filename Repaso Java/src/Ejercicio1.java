import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Crear Scanner
        Scanner sc = new Scanner(System.in);

        //Programa Java para calcular si la última cifra de dos números enteros es la misma.
        System.out.println("Bienvenido, a continuación ingrese 2 números Enteros");
        int n1, n2;

        System.out.print("Ingrese el Primer Número: ");
        n1 = sc.nextInt();

        System.out.print("Ingrese el Segundo Núemero: ");
        n2 = sc.nextInt();

        if (n1 % 10 == n2 % 10) {
            System.out.println("La última cifra de " + n1 + " ES igual a la última cifra de " + n2);
        }
        else {
            System.out.print("La última cifra de " + n1 + " NO es igual a la última cifra de " + n2);
        }
    }
}