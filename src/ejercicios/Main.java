package ejercicios;

public class Main {

    public static void main(String[] args) {
        Actor primerActor = new Actor("Alejo", "Amillano", "Argentina", 1980);
        Actor segundoActor = new Actor("Alejo", "Amillano", "Argentina", 1980);
        Actor tercerActor = new Actor("Alejo", "Amillano", "Argentina", 1980);
        Actor cuartoActor = new Actor("Alejo", "Amillano", "Argentina", 1980);

        Pelicula primeraPelicula = new Pelicula("Titanic", 120, 2000, "Romance");
        Pelicula segundaPelicula = new Pelicula("El Rey Leon", 120, 2000, "Infantil");

        Cine nuevoCine = new Cine("Nuevo Cine", "Buenos Aires");

        primeraPelicula.agregarActor(primerActor);
        primeraPelicula.agregarActor(segundoActor);
        segundaPelicula.agregarActor(tercerActor);
        segundaPelicula.agregarActor(cuartoActor);

        nuevoCine.agregarPelicula(primeraPelicula);
        nuevoCine.agregarPelicula(segundaPelicula);

        primeraPelicula.mostrarActores();
        segundaPelicula.mostrarActores();

        nuevoCine.mostrarPeliculas();
    }
}
