package dominio;

import java.util.Objects;

public class Pelicula {
    private int id;
    private String titulo;
    private int estreno;
    private String genero;
    private static int contadorPeliculas = 0;


    public Pelicula (){}

    public Pelicula(String titulo, int estreno, String genero) {
        this.id = ++contadorPeliculas;
        this.titulo = titulo;
        this.estreno = estreno;
        this.genero = genero;
    }

    public static void main(String[] args) {
        var pelicula1 = new Pelicula("Batman", 2011, "Accion");
        var pelicula2 = new Pelicula("Superman", 2011, "Accion");
        var pelicula3 = new Pelicula("Flash", 2011, "Accion");
        System.out.println(pelicula1);
        System.out.println(pelicula2);
        System.out.println(pelicula3);

    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", Estreno=" + estreno +
                ", genero='" + genero + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pelicula pelicula = (Pelicula) o;
        return id == pelicula.id && estreno == pelicula.estreno && Objects.equals(titulo, pelicula.titulo) && Objects.equals(genero, pelicula.genero);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(titulo);
        result = 31 * result + estreno;
        result = 31 * result + Objects.hashCode(genero);
        return result;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEstreno() {
        return estreno;
    }

    public void setEstreno(int estreno) {
        this.estreno = estreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public static int getContadorPeliculas() {
        return contadorPeliculas;
    }

    public static void setContadorPeliculas(int contadorPeliculas) {
        Pelicula.contadorPeliculas = contadorPeliculas;
    }
}
