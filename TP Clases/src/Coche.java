//Ejercicios 13, 14

public class Coche{
    //Atributos
    private String marca;
    private String modelo;
    private int año;

    //Constructor
    public Coche(String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    //Getters
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAño(){
        return año;
    }

    //Setters
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAño(int año){
        this.año = año;
    }

    //Método para acelerar y frenar
    public void Acelerar(){
        System.out.println("El auto esta acelerando");
    }

    public void Frenar(){
        System.out.println("El auto esta frenando");
    }

    //Método para mostrar información
    public void mostrarInformacion(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de Fabricación: " + año);
    }

    public static void main(String args[]){
        //Crear una instancia de la clase Coche
        Coche miCoche = new Coche("Renault", "Megane", 2002);

        //Mostrar información
        System.out.println("Información del Coche: ");
        miCoche.mostrarInformacion();
        miCoche.Acelerar();
    }

}