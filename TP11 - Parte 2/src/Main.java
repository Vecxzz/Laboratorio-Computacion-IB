import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        //Crear Scanner
        Scanner sc = new Scanner(System.in);

        /*Ejercicio 4
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < 20; i++){
            System.out.println("Ingrese un número: ");
            int numeros = sc.nextInt();
            listaNumeros.add(numeros);
        }

        System.out.println("Elementos de la lista: ");
        for (int numero : listaNumeros){
            System.out.println(numero);
        }

        int mayor = listaNumeros.get(0);
        for (int numero : listaNumeros){
            if (numero > mayor){
                mayor = numero;
            }
        }

        int menor = listaNumeros.get(0);
        for (int numero : listaNumeros){
            if (numero < menor){
                menor = numero;
            }
        }

        int rango = mayor - menor;

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("El rango es: " + rango);
        */



        /*Ejericicio 5
        Random random = new Random();

        ArrayList<Integer> numerosAleatorios = new ArrayList<>();

        int cantidadPares = 0;
        int suma = 0;

        for (int i = 0; i < 20; i++){
            int numero = 2 * random.nextInt(100) + 2;
            numerosAleatorios.add(numero);
            cantidadPares++;
            suma += numero;
        }

        double promedio = (double) suma / cantidadPares;
        System.out.println("El promedio aritmetico es: " + promedio);

        int iguales = 0;
        int mayores = 0;
        int menores = 0;

        for (int numero : numerosAleatorios){
            if (numero == promedio){
                iguales += 1;
            } else if (numero > promedio) {
                mayores += 1;
            } else if (numero < promedio) {
                menores += 1;
            }
        }

        System.out.println("Los numeros iguales al promedio son: " + iguales);
        System.out.println("Los numeros mayores al promedio son: " + mayores);
        System.out.println("Los números menores al promedio son: " + menores);
        */
    }
}