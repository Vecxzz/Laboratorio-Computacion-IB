//Ejercicios 1, 2, 3

public class Perro{
    //Atributos
    private String nombre;
    private String raza;
    private int edad;

    //Constructor
    public Perro(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    //Métodos para acceder a los atributos (getters)
    public String getNombre(){
        return nombre;
    }

    public String getRaza(){
        return raza;
    }

    public int getEdad(){
        return edad;
    }

    //Métodos para modificar los atributos (setters)
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    //Método para mostrar información del perro
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad);
    }

    public void ladrar(){
        System.out.println("Guau Guau");
    }

    public static void main (String[] args){
        //Crear una instancia de la clase Perro
        Perro miPerro = new Perro("Noah", "Caniche", 3);

        //Mostrar información del perro
        miPerro.mostrarInformacion();
        miPerro.ladrar();
    }
}