package ejercicios;

import java.util.ArrayList;

public class Cine {

    //Atributos
    String nombre;
    String ciudad;
    ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

    //Constructores
    public Cine(String nombre, String ciudad){
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public Cine(String nombre){
        this.nombre = nombre;
    }

    //Metodos

    public void agregarPelicula(Pelicula pelicula){
        this.peliculas.add(pelicula);
    }

    public void removerPelicula(Pelicula pelicula){
        this.peliculas.remove(peliculas);
    }

    public void mostrarPeliculas(){
        for (int i = 0; i < this.peliculas.size(); i++) {
            System.out.println("Peliculas de la cartelera en "+this.peliculas.get(i).titulo);
        }
    }

    @Override
    public String toString() {return "Bienvenido al cine:"+this.nombre; }
}
