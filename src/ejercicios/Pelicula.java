package ejercicios;

import java.util.ArrayList;

public class Pelicula {

    //Atributos
    String titulo;
    int duracion;
    int anio;
    String categoria;
    ArrayList<Actor> actores = new ArrayList<Actor>();

    //Constructores
    public Pelicula(String titulo, int duracion, int anio, String categoria){
        this.titulo = titulo;
        this.duracion = duracion;
        this.anio = anio;
        this.categoria = categoria;
    }

    public Pelicula(String titulo){
        this.titulo = titulo;
    }

    //Metodos

    public void agregarActor(Actor actor){
        this.actores.add(actor);
    }

    public void removerActor(Actor actor){
        this.actores.remove(actor);
    }

    public void mostrarActores(){
        for (int i = 0; i < this.actores.size(); i++) {
            System.out.println("Actores de la pelicula "+this.actores.get(i).nombre);
        }
    }

    @Override
    public String toString() {return "Pelicula:"+this.titulo+" ("+this.anio+")"; }
}
