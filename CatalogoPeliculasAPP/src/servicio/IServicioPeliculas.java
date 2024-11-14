package servicio;

import dominio.Pelicula;

public interface IServicioPeliculas {
    public void agregarPelicula(Pelicula pelicula);

    public void listarPeliculas();

    public void buscarPelicula(Pelicula pelicula);

    public void eliminarPelicula(Pelicula pelicula);



}
