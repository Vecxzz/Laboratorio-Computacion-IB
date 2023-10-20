//Ejercicio 8

public class Libro{
    //Atributos
    private String titulo;
    private String autor;
    private int año;

    //Constructor
    public Libro(String titulo, String autor, int año){
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    //Getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAño(){
        return año;
    }

    //Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAño(int año){
        this.año = año;
    }

    //Método para mostrar información
    public void mostrarInformacion(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + año);
    }

    public static void main(String args[]){
        //Crear una instancia de la clase Libro
        Libro miLibro = new Libro("IT", "Stephen King", 1986);

        //Mostrar información
        miLibro.mostrarInformacion();
    }

}