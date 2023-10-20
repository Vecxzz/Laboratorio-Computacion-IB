//Ejercicios 6, 7

public class Estudiante{
    //Atributos
    private String nombre;
    private int edad;
    private int nroiden;

    //Constructor
    public Estudiante(String nombre, int edad, int nroiden){
        this.nombre = nombre;
        this.edad = edad;
        this.nroiden = nroiden;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public int getNroiden(){
        return nroiden;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNroiden(int nroiden){
        this.nroiden = nroiden;
    }

    //Método para mostrar información
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Número de Identificación: " + nroiden);
    }

    public static void main(String args[]){
        //Crear una instancia de la clase Estudiante
        Estudiante miEstudiante = new Estudiante("Uriel", 18, 422);

        //Mostrar información
        miEstudiante.mostrarInformacion();
    }

}