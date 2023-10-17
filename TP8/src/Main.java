import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        //Crear Scanner
        Scanner sc = new Scanner(System.in);

        /*Ejercicio 1
        int filas, columnas;

        int[][] A = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] B = {{7,8,9}, {6,5,4}, {3,2,1}};
        int[][] C = new int[3][3];

        //obtener la matriz C como suma de las matrices A y B
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        //mostrar por pantalla las matrices A y B
        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nmatriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.printf("%3d", B[i][j]);
            }
            System.out.println();
        }

        //mostrar la matriz suma de A + B
        System.out.println("\nmatriz Suma:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.printf("%3d", C[i][j]);
            }
            System.out.println();
        }
        */


        /*Ejercicio 2
        int filas, columnas;

        int[][] A = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] B = {{7,8,9}, {6,5,4}, {3,2,1}};
        int[][] C = new int[3][3];

        //obtener la matriz C como suma de las matrices A y B
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] * B[i][j];
            }
        }

        //mostrar por pantalla las matrices A y B
        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nmatriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.printf("%3d", B[i][j]);
            }
            System.out.println();
        }

        //mostrar la matriz suma de A + B
        System.out.println("\nmatriz Suma:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.printf("%3d", C[i][j]);
            }
            System.out.println();
        }
        */


        /*Ejercicio 3
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


        //Ejercicio 4


        /*Ejercicio 5
        int [] vector = {1, 2, 3, 4, 5};
        int num = 5;
        int productoEscalar = 0;

        for (int i = 0; i < 5; i++){
            productoEscalar += vector[i] * num;
        }

        System.out.print("El producto escalar del vector es: " + productoEscalar);
        */


        /*Ejercicio 6
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        int resultado = 0;

        for (int i = 0; i < 3; i++){
            resultado += matriz[i];

            for (int j = 0; j < 3; j++){
                resultado += matriz[j];
            }
        }
        */


        /*Ejercicio 7
        int [][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int maximo = matriz[0][0];
        int filaMax = 0;
        int columnaMax = 0;

        for (int fila = 0; fila < matriz.length; fila++){
            for (int columna = 0; columna < matriz[0].length; columna++){
                if (matriz[fila][columna] > maximo){
                    maximo = matriz[fila][columna];
                    filaMax = fila;
                    columnaMax = columna;
                }
            }
        }
        System.out.println("El elemento máximo es " + maximo);
        System.out.println("Se encuentra en la fila " + filaMax + " y columna " + columnaMax);
        */


        /*Ejercicio 8
        int [][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int filaEspecifica = 0;
        int suma = 0;

        for (int columna = 0; columna < matriz[0].length; columna++){
            suma += matriz[filaEspecifica][columna];
        }
        System.out.println("La suma de la fila " + filaEspecifica + " es: " + suma);
        */


        /*Ejercicio 9
        int[][] matriz = {
            {1, 0, 0},
            {0, 2, 0},
            {0, 0, 3}
        };

        boolean esDiagonal = true;
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            esDiagonal = false;
        } else {
            for (int fila = 0; fila < filas; fila++) {
                for (int columna = 0; columna < columnas; columna++) {
                    if (fila != columna && matriz[fila][columna] != 0) {
                        esDiagonal = false;
                        break;
                    }
                }
                if (!esDiagonal) {
                    break;
                }
            }
        }

        System.out.println("La matriz es diagonal: " + esDiagonal);
        */


        /*Ejercicio 10
        int n = 3;
        int [][] matrizIdentidad = new int[n][n];

        for (int fila = 0; fila < n; fila++){
            for (int columna = 0; columna < n; columna++){
                if (fila == columna){
                    matrizIdentidad[fila][columna] = 1;
                }
                else {
                    matrizIdentidad[fila][columna] = 0;
                }
            }
        }
        for (int fila = 0; fila < n; fila++){
            for (int columna = 0; columna < n; columna++){
                System.out.print(matrizIdentidad[fila][columna] + " ");
            }
            System.out.println();
        }
        */


        /*Ejercicio 11
        int [][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int pares = 0;
        int impares = 0;
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int fila = 0; fila < filas; fila++){
            for (int columna = 0; columna < columnas; columna++){
                if (matriz[fila][columna] % 2 == 0){
                    pares++;
                }
                else{
                    impares++;
                }
            }
        }
        System.out.println("La canidad de números pares es: " + pares);
        System.out.println("La cantidad de números impares es: " + impares);
        */


        /*Ejercicio 12
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizRotada = new int[columnas][filas];

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                matrizRotada[columna][filas - 1 - fila] = matriz[fila][columna];
            }
        }

        for (int fila = 0; fila < columnas; fila++) {
            for (int columna = 0; columna < filas; columna++) {
                System.out.print(matrizRotada[fila][columna] + " ");
            }
            System.out.println();
        }
        */


        /*Ejercicio 13
        int [][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int valor = 5;
        int contador = 0;

        for (int fila = 0; fila < matriz.length; fila++){
            for (int columna = 0; columna < matriz[0].length; columna++){
                if (matriz[fila][columna] == valor){
                    contador++;
                }
            }
        }
        System.out.println("El valor " + valor + " aparece " + contador + " veces en la matriz");
        */


        /*Ejercicio 14
        int [][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;

        int [][] matrizInvertida = new int [filas][columnas];

        for (int fila = 0; fila < filas; fila++){
            for (int columna = 0; columna < columnas; columna++){
                matrizInvertida[fila][columna] = matriz[filas - 1 - fila][columna];
            }
        }
        for (int fila = 0; fila < filas; fila++){
            for (int columna = 0; columna < columnas; columna++){
                System.out.print(matrizInvertida[fila][columna] + " ");
            }
            System.out.println();
        }
        */


        /*Ejercicio 15
        int [][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int tam = matriz.length;
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;

        for (int i = 0; i < tam; i++){
            sumaDiagonalPrincipal += matriz[i][i];
            sumaDiagonalSecundaria += matriz[i][tam - 1 - i];
        }

        System.out.println("Suma de la diagonal principal: " + sumaDiagonalPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + sumaDiagonalSecundaria);
        */


        /*Ejercicio 16
        double[][] matriz = {
            {1.0 / Math.sqrt(2), 1.0 / Math.sqrt(2)},
            {-1.0 / Math.sqrt(2), 1.0 / Math.sqrt(2)}
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            System.out.println("La matriz no es ortogonal (no es cuadrada).");
            return;
        }

        double[][] transpuesta = new double[filas][columnas];
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                transpuesta[columna][fila] = matriz[fila][columna];
            }
        }

        double[][] inversa = new double[filas][columnas];
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                inversa[fila][columna] = matriz[fila][columna];
            }
        }

        boolean esOrtogonal = true;
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                if (transpuesta[fila][columna] != inversa[fila][columna]) {
                    esOrtogonal = false;
                    break;
                }
            }
            if (!esOrtogonal) {
                break;
            }
        }

        if (esOrtogonal) {
            System.out.println("La matriz es ortogonal");
        } else {
            System.out.println("La matriz no es ortogonal");
        }
      */


        /*Ejercicio 17
        int [][] matriz = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
        };

        int filas = matriz.length;
        int [] minimosPorFila = new int [filas];

        for (int fila = 0; fila < filas; fila++){
          int minimo = matriz[fila][0];

          for (int columna = 1; columna < matriz[fila].length; columna++){
              if (matriz[fila][columna] < minimo){
                  minimo = matriz[fila][columna];
              }
          }
          minimosPorFila[fila] = minimo;
        }
        for (int fila = 0; fila < filas; fila++){
          System.out.println("Mínimo en fila " + (fila + 1) + ": " + minimosPorFila[fila]);
        }
        */


        /*Ejercicio 18
        int [][] matrizA = {
                {2, 3},
                {4, 5}
        };

        int [][] matrizB = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;

        if (columnasA != filasB){
            System.out.println("No es posible calcular el producto de matrices de diferentes tamaños");
            return;
        }

        int [][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++){
            for (int j = 0; j < columnasB; j++){
                resultado[i][j] = 0;
                for (int k = 0; k < columnasA; k++){
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        System.out.println("Producto de matrices: ");
        for (int i = 0; i < resultado.length; i++){
            for (int j = 0; j < resultado[0].length; j++){
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
        */






    }
}