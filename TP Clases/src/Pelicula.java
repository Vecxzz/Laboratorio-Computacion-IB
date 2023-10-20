//Ejercicio 15

public class Pelicula{
    //Atributos
    private String titulo;
    private String director;
    private int duracion;

    //Constructor
    public Pelicula(String titulo, String director, int duracion){
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    //Getters
    public String getTitulo(){
        return titulo;
    }

    public String getDirector(){
        return director;
    }

    public int getDuracion(){
        return duracion;
    }

    //Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public void setDuracion(int duracion){
        this.duracion = duracion;
    }


    //Método para mostrar información
    public void mostrarInformacion(){
        System.out.println("Título: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracion);
    }

    public static void main(String args[]){
        //Crear una instancia de la clase Coche
        Pelicula miPelicula = new Pelicula("Bajo la Misma Estrella", "Josh Boone", 126);

        //Mostrar información
        System.out.println("Información de la Película: ");
        miPelicula.mostrarInformacion();
    }

}