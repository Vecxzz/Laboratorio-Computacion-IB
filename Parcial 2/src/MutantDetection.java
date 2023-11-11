import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Clase principal
public class MutantDetection {

    public static void main(String[] args) {
        System.out.println("Bienvenido al Sistema");

        //Bucle Menú
        while (true) {
            System.out.println("1. INGRESAR ADN");
            System.out.println("2. SALIR");

            Scanner scanner = new Scanner(System.in);
            System.out.print("¿Qué acción deseas realizar? : ");
            String userInput = scanner.nextLine();

            int userOption;

            //Verificaciones
            if (isNumeric(userInput)) {
                userOption = Integer.parseInt(userInput);

                if (userOption == 1) {
                    List<String> dna = enterDNA();

                    if (isMutant(dna)) {
                        System.out.println("El ADN ingresado corresponde a un MUTANTE");
                    } else {
                        System.out.println("El ADN ingresado corresponde a un HUMANO");
                    }
                } else if (userOption == 2) {
                    System.out.println("Saliendo del programa");
                    break;
                } else {
                    System.out.println("La opción ingresada no es válida. Inténtelo de nuevo");
                }
            } else {
                System.out.println("Por favor, ingresa un número válido.");
            }
        }
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Ingresar el ADN
    private static List<String> enterDNA() {
        List<String> dna = new ArrayList<>();
        boolean validLetters;

        //Verificaciones
        while (dna.size() < 6) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la fila " + (dna.size() + 1) + " de la matriz (6 letras): ");
            String letters = scanner.nextLine().toUpperCase();

            if (letters.length() == 6) {
                validLetters = true;
                for (char letter : letters.toCharArray()) {
                    if ("ATCG".indexOf(letter) == -1) {
                        validLetters = false;
                        break;
                    }
                }

                if (validLetters) {
                    dna.add(letters);
                } else {
                    System.out.println("Las letras ingresadas no son válidas. Inténtalo de nuevo\n");
                }
            } else {
                System.out.println("Has ingresado más/menos de 6 letras. Inténtalo de nuevo\n");
            }
        }

        return dna;
    }

    //Recorrer la matriz para buscar los patrones que coincidan
    private static List<String> findPatterns(List<String> dna) {
        List<String> patterns = new ArrayList<>();

        for (int i = 0; i < dna.size(); i++) {
            for (int j = 0; j < dna.get(i).length(); j++) {

                //HORIZONTALES
                if (j < dna.get(i).length() - 3 && dna.get(i).substring(j, j + 4).equals(String.valueOf(dna.get(i).charAt(j)).repeat(4))) {
                    patterns.add(dna.get(i).substring(j, j + 4));
                }

                //DIAGONALES - DERECHA
                if (i < dna.size() - 3 && j < dna.get(i).length() - 3 && dna.get(i).charAt(j) == dna.get(i + 1).charAt(j + 1) &&
                        dna.get(i).charAt(j) == dna.get(i + 2).charAt(j + 2) && dna.get(i).charAt(j) == dna.get(i + 3).charAt(j + 3)) {
                    patterns.add(getDiagonalString(dna, i, j, 1, 1));
                }

                //DIAGONALES - IZQUIERDA
                if (i < dna.size() - 3 && j >= 3 && dna.get(i).charAt(j) == dna.get(i + 1).charAt(j - 1) &&
                        dna.get(i).charAt(j) == dna.get(i + 2).charAt(j - 2) && dna.get(i).charAt(j) == dna.get(i + 3).charAt(j - 3)) {
                    patterns.add(getDiagonalString(dna, i, j, 1, -1));
                }
            }
        }

        return patterns;
    }

    private static String getDiagonalString(List<String> dna, int startRow, int startCol, int rowIncrement, int colIncrement) {
        StringBuilder diagonalString = new StringBuilder();

        for (int k = 0; k < 4; k++) {
            int row = startRow + k * rowIncrement;
            int col = startCol + k * colIncrement;

            if (row >= 0 && row < dna.size() && col >= 0 && col < dna.get(row).length()) {
                diagonalString.append(dna.get(row).charAt(col));
            } else {
                diagonalString.append(' ');
            }
        }

        return diagonalString.toString();
    }

    //Verifiar si el humano es mutante o no
    private static boolean isMutant(List<String> dna) {
        return findPatterns(dna).size() > 1;
    }
}