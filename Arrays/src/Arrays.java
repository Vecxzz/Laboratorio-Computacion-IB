import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        //Crear Scanner
        Scanner sc = new Scanner(System.in);


       /*Ejercicio 1
       int [] numeros = new int[10];
       int pos = 0, neg = 0;
       double sumaPos = 0, sumaNeg = 0;

       System.out.println("Ingrese 10 números enteros");
       for (int i = 0; i < 10; i++) {
           System.out.print("Números[" + i + "] = ");
           numeros[i] = sc.nextInt();
       }

       for (int j = 0; j < 10; j++) {
           if (numeros[j] > 0) {
               sumaPos += numeros[j];
               pos++;
           } else if (numeros[j] < 0) {
               sumaNeg += numeros[j];
               neg++;
           }
       }

       if (pos != 0) {
           System.out.println("Media de los valores positivos: " + sumaPos/pos);
       }
       else {
           System.out.print("No se han introducido valores positivos");
       }

       if (neg != 0) {
           System.out.print("Media de los valores negativos " + sumaNeg/neg);
       }
       else {
           System.out.print("No se han introducido valores negativos");
       }
       */


       /*Ejercicio 2
       int [] numeros = new int[10];
       int pares = 0;
       double media = 0;

       System.out.println("Ingrese 10 números enteros");
       for (int i = 0; i < 10; i++) {
           if (i % 2 == 0) {
               System.out.print("Posición PAR ");
           }
           System.out.print("Números [" + i + "] = ");
           numeros[i] = sc.nextInt();
       }

       for (int j = 0; j < 10; j++) {
           if (j % 2 == 0) {
               media += numeros[j];
               pares++;
           }
       }

       System.out.print("La media de los números ingresados en las posiciones pares es: " + media/pares);
       */


        /*Ejercicio 3
        int alumnos = 0;
        System.out.print("Ingrese la cantidad de alumnos a evaluar: ");
        alumnos = sc.nextInt();

        double [] notas = new double[alumnos];
        for (int i = 0; i < alumnos; i++) {
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            notas[i] = sc.nextByte();
        }

        double sumaNotas = 0;
        double promedioNotas = 0;
        for (int i = 0; i < alumnos; i++) {
            sumaNotas += notas[i];
        }
        promedioNotas = sumaNotas / alumnos;

        int mejorPromedio = 0;
        for (int k = 0; k < alumnos; k++) {
            if (notas[k] > promedioNotas) {
                mejorPromedio++;
            }
        }

        System.out.println("El promedio de notas es: " + promedioNotas);
        System.out.print("Los alumnos con notas superiores al promedio son: " + mejorPromedio);
        */


        /*Ejercicio 4
        int [] pares = new int[20];

        for (int i = 0, num = 2; i < 20; i++, num += 2) {
            pares[i] = num;
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(pares[i]);
        }
        */


        /*Ejercicio 5
        int [] numeros = new int[10];

        System.out.println("Ingrese 10 números enteros: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        int pos = 0, neg = 0, cero = 0;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] > 0) {
                pos += 1;
            } else if (numeros[i] < 0) {
                neg += 1;
            } else if (numeros[i] == 0) {
                cero += 1;
            }
        }
        System.out.println("Los valores positivos son: " + pos);
        System.out.println("Los valores negativos son: " + neg);
        System.out.println("Los valores 0 son: " +  cero);
        */


        /*Ejercicio 6
        int [] numeros = new int[10];

        System.out.println("Ingrese 10 números enteros: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        int pos = 0, neg = 0;
        double mediaPos = 0, mediaNeg = 0;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] > 0) {
                pos += 1;
                mediaPos += numeros[i];
            } else if (numeros[i] < 0) {
                neg += 1;
                mediaNeg += numeros[i];
            }
        }
        System.out.println("La media de los valores positivos es: " + mediaPos / pos);
        System.out.println("La media de los valores negativos es: " + mediaNeg / neg);
        */


        /*Ejercicio 7
        System.out.print("¿De cuantas personas desea calcular su altura?: ");
        int cantPersonas = sc.nextInt();

        double [] altura = new double[cantPersonas];
        for (int i = 0; i < cantPersonas; i++) {
            System.out.print("Ingrese la altura de la persona " + i + ": ");
            altura[i] = sc.nextDouble();
        }

        double sumaAltura = 0;
        double promedioAltura = 0;
        for (int i = 0; i < cantPersonas; i++) {
            sumaAltura += altura[i];
        }
        promedioAltura = sumaAltura / cantPersonas;

        int mayorPromedio = 0;
        int menorPromedio = 0;
        for (int i = 0; i < cantPersonas; i++) {
            if (altura[i] > promedioAltura) {
                mayorPromedio += 1;
            } else if (altura[i] < promedioAltura) {
                menorPromedio += 1;
            }
        }
        System.out.println("El promedio de altura es: " + promedioAltura);
        System.out.println("Las personas que tienen una altura mayor al promedio son: " + mayorPromedio);
        System.out.println("Las personas que tienen una altura menor al promedio son: " + menorPromedio);
        */


        /*Ejercicio 8
        String [] empleados = new String[20];
        double [] sueldos = new double[20];

        double mayorSueldo = 0;
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el nombre del empleado " + i + ": ");
            String nombre = sc.nextLine();
            empleados[i] = nombre;

            System.out.print("Ingrese el salario del empleado " + i + ": ");
            double salario = sc.nextDouble();
            sueldos[i] = salario;

            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
            }

            sc.nextLine();
        }

        for (int i = 0; i < 20; i++) {
            if (sueldos[i] == mayorSueldo) {
                System.out.println("Empleado con mayor sueldo");
                System.out.println("Nombre: " + empleados[i]);
                System.out.println("Sueldo: " + sueldos[i]);
            }
        }
        */


        /*Ejercicio 9
        int desde = 1;
        int hasta = 100;
        int tamaño = 10;

        int[] numerosAleatorios = new int[tamaño];
        Random rand = new Random();

        for (int i = 0; i < tamaño; i++) {
            int numeroAleatorio = rand.nextInt(hasta - desde + 1) + desde;
            numerosAleatorios[i] = numeroAleatorio;
        }

        for (int numero : numerosAleatorios) {
            System.out.println(numero);
        }
        */


        /*Ejercicio 10
        System.out.print("Ingrese el número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = sc.nextInt();

        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];

        System.out.println("Ingrese los valores para la matriz A:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para A[" + i + "][" + j + "]: ");
                matrizA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ingrese los valores para la matriz B:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para B[" + i + "][" + j + "]: ");
                matrizB[i][j] = sc.nextInt();
            }
        }

        int[][] matrizC = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("La matriz C (suma de A y B) es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println(); // Nueva línea para la siguiente fila.
        }
        */


        /*Ejercicio 11
        System.out.print("Ingrese el número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = sc.nextInt();

        int[][] matrizOriginal = new int[filas][columnas];
        int[][] matrizTranspuesta = new int[columnas][filas];

        System.out.println("Ingrese los valores para la matriz original:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para [" + i + "][" + j + "]: ");
                matrizOriginal[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }

        System.out.println("Matriz Original:");
        mostrarMatriz(matrizOriginal);
        System.out.println("Matriz Transpuesta:");
        mostrarMatriz(matrizTranspuesta);
    }

    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        */

    }

}