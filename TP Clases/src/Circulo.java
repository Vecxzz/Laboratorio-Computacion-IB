//Ejercicios 4, 5

public class Circulo{
    //Atributos
    private double radio;

    //Constructor
    public Circulo(double radio){
        this.radio = radio;
    }

    //Getters
    public double getRadio(){
        return radio;
    }

    //Setters
    public void setRadio(double radio){
        this.radio = radio;
    }

    //Métodos para calcular el área y circunferencia
    public double calcularArea(){
        return Math.PI * radio * radio;
    }

    public double calcularCircunferencia(){
        return 2 * Math.PI * radio;
    }

    //Método para mostrar información
    public void mostrarInformacion(){
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Circunferencia: " + calcularCircunferencia());
    }

    public static void main(String args[]){
        //Crear una instancia de la clase Circulo
        Circulo miCirculo = new Circulo(5.0);

        //Calcular área y circunferencia
        double area = miCirculo.calcularArea();
        double circunferencia = miCirculo.calcularCircunferencia();

        //Mostrar información
        System.out.println("Información del Circulo: ");
        miCirculo.mostrarInformacion();
        System.out.println("Área: " + area);
        System.out.println("Circunferencia: " + circunferencia);
    }
}