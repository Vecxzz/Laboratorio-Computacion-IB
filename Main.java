import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        /*Programa 1
        int num;
        System.out.print("Ingrese un Número Entero: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.print("El Número Ingresado es PAR");
        }
        else {
            System.out.print("El Número Ingresado es IMPAR");
        }
        */


        /*Programa 2
        int num;
        System.out.print("Ingrese un Número Entero: ");
        num = sc.nextInt();
        if (num % 10 == 0) {
            System.out.print("El Número Ingresado es Múltiplo de 10");
        }
        else {
            System.out.print("El Número Ingresado NO es Múltiplo de 10");
        }
        */


        /*Programa 3
        char car;
        System.out.print("Ingrese un Caracter: ");
        car = (char) System.in.read();
        if (Character.isUpperCase(car)) {
            System.out.print("El Caracter Ingresado es una Letra Mayuscula");
        }
        else {
            System.out.print("El Caracter Ingresado es una Letra Minuscula");
        }
        */


        /*Programa 4
        int n1, n2;
        System.out.print("Ingrese el Primer Número: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el Segundo Número: ");
        n2 = sc.nextInt();
        if (n1 == n2) {
            System.out.print("Los Números Ingresados son Iguales");
        }
        else {
            System.out.print("Los Número Ingresados NO son Iguales");
        }
        */


        /*Programa 5
        int n1, n2;
        System.out.print("Ingrese el Primer Número: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el Segundo Número: ");
        n2 = sc.nextInt();
        if (n1 > n2) {
            System.out.print("El MAYOR Número Ingresado es " + n1);
        }
        else {
            System.out.print("El MAYOR Número Ingresado es " + n2);
        }

        */


        /*Programa 6
        int n1, n2;
        System.out.print("Ingrese el Primer Número: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el Segundo Número: ");
        n2 = sc.nextInt();
        if (n1 % 10 == n2 % 10) {
            System.out.print("La Ultima Cifra de ambos Números es Igual");
        }
        else {
            System.out.print("La Ultima Cifra de ambos Números NO es Igual");
        }
        */


        /*Programa 7
        int num;
        System.out.print("Ingrese un Número Entero: ");
        num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.print("El Número Ingresado es Múltiplo de 3 y 5");
        }
        else {
            System.out.print("El Número Ingresado NO es Múltiplo de 3 y 5");
        }

        */


        /*Programa 8
        int num;
        System.out.print("Ingrese un Número Entero: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.print("El Número Ingresdo es Múltiplo de 2");
        } else if (num % 3 == 0) {
            System.out.print("El Número Ingresado es Múltiplo de 3");
        }
        */


        /*Programa 9
        char c1, c2;
        System.out.print("Ingrese el Primer Caracter: ");
        c1 = (char) System.in.read();
        System.in.read();
        System.out.print("Ingrese el Segundo Caracter: ");
        c2 = (char) System.in.read();
        if (c1 == c2) {
            System.out.print("Los Caracteres Ingresados son Iguales");
        }
        else {
            System.out.print("Los Caracteres Ingresdos NO son Iguales");
        }
        */


        /*Programa 10
        char c1, c2;
        System.out.print("Ingrese el Primer Caracter: ");
        c1 = (char) System.in.read();
        System.in.read();
        System.out.print("Ingrese el Segundo Caracter: ");
        c2 = (char) System.in.read();
        if (Character.isLowerCase(c1) && Character.isLowerCase(c2)) {
            System.out.print("Ambos Caracteres Ingresados son Letras Minúsculas");
        }
        else {
            System.out.print("Ambos Caracteres Ingresados NO son Letras Minúsculas");
        }
        */


        /*Programa 11
        char ch;
        System.out.print("Ingrese un Caracter: ");
        ch = (char) System.in.read();
        if (Character.isDigit(ch)){
            System.out.print("El Caracter Ingresado es un Dígito");
        }
        else {
            System.out.print("El Caracter Ingresado NO es un Dígito");
        }
        */


        /*Programa 12
        int n1;
        System.out.print("Ingrese el Primer Número: ");
        n1 = sc.nextInt();
        int n2;
        System.out.print("Ingrese el Segundo Número: ");
        n2 = sc.nextInt();
        if (n2 == 0) {
            System.out.print("El Divisor no puede ser 0");
        }
        else {
            float resultado = n1 / n2;
            System.out.print("El Resultado de la División entre " + n1 + " y " + n2 + " es: " + resultado);
        }
        */


        /*Programa 13
        int a;
        System.out.print("Ingrese un Año: ");
        a = sc.nextInt();
        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) {
            System.out.print("El Año Inresado es Bisiesto");
        }
        else {
            System.out.print("El Año Ingresado NO es Bisisto");
        }
        */


        /*Programa 14
        int num;
        System.out.print("Ingrese un Número: ");
        num = sc.nextInt();
        if (num >= 100 && num <= 999) {
            int primeraC, terceraC;
            primeraC = num / 100;
            terceraC = num % 10;
            if (primeraC == terceraC) {
                System.out.print("El Número " + num + " es Capicúa");
            }
            else {
                System.out.print("El Número NO es Capicúa");
            }

        }
        else {
            System.out.print("El Número Ingresado NO tiene 3 Cifras");
        }
        */


        /*Prorgama 15
        int hora, min, seg;
        System.out.print("Ingrese la Hora: ");
        hora = sc.nextInt();
        System.out.print("Ingrese los Minutos: ");
        min = sc.nextInt();
        System.out.print("Ingrese los Segundo: ");
        seg = sc.nextInt();
        if (hora < 0 || hora > 24) {
            System.out.print("La Hora Ingresada NO es válida");
        } else if (min < 0 || min > 59) {
            System.out.print("Los Minutos Ingresados NO son validos");
        } else if (seg < 0 || seg > 59) {
            System.out.print("Los Segundos Ingresados NO son validos");
        }
        else {
            System.out.print(hora + ":" + min + ":" + seg);
        }
        */


        /*Programa 16
        int mes;
        System.out.print("Ingrese un Mes (En valor Numérico): ");
        mes = sc.nextInt();
        if (mes >= 1 && mes <= 12) {
            String nombreMes;
            int dias;

            switch (mes) {
                case 1:
                    nombreMes = "Enero";
                    dias = 31;
                    break;
                case 2:
                    nombreMes = "Febrero";
                    dias = 28;
                    break;
                case 3:
                    nombreMes = "Marzo";
                    dias = 31;
                    break;
                case 4:
                    nombreMes = "Abril";
                    dias = 30;
                    break;
                case 5:
                    nombreMes = "Mayo";
                    dias = 31;
                    break;
                case 6:
                    nombreMes = "Junio";
                    dias = 30;
                    break;
                case 7:
                    nombreMes = "Julio";
                    dias = 31;
                    break;
                case 8:
                    nombreMes = "Agosto";
                    dias = 31;
                    break;
                case 9:
                    nombreMes = "Septiembre";
                    dias = 30;
                    break;
                case 10:
                    nombreMes = "Octubre";
                    dias = 31;
                    break;
                case 11:
                    nombreMes = "Noviembre";
                    dias = 30;
                    break;
                case 12:
                    nombreMes = "Diciembre";
                    dias = 31;
                    break;
            }
        }
        */


        /*Programa 17
        int nota;
        System.out.print("Ingrese su Calificación: ");
        nota = sc.nextInt();
        if (nota < 0 || nota > 10) {
            System.out.print("Por favor, ingrese una calificación válida");
        } else if (nota < 5) {
            System.out.print("Insuficiente");
        } else if (nota < 6) {
            System.out.print("Suficiente");
        } else if (nota < 7) {
            System.out.print("Bien");
        } else if (nota < 9) {
            System.out.print("Notable");
        }
        else {
            System.out.print("Sobresaliente");
        }
        */


        /*Programa 18
        int numeros = 0;
        System.out.print("Bucle While Números del 1 al 100");
        while (numeros != 101) {
            System.out.println(numeros);
            numeros += 1;
        }
        */


        /*Programa 19
        int numeros = 0;
        System.out.print("Bucle Do-While Números del 1 al 100");
        do {
            System.out.println(numeros);
            numeros += 1;
        }while (numeros != 101);
         */


        /*Ejercicio 20
        System.out.print("Bucle For Números del 1 al 100");
        for (int i = 0; i < 101; i++) {
            System.out.println(i);
        }
        */


        /*Ejercicio 21
        int numeros = 101;
        System.out.print("Bucle While Números del 100 al 1");
        while (numeros != 0) {
            System.out.println(numeros);
            numeros -= 1;
        }
        */


        /*Ejercicio 22
        int numeros = 100;
        System.out.print("Bucle Do-While Números del 100 al 1");
        do {
            System.out.println(numeros);
            numeros -= 1;
        }while (numeros != 0);
        */


        /*Ejercicio 23
        System.out.print("Bucle For Números del 100 al 1");
        for (int i = 101; i > 0; i--) {
            System.out.println(i);
        }
        */


        /*Ejercicio 24
        int num;
        System.out.print("Ingrese un Número: ");
        num = sc.nextInt();

        /*Bucle For
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
        */

        /*Bucle While
        int numeros = 1;
        while (numeros <= num) {
            System.out.println(numeros);
            numeros += 1;
        }
        */

        /*Bucle Do-While
        int numeros = 1;
        do {
            System.out.println(numeros);
            numeros += 1;
        }while (numeros <= num);
        */


        /*Ejercicio 25
        int num;
        System.out.print("Ingrese un Número: ");
        num = sc.nextInt();

        /*Bucle For
        for (int i = num; i > 0; i--) {
            System.out.println(i);
        }
        */

        /*Bucle While
        while (num != 0) {
            System.out.println(num);
            num -= 1;
        }
        */

        /*Bucle Do-While
        do {
            System.out.println(num);
            num -= 1;
        }while (num != 0);
        */


        /*Ejercicio 26
        int fin_bucle = 1;
        while (fin_bucle != 0) {
            int n1, n2;
            System.out.print("Ingrese el Primer Número: ");
            n1 = sc.nextInt();
            System.out.print("Ingrese el Segundo Número: ");
            n2 = sc.nextInt();
            if (n1 == n2) {
                System.out.print("Los Números Ingresados no pueden ser Iguales ");
            }
            else {
                fin_bucle = 0;
            }
            int menor = 0, mayor = 0;
            if (n1 > n2) {
                menor = n2;
                mayor = n1;
            }
            else {
                menor = n1;
                mayor = n2;
            }
            while (menor <= mayor) {
                System.out.println(menor);
                menor += 1;
            }
        }
        */


        /*Ejercicio 27
        int fin_bucle = 1;
        while (fin_bucle != 0) {
            int n1, n2;
            System.out.print("Ingrese el Primer Número: ");
            n1 = sc.nextInt();
            System.out.print("Ingrese el Segundo Número: ");
            n2 = sc.nextInt();
            if (n1 > n2) {
                System.out.println("El Primer Número Ingresado no puede ser Mayor al Segundo");
            }
            else {
                fin_bucle = 0;
            }
            for (int i = n1; i <= n2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
        */


        /*Ejercicio 28
        int fin_bucle = 1;
        while (fin_bucle != 0) {
            int n, m;
            System.out.print("Ingrese el Primer Número: ");
            n = sc.nextInt();
            System.out.print("Ingrese el Primer Número: ");
            m = sc.nextInt();
            if (n > m) {
                System.out.println("El Valor del Primer Número no puede ser Mayor al Segundo");
            }
            else {
                fin_bucle = 0;
            }
            for (int i = 1; i <= m; i++) {
                if (i % n == 0) {
                    System.out.println(i);
                }
            }
        }
        */


        /*Ejercicio 29
        int fin_bucle = 1;
        while (fin_bucle != 0) {
            int millas;
            System.out.print("Ingrese la cantidad de Millas: ");
            millas = sc.nextInt();
            if (millas == 0) {
                fin_bucle = 0;
            }
            else {
                double km;
                km = millas * 1.6093;
                System.out.println(millas + " Millas son: " + km + " Kilómetros");
            }
        }
        */
    }
}
