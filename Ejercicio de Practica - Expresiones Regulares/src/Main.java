import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args){
        //Crear Scanner
        Scanner sc = new Scanner(System.in);

        /*Ejercicio 1
        System.out.print("Ingrese su Número de Teléfono: ");
        String NumeroTel = sc.nextLine();

        String regexNumeroTel = "\\d{7,10}";

        Pattern pattern = Pattern.compile(regexNumeroTel);
        Matcher matcher = pattern.matcher(NumeroTel);

        if (matcher.matches()){
            System.out.println("Número de Teléfono válido");
        }
        else {
            System.out.println("Número de Teléfono invalido");
        }
        */


        /*Ejercicio 2
        System.out.print("Ingrese su Número de CUIL: ");
        String NumeroCuil = sc.nextLine();

        String regexNumeroCuil = "\\d{11}";

        Pattern pattern = Pattern.compile(regexNumeroCuil);
        Matcher matcher = pattern.matcher(NumeroCuil);

        if (matcher.matches()){
            System.out.println("Número de CUIL válido");
        }
        else {
            System.out.println("Número de CUIL invalido");
        }
        */


        /*Ejercicio 3
        System.out.print("Ingrese su Correo Electrónico: ");
        String CorreoElectronico = sc.nextLine();

        String regexCorreoElectronico = "[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z]+";

        Pattern pattern = Pattern.compile(regexCorreoElectronico);
        Matcher matcher = pattern.matcher(CorreoElectronico);

        if (matcher.matches()){
            System.out.println("Correo Electrónico válido");
        }
        else {
            System.out.println("Correo Electrónico invalido");
        }
        */


        /*Ejercicio 4
        System.out.print("Ingrese la Nomenclatura (22 Letras): ");
        String Nomenclatura = sc.nextLine();

        String regexNomenclatura = "^[a-zA-Z0-9]{22}";

        Pattern pattern = Pattern.compile(regexNomenclatura);
        Matcher matcher = pattern.matcher(Nomenclatura);

        if (matcher.matches()){
            System.out.println("Nomenclatura válida");
        }
        else {
            System.out.println("Nomenclatura invalida");
        }
        */


        /*Ejercicio 5
        System.out.print("Ingrese su Nombre: ");
        String Nombre = sc.nextLine();

        String regexNombre = "^[a-zA-Z]{7,10}$";

        Pattern pattern = Pattern.compile(regexNombre);
        Matcher matcher = pattern.matcher(Nombre);

        if (matcher.matches()){
            System.out.println("Nombre válido");
        }
        else {
            System.out.println("Nombre invalido");
        }
        */


        /*Ejercicio 6
        System.out.print("Ingrese su Número de Teléfono: ");
        String NumeroTelefono = sc.nextLine();

        System.out.print("Ingrese su Número de CUIL: ");
        String NumeroCuil = sc.nextLine();

        System.out.print("Ingrese su Correo Electrónico: ");
        String CorreoElectronico = sc.nextLine();

        String regexNumeroTelefono = "\\d{7,10}";
        String regexNumeroCuil = "\\d{11}";
        String regexCorreoElectrinico = "[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z]+";

        Pattern patternNumeroTel = Pattern.compile(regexNumeroTelefono);
        Matcher matcherNumeroTel = patternNumeroTel.matcher(NumeroTelefono);

        Pattern patternNumeroCuil = Pattern.compile(regexNumeroCuil);
        Matcher matcherNumeroCuil = patternNumeroCuil.matcher(NumeroCuil);

        Pattern patternCorreoElectronico = Pattern.compile(regexCorreoElectrinico);
        Matcher matcherCorreoElectronico = patternCorreoElectronico.matcher(CorreoElectronico);

        if (matcherNumeroTel.matches()){
            System.out.println("Número de Teléfono válido");
        }
        else {
            System.out.println("Número de Teléfono invalido");
        }

        if (matcherNumeroCuil.matches()){
            System.out.println("Número de CUIL válido");
        }
        else {
            System.out.println("Número de CUIL invalido");
        }

        if (matcherCorreoElectronico.matches()){
            System.out.println("Correo Electrónico válido");
        }
        else {
            System.out.println("Correo Electrónico invalido");
        }
        */


        /*Ejercicio 7
        System.out.print("Ingrese la lista de Correos Electronicos: ");
        String Correos = sc.nextLine();

        String regexCorreos = "[A-Za-z0-9._+-]+@[A-Za-z0-9.-]+.[A-Z|a-z]{2,}";

        Pattern pattern = Pattern.compile(regexCorreos);
        String[] ListaCorreos = Correos.split(",\\s*");

        for (String correo : ListaCorreos){
            Matcher matcher = pattern.matcher(Correos);

            if(matcher.matches()){
                System.out.println("Correo Electrónico válido");
            }
            else {
                System.out.println("Correo Electrónico invalido");
            }
        }
        */


        /*Ejercicio 8 HACER
        System.out.print("Ingrese su Número de Teléfono: ");
        String NumeroTelefono = sc.nextLine();

        String regexNumeroTelefono = "^(\\+\\d{1,3}[- ]?)?\\d{6,14}$";

        Pattern pattern = Pattern.compile(regexNumeroTelefono);
        Matcher matcher = pattern.matcher(NumeroTelefono);

        if (matcher.matches()){
            System.out.println("Número de Teléfono válido");
        }
        else {
            System.out.println("Número de Teléfono invalido");
        }
        */


        /*Ejercicio 9
        System.out.print("Ingrese su Correo Electrónico: ");
        String CorreoElectronico = sc.nextLine();

        String regexCorreoElectronico = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.com$";

        Pattern pattern = Pattern.compile(regexCorreoElectronico);
        Matcher matcher = pattern.matcher(CorreoElectronico);

        if (matcher.matches()){
            System.out.println("Correo Electrónico válido");
        }
        else {
            System.out.println("Correo Electrónico invalido");
        }
        */


        /*Ejercicio 10
        System.out.print("Ingrese su Código Postal: ");
        String CodigoPostal = sc.nextLine();

        String regexCodigoPostal = "^[a-zA-Z0-9]{3,8}$";

        Pattern pattern = Pattern.compile(regexCodigoPostal);
        Matcher matcher = pattern.matcher(CodigoPostal);

        if (matcher.matches()){
            System.out.println("Código Postal válido");
        }
        else {
            System.out.println("Código Postal invalido");
        }
        */


        /*Ejercicio 11
        System.out.print("Ingrese su DNI: ");
        String DNI = sc.nextLine();

        String regexDNI = "^[a-zA-Z0-9]{3,8}$";

        Pattern pattern = Pattern.compile(regexDNI);
        Matcher matcher = pattern.matcher(DNI);

        if (matcher.matches()){
            System.out.println("DNI válido");
        }
        else {
            System.out.println("DNI invalido");
        }
        */


        /*Ejercicio 12
        System.out.print("Ingrese su Nombre de Usuario: ");
        String NombreUsuario = sc.nextLine();

        String regexNombreUsuario = "^[a-zA-Z0-9_]{4,10}$";

        Pattern pattern = Pattern.compile(regexNombreUsuario);
        Matcher matcher = pattern.matcher(NombreUsuario);

        if (matcher.matches()){
            System.out.println("Nombre de Usuario válido");
        }
        else {
            System.out.println("Nombre de Usuario invalido");
        }
        */


        /*Ejercicio 13
        System.out.print("Ingrese una Fecha: ");
        String Fecha = sc.nextLine();

        String regexFecha = "^[a-zA-Z0-9_]{4,10}$";

        Pattern pattern = Pattern.compile(regexFecha);
        Matcher matcher = pattern.matcher(Fecha);

        if (matcher.matches()){
            System.out.println("Fecha válida");
        }
        else {
            System.out.println("Fecha invalida");
        }
        */


        /*Ejericio 14
        System.out.print("Ingrese su Dominio Web: ");
        String DominioWeb = sc.nextLine();

        String regexDominioWeb = "^(https?:\\/\\/)?(www\\.)[a-zA-Z0-9.-]+\\.[a-z-A-Z0-9.-]+$";

        Pattern pattern = Pattern.compile(regexDominioWeb);
        Matcher matcher = pattern.matcher(DominioWeb);

        if (matcher.matches()){
            System.out.println("Dominio Web válido");
        }
        else {
            System.out.println("Dominio Web invalido");
        }
        */


        /*Ejercicio 15
        System.out.print("Ingrese el Nombre de su Producto: ");
        String NombreProducto = sc.nextLine();

        String regexNombreProducto = "^[a-zA-Z]{5,}$";

        Pattern pattern = Pattern.compile(regexNombreProducto);
        Matcher matcher = pattern.matcher(NombreProducto);

        if (matcher.matches()){
            System.out.println("Nombre de Producto válido");
        }
        else {
            System.out.println("Nombre de Producto invalido");
        }
        */


        /*Ejercicio 16
        System.out.print("Ingrese su Contraseña: ");
        String Contrasena = sc.nextLine();

        String regexContrasena = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

        Pattern pattern = Pattern.compile(regexContrasena);
        Matcher matcher = pattern.matcher(Contrasena);

        if (matcher.matches()){
            System.out.println("Contraseña válida");
        }
        else {
            System.out.println("Contraseña invalida");
        }
        */



    }
}