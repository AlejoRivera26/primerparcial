package ejercicios;

public class Actor {

    //Atributos
    String nombre;
    String apellido;
    String pais;
    int anioNacimiento;

    //Constructores

    public Actor(String nombre, String apellido, String pais, int anioNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.anioNacimiento = anioNacimiento;
    }

    //Metodos

    public int calcularEdad() {
        int anioActual=2021;
        int calculoResta = anioActual - anioNacimiento;
        return calculoResta;
    }

    @Override
    public String toString() {return "Actor:"+this.nombre+" "+this.apellido+" ("+this.pais+")"; }

}