package servicio;

import dominio.Pelicula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioPeliculasLista implements IServicioPeliculas {
    Scanner consola = new Scanner(System.in);
    private final List<Pelicula> peliculas;

    public ServicioPeliculasLista (){
        this.peliculas = new ArrayList<Pelicula>();
    }


    @Override
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("Se agrego la pelicula " + pelicula.getTitulo() + " de manera exitosa!");
    }

    @Override
    public void listarPeliculas() {
        System.out.println("Listado de peliculas");
        peliculas.forEach(System.out::println);
    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        //Regresa el indice
        var indice = peliculas.indexOf(pelicula);
        if (indice == -1) {
            System.out.println("No se encontro la pelicula " + pelicula.getTitulo());
        } else {
            System.out.println("Pelicula encontrada en el indice " + indice);
        }

    }

    @Override
    public void eliminarPelicula(Pelicula pelicula) {
        //Primero listamos
        //System.out.println("Listado de peliculas");
        //peliculas.forEach(System.out::println);

        //Ejecutamos la funcion
        System.out.print("Proporciona el ID de la pelicula a eliminar: ");
        int idEliminar = Integer.parseInt(consola.nextLine());
        if (idEliminar == pelicula.getId()){
            peliculas.remove(pelicula);
            System.out.println("Pelicula eliminada exitosamente!");
        } else {
            System.out.println("Pelicula no encontrada!");
        }

    }

    public static void main(String[] args) {
        //Creamos objetos de tipo pelicula
        var pelicula1 = new Pelicula("Batman", 2011, "Accion");
        var pelicula2 = new Pelicula("Superman", 2011, "Accion");
        var pelicula3 = new Pelicula("Flash", 2011, "Accion");

        //Creamos servicios
        IServicioPeliculas servicioPeliculas = new ServicioPeliculasLista();
        //agregamos las peliculas a la lista
        servicioPeliculas.agregarPelicula(pelicula1);
        servicioPeliculas.agregarPelicula(pelicula2);
        servicioPeliculas.agregarPelicula(pelicula3);
        //Listamos las peliculas
        servicioPeliculas.listarPeliculas();
        //buscamos una pelicula
        servicioPeliculas.buscarPelicula(pelicula3);
        //Eliminamos una pelicula
        servicioPeliculas.eliminarPelicula(pelicula3);
        //buscamos una pelicula para comprobar la eliminacion
        servicioPeliculas.buscarPelicula(pelicula3);
    }


}
