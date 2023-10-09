import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        //Crear Scanner
        Scanner sc = new Scanner(System.in);

        //Declaración e Iniciación

        /*Ejercicio 1
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        */


        /*Ejercicio 2
        double [] numerosPrimos = {2,3,5,7,11,13,17,19,23,29};
        */


        /*Ejercicio 3
        int [][] matriz = new int[10][10];
        */


        /*Ejercicio 4
        double [][][] array3D = new double[10][10][10];
        */


        //Lectura y Escritura

        /*Ejercicio 1
        int [] numeros = new int[10];
        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese el número en la posición #" + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }
        */


        /*Ejercicio 2
        double [] numerosReales = new double[10];
        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese el número en la posición #" + (i+1) + ": ");
            numerosReales[i] = sc.nextDouble();
        }
        */


        /*Ejercicio 3
        String [] arrayCaracteres = {"Hola", "¿", "Como", "Estas", "?"};
        for (int i = 0; i < 5; i++){
            System.out.print(arrayCaracteres[i] + " ");
        }
        */


        /*Ejercicio 4
        boolean [] arrayBooleanos = {true, false, true, false};
        for (int i = 0; i < 4; i++){
            System.out.print(arrayBooleanos[i] + " ");
        }
        */


        //Operaciones Aritméticas

        /*Ejercicio 1
        int [] numeros = new int[10];
        int resultado = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese el número en la posición #" + (i+1) + ": ");
            numeros[i] = sc.nextInt();
            resultado += numeros[i];
        }

        System.out.print("El resultado de la suma de los elementos del array es: " + resultado);
        */


        /*Ejercicio 2
        int [] numeros = new int[10];
        int resultado = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese el número en la posición #" + (i+1) + ": ");
            numeros[i] = sc.nextInt();
            resultado *= numeros[i];
        }

        System.out.print("El resultado de la multiplicación de los elementos del array es: " + resultado);
        */


        /*Ejecicio 3
        int [] numeros = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese el número en la posición #" + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Array ordenado de Menor a Mayor:");
        for(int n : numeros){
            System.out.print("[" + n + "] ");
        }
        */


        /*Ejercicio 4
        String [] cadenas = new String[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese la cadena en la posición #" + (i+1) + ": ");
            cadenas[i] = sc.nextLine();
        }

        Arrays.sort(cadenas);

        System.out.println("Array ordenado Alfabéticamente:");
        for(String s : cadenas){
            System.out.print("[" + s + "] ");
        }
        */


        //Ejercicios Adicionales

        /*Ejercicio 1
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        int pares = 0;

        for (int i = 0; i < 10; i++){
            if (numeros[i] % 2 == 0){
                pares += 1;
            }
        }
        System.out.print("El total de números pares en el array es de: " + pares);
        */


        /*Ejercicio 2
        double [] numeros = {1.3, 2.5, 3,4, 5,6, 7.23, 8.1, 9.12, 10.0};
        int mayores = 0;

        for (int i = 0; i < 10; i++){
            if (numeros[i] > 10){
                mayores += 1;
            }
        }

        System.out.print("La cantidad de números mayores a 10 en el array es: " + mayores);
        */


        /*Ejercicio 3
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        int resultado = 0;

        for (int i = 0; i < 10; i++){
            if (numeros[i] % 3 == 0){
                resultado += numeros[i];
            }
        }
        System.out.print("La suma de los números que son múltiplos de 3 es: " + resultado);
        */


        /*Ejercicio 4
        int [] numeros = {1, 22, 3, 4, 54, 6, 7, 18, 9, 10};
        int numMayor = 0;

        for (int i = 0; i < 10; i++){
            if (numeros[i] > numMayor){
                numMayor = numeros[i];
            }
        }
        System.out.print("El número mayor es: " + numMayor);
        */


        /*Ejercicio 5
        int [] numeros = {12, 22, 3, 42, 54, 6, 7, 18, 9, 10};
        int numMenor = numeros[0];

        for (int i = 0; i < 10; i++){
            if (numeros[i] < numMenor){
                numMenor = numeros[i];
            }
        }
        System.out.print("El número mayor es: " + numMenor);
        */


        /*Ejercicio 6
        int [] numeros = {1, 22, 3, 4, 54, 6, 7, 18, 9, 10};
        int [] otroArray = new int[10];

        for (int i = 0; i < 10; i++){
            otroArray[i] = numeros[i];
        }

        System.out.println("Array Original");
        for (int i = 0; i < 10; i++){
            System.out.print("[" + numeros[i] + "] ");
        }

        System.out.println(" ");
        System.out.println("Nuevo Array");
        for (int j = 0; j < 10; j++){
            System.out.print("[" + otroArray[j] + "] ");
        }
        */
    }
}