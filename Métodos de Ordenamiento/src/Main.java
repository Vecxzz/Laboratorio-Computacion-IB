import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) {
        //Crear Scanner
        Scanner sc = new Scanner(System.in);

        /*Ejercicio 1
        int [] numeros = {4, 2, 6, 8, 3, 1, 7, 10, 5, 9};

        System.out.println("Array Desordenado");
        for (int i = 0; i < 10; i++){
            System.out.print("[" + numeros[i] + "] ");
        }
        System.out.println(" ");
        Arrays.sort(numeros);
        System.out.println("Array Ordenado");
        for (int n : numeros){
            System.out.print("[" + n + "] ");
        }
        */


        /*Ejercicio 2
        Integer [] numeros = {4, 2, 6, 8, 3, 1, 7, 10, 5, 9};

        System.out.println("Array Desordenado");
        for (int i = 0; i < 10; i++){
            System.out.print("[" + numeros[i] + "] ");
        }

        System.out.println(" ");
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println("Array Ordenado");
        for (int n : numeros){
            System.out.print("[" + n + "] ");
        }
        */


        /*Ejercicio 3
        double [] numeros = {4.4, 2.9, 6.12, 8.21, 3.11, 1.2, 7.8, 10.18, 5.5, 9.0};

        System.out.println("Array Desordenado");
        for (int i = 0; i < 10; i++){
            System.out.print("[" + numeros[i] + "] ");
        }
        System.out.println(" ");
        Arrays.sort(numeros);
        System.out.println("Array Ordenado");
        for (double n : numeros){
            System.out.print("[" + n + "] ");
        }
        */


        /*Ejercicio 4
        Double [] numeros = {4.4, 2.9, 6.12, 8.21, 3.11, 1.2, 7.8, 10.18, 5.5, 9.0};

        System.out.println("Array Desordenado");
        for (int i = 0; i < 10; i++){
            System.out.print("[" + numeros[i] + "] ");
        }

        System.out.println(" ");
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println("Array Ordenado");
        for (double n : numeros){
            System.out.print("[" + n + "] ");
        }
        */


        /*Ejercicio 5
        String [] nombres = {"Juan", "Martin", "Nicolas", "Alvaro", "Agustin", "Pedro", "Eduardo", "Gonzalo", "Ezequiel", "Cristian"};

        System.out.println("Array Desordenado");
        for (int i = 0; i < 10; i++){
            System.out.print("[" + nombres[i] + "] ");
        }

        System.out.println(" ");
        Arrays.sort(nombres);
        System.out.println("Array Ordenado");
        for (String s : nombres){
            System.out.print("[" + s + "] ");
        }
        */


        /*Ejercicio 6
        String [] nombres = {"Juan", "Martin", "Nicolas", "Alvaro", "Agustin", "Pedro", "Eduardo", "Gonzalo", "Ezequiel", "Cristian"};

        System.out.println("Array Desordenado");
        for (int i = 0; i < 10; i++){
            System.out.print("[" + nombres[i] + "] ");
        }

        System.out.println(" ");
        Arrays.sort(nombres, Collections.reverseOrder());
        System.out.println("Array Ordenado");
        for (String s : nombres){
            System.out.print("[" + s + "] ");
        }
        */


        /*Ejercicio 7
        System.out.print("Saltar");
        */


        /*Ejercicio 8
        System.out.print("Saltar");
        */


        /*Ejercicio 9
        int [] numeros = {4, 2, 6, 8, 3, 1, 7, 10, 5, 9};
        int i, j, aux;

        System.out.println("Array Desordenado");
        for (i = 0; i < 10; i++){
            System.out.print("[" + numeros[i] + "] ");
        }

        for (i = 0; i < numeros.length - 1; i++){
            for (j = 0; j < numeros.length - i - 1; j++){
                if (numeros[j] > numeros[j + 1]){
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Array Ordenado");
        for (int n : numeros){
        System.out.print("[" + n + "] ");
        }
        */


        /*Ejercicio 10
        int [] numeros = {4, 2, 6, 8, 3, 1, 7, 10, 5, 9};
        int i, j, menor, pos, tmp;

        System.out.println("Array Desordenado");
        for (i = 0; i < 10; i++){
            System.out.print("[" + numeros[i] + "] ");
        }

        for (i = 0; i < numeros.length - 1; i++){
            menor = numeros[i];
            pos = i;
            for (j = i + 1; j < numeros.length; j++){
                if (numeros[j] < menor){
                    menor = numeros[j];
                    pos = j;
                }
            }
            if (pos != i){
                tmp = numeros[i];
                numeros[i] = numeros[pos];
                numeros[pos] = tmp;
            }
        }
        System.out.println(" ");
        System.out.println("Array Ordenado");
        for (int n : numeros){
        System.out.print("[" + n + "] ");
        }
        */


        /*Ejercicio 11
        int [] numeros = {4, 2, 6, 8, 3, 1, 7, 10, 5, 9};
        int i, j, aux;

        System.out.println("Array Desordenado");
        for (i = 0; i < 10; i++){
            System.out.print("[" + numeros[i] + "] ");
        }

        for (i = 1; i < numeros.length; i++){
            aux = numeros[i];
            j = i - 1;
            while ((j >= 0) && (aux < numeros[j])){
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = aux;
        }
        System.out.println(" ");
        System.out.println("Array Ordenado");
        for (int n : numeros){
        System.out.print("[" + n + "] ");
        }
        */


        /*Ejercicio 13
        int [] numeros = {4, 2, 6, 8, 3, 1, 7, 10, 5, 9};
        int salto, aux, i;
        boolean cambios;

        System.out.println("Array Desordenado");
        for (i = 0; i < 10; i++){
            System.out.print("[" + numeros[i] + "] ");
        }

        for (salto = numeros.length / 2; salto != 0; salto /= 2){
            cambios = true;
            while (cambios){
                cambios = false;
                for (i = salto; i < numeros.length; i++){
                    if (numeros[i - salto] > numeros[i]){
                        aux = numeros[i];
                        numeros[i] = numeros[i - salto];
                        numeros[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
        System.out.println(" ");
        System.out.println("Array Ordenado");
        for (int n : numeros){
        System.out.print("[" + n + "] ");
        }
        */


        /*Ejercicio 14
        System.out.println("Bienvenido al Sistema");

        int [] valores = new int[20];

        for (int i = 0; i < 20; i++){
            System.out.print("Ingrese el Valor #" + (i+1) + ": ");
            valores[i] = sc.nextInt();
        }

        System.out.println("Desea ordenar el array de manera ASCENDENTE(1) o DESCENDENTE(2): ");
        int opcionUsuario = sc.nextInt();

        System.out.println("¿Con que método desea ordenar su array?");
        System.out.println("(1).Inserción   (2).Burbuja   (3).Selección");
        int metodo = sc.nextInt();

        System.out.println("Array Desordenado");
        for (int i = 0; i < 20; i++){
            System.out.print("[" + valores[i] + "] ");
        }

        if (opcionUsuario == 1){
            if (metodo == 1){
                int i, j, aux;

                for (i = 1; i < valores.length; i++){
                    aux = valores[i];
                    j = i - 1;
                    while ((j >= 0) && (aux < valores[j])){
                        valores[j + 1] = valores[j];
                        j--;
                    }
                    valores[j + 1] = aux;
                }
                System.out.println("Tu array ha sido ordenado con el método de Inserción");
                System.out.println(" ");
                System.out.println("Array Ordenado");
                for (int n : valores){
                    System.out.print("[" + n + "] ");
                }
            }
            else if (metodo == 2){
                int i, j, aux;

                for (i = 0; i < valores.length - 1; i++){
                    for (j = 0; j < valores.length - i - 1; j++){
                        if (valores[j] > valores[j + 1]){
                            aux = valores[j];
                            valores[j] = valores[j + 1];
                            valores[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Tu array ha sido ordenado con el método Burbuja");
                System.out.println(" ");
                System.out.println("Array Ordenado");
                for (int n : valores){
                    System.out.print("[" + n + "] ");
                }
            }
            else if (metodo == 3){
                int i, j, menor, pos, tmp;

                for (i = 0; i < valores.length - 1; i++){
                    menor = valores[i];
                    pos = i;
                    for (j = i + 1; j < valores.length; j++){
                        if (valores[j] < menor){
                            menor = valores[j];
                            pos = j;
                        }
                    }
                    if (pos != i){
                        tmp = valores[i];
                        valores[i] = valores[pos];
                        valores[pos] = tmp;
                    }
                }
                System.out.println("Tu array ha sido ordenado con el método de Selección");
                System.out.println(" ");
                System.out.println("Array Ordenado");
                for (int n : valores){
                    System.out.print("[" + n + "] ");
                }
            }
        }
        else if (opcionUsuario == 2){
            if (metodo == 1){
                int i, j, aux;

                for (i = 1; i < valores.length; i++){
                    aux = valores[i];
                    j = i - 1;
                    while ((j >= 0) && (aux > valores[j])){
                        valores[j + 1] = valores[j];
                        j--;
                    }
                    valores[j + 1] = aux;
                }
                System.out.println("Tu array ha sido ordenado con el método de Inserción");
                System.out.println(" ");
                System.out.println("Array Ordenado");
                for (int n : valores){
                    System.out.print("[" + n + "] ");
                }
            }
            else if (metodo == 2){
                int i, j, aux;

                for (i = 0; i < valores.length - 1; i++){
                    for (j = 0; j < valores.length - i - 1; j++){
                        if (valores[j] < valores[j + 1]){
                            aux = valores[j];
                            valores[j] = valores[j + 1];
                            valores[j + 1] = aux;
                        }
                    }
                }
                System.out.println("Tu array ha sido ordenado con el método Burbuja");
                System.out.println(" ");
                System.out.println("Array Ordenado");
                for (int n : valores){
                    System.out.print("[" + n + "] ");
                }
            }
            else if (metodo == 3){
                int i, j, menor, pos, tmp;

                for (i = 0; i < valores.length - 1; i++){
                    menor = valores[i];
                    pos = i;
                    for (j = i + 1; j < valores.length; j++){
                        if (valores[j] > menor){
                            menor = valores[j];
                            pos = j;
                        }
                    }
                    if (pos != i){
                        tmp = valores[i];
                        valores[i] = valores[pos];
                        valores[pos] = tmp;
                    }
                }
                System.out.println("Tu array ha sido ordenado con el método de Selección");
                System.out.println(" ");
                System.out.println("Array Ordenado");
                for (int n : valores){
                    System.out.print("[" + n + "] ");
                }
            }
        }
        */



    }
}
