//Ejercicio 12

public class Rectangulo{
    //Atributos
    private double ancho;
    private double alto;

    //Constructor
    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    //Getters
    public double getAncho(){
        return ancho;
    }

    public double getAlto(){
        return alto;
    }

    //Setters
    public void setAncho(double ancho){
        this.ancho = ancho;
    }

    public void setAlto(double alto){
        this.alto = alto;
    }

    //Métodos para calcular el área y circunferencia
    public double calcularArea(){
        return ancho * alto;
    }

    public double calcularPerimetro(){
        return 2 * (ancho + alto);
    }

    //Método para mostrar información
    public void mostrarInformacion(){
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    public static void main(String args[]){
        //Crear una instancia de la clase Rectangulo
        Rectangulo miRectangulo = new Rectangulo(12, 25);

        //Mostrar información
        System.out.println("Información del Rectángulo: ");
        miRectangulo.mostrarInformacion();
    }
}