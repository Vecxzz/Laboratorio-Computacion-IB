import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class Main{
    public static void main(String[] args){
        /*Ejercicio 1
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        */



        /*Ejercicio 2
        ArrayList<String> cadenas = new ArrayList<>();

        cadenas.add("Marcos");
        cadenas.add("Jorge");
        cadenas.add("Alvaro");
        */



        /*Ejercicio 3
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println("Elementos de la lista: ");
        for (int numero : numeros){
            System.out.println(numero);
        }
        */


        /*Ejercicio 4
        ArrayList<Character> caracteres = new ArrayList<>();

        caracteres.add('A');
        caracteres.add('E');
        caracteres.add('I');
        caracteres.add('O');
        caracteres.add('U');

        int longitud = caracteres.size();

        System.out.println("Longitud de la lista: " + longitud);
        */



        /*Ejercicio 5
        ArrayList<String> cadenas = new ArrayList<>();

        cadenas.add("Marcos");
        cadenas.add("Jorge");
        cadenas.add("Alvaro");

        cadenas.remove("Marcos");

        for (String cadena : cadenas){
            System.out.println(cadena);
        }
        */



        /*Ejercicio 6
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        if (numeros.isEmpty()){
            System.out.println("La lista esta vacia");
        }
        else {
            System.out.println("La lista NO esta vacia");
        }
        */



        /*Ejercicio 7
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(4);

        int maximo = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++){
            if (numeros.get(i) > maximo){
                maximo = numeros.get(i);
            }
        }
        System.out.println("El elemento más grande de la lista es: " + maximo);
        */



        /*Ejercicio 8
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        ArrayList<Integer> nuevoArrayList = new ArrayList<>(numeros);

        System.out.println("Elementos de la nueva lista: ");
        for (int elemento : nuevoArrayList){
            System.out.println(elemento);
        }
        */



        /*Ejercicio 9
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        ArrayList<Integer> numerosInvertidos = new ArrayList<>();

        for (int i = numeros.size() - 1; i >= 0; i--){
            numerosInvertidos.add(numeros.get(i));
        }
        System.out.println("Lista de números invertida: " + numerosInvertidos);
        */



        /*Ejercicio 10
        ArrayList<Integer> numeros1 = new ArrayList<>();

        numeros1.add(1);
        numeros1.add(2);
        numeros1.add(3);

        ArrayList<Integer> numeros2 = new ArrayList<>();

        numeros2.add(4);
        numeros2.add(5);
        numeros2.add(6);

        ArrayList<Integer> ArrayCombinado = new ArrayList<>();

        ArrayCombinado.addAll(numeros1);
        ArrayCombinado.addAll(numeros2);

        System.out.println("Lista combinada: " + ArrayCombinado);
        */



        /*Ejercicio 11
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);

        numeros.removeIf(numero -> numero % 2 == 0);

        System.out.println("Lista despues de eliminar todos los elementos pares: " + numeros);
        */



        /*Ejercicio 12
        ArrayList<String> cadenas = new ArrayList<>();

        cadenas.add("HTML");
        cadenas.add("CSS");
        cadenas.add("JavaScript");
        cadenas.add("Java");
        cadenas.add("Python");

        String elementoBuscado = "Java";
        int indice = cadenas.indexOf(elementoBuscado);

        if (indice != -1){
            System.out.println("El índice del elemento " + elementoBuscado + " es: " + indice);
        }
        else {
            System.out.println("El elemento no se encuentra en la lista");
        }
        */



        /*Ejercicio 13
        ArrayList<Integer> numeros1 = new ArrayList<>();

        numeros1.add(1);
        numeros1.add(2);
        numeros1.add(3);

        ArrayList<Integer> numeros2 = new ArrayList<>();

        numeros2.add(1);
        numeros2.add(2);
        numeros2.add(3);

        boolean sonIguales = numeros1.equals(numeros2);

        if (sonIguales){
            System.out.println("Las listas son iguales");
        }
        else {
            System.out.println("Las listas NO son iguales");
        }
        */



        /*Ejercicio 14
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        int menor = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++){
            if (numeros.get(i) < menor){
                menor = numeros.get(i);
            }
        }
        System.out.println("El elemento más pequeño de la lista es: " + menor);
        */



        /*Ejercicio 15
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        int suma = 0;

        for (int numero : numeros){
            suma += numero;
        }
        System.out.println("La suma de los elementos de la lista es: " + suma);
        */



        /*Ejercicio 16
        ArrayList<String> cadenas = new ArrayList<>();

        cadenas.add("Hola");
        cadenas.add(" ");
        cadenas.add("buenas");
        cadenas.add(" ");
        cadenas.add("tardes");

        StringBuilder sb = new StringBuilder();

        for (String cadena : cadenas){
            sb.append(cadena);
        }

        String cadenaConcatenada = sb.toString();
        System.out.println("Cadena Concatenada: " + cadenaConcatenada);
        */



        /*Ejercicio 17
        ArrayList<String> cadenas = new ArrayList<>();

        cadenas.add("HTML");
        cadenas.add("CSS");
        cadenas.add("CSS");
        cadenas.add("JavaScript");
        cadenas.add("Java");
        cadenas.add("Python");

        System.out.println("Lista original: " + cadenas);

        HashSet<String> set = new HashSet<>(cadenas);
        cadenas.clear();
        cadenas.addAll(set);

        System.out.println("Lista de cadenas sin elementos duplicados: " + cadenas);
        */



        /*Ejercicio 18 *
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);

        int suma = 0;
        for (int i = 0; i < numeros.size(); i += 2){
            suma += numeros.get(i);
        }
        System.out.println("La suma de los elementos pares de la lista es: " + suma);
        */



        /*Ejercicio 19
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        int valorBuscado = 3;

        if (numeros.contains(valorBuscado)){
            System.out.println("El valor " + valorBuscado + " está en la lista");
        }
        else {
            System.out.println("El valor " + valorBuscado + " NO está en la lista");
        }
        */



        /*Ejercicio 20
        ArrayList<String> cadenas = new ArrayList<>();

        cadenas.add("HTML");
        cadenas.add("CSS");
        cadenas.add("JavaScript");
        cadenas.add("Java");
        cadenas.add("Python");

        String masLarga = cadenas.get(0);

        for (String cadena : cadenas){
            if (cadena.length() > masLarga.length()){
                masLarga = cadena;
            }
        }
        System.out.println("La cadena más larga en la lista es: " + masLarga);
        */



        /*Ejercicio 21
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        int suma = 0;
        for (int numero : numeros){
            suma += numero;
        }

        double promedio = (double) suma / numeros.size();
        System.out.println("El promedio de los números de la lista es: " + promedio);
        */



        /*Ejercicio 22
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);

        Collections.sort(numeros);
        System.out.println("Lista ordenada en forma ascendente: " + numeros);
        */



        /*Ejercicio 23
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        int limite = 3;

        Iterator<Integer> iter = numeros.iterator();
        while (iter.hasNext()){
            int numero = iter.next();
            if (numero > limite){
                iter.remove();
            }
        }
        System.out.println("Lista después de eliminar los elementos mayores a " + limite + ": " + numeros);
        */



        /*Ejercicio 24
        ArrayList<String> cadenas = new ArrayList<>();

        cadenas.add("HTML");
        cadenas.add("CSS");
        cadenas.add("CSS");
        cadenas.add("JavaScript");
        cadenas.add("Java");
        cadenas.add("Python");

        String elementosBuscado = "CSS";
        int contador = 0;

        for (String cadena : cadenas){
            if (cadena.equals(elementosBuscado)){
                contador++;
            }
        }
        System.out.println("El elemento " + elementosBuscado + " aparece " + contador + " veces en la lista");
        */



        /*Ejercicio 25
        ArrayList<String> cadenas = new ArrayList<>();

        cadenas.add("HTML");
        cadenas.add("CSS");
        cadenas.add("JavaScript");
        cadenas.add("Java");
        cadenas.add("Python");

        System.out.println("Lista sin ordenar: ");
        System.out.println(cadenas);

        Collections.sort(cadenas);

        System.out.println("Lista ordenada alfabéticamente: ");
        System.out.println(cadenas);
        */
    }
}