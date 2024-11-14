package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadoraApp {
    public static void main(String[] args) {
        // Crear objetos
        // Crear objetos para Computadora Lenovo
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        //System.out.println(computadoraLenovo);

        // Crear objetos para Computadora HP
        Raton ratonHP = new Raton("usb", "HP");
        Teclado tecladoHP = new Teclado("usb", "HP");
        Monitor monitorHP = new Monitor("HP", 24);
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        //System.out.println(computadoraHP);

        // Crear objetos para Computadora Dell
        Raton ratonDell = new Raton("bluetooth", "Dell");
        Teclado tecladoDell = new Teclado("bluetooth", "Dell");
        Monitor monitorDell = new Monitor("Dell", 27);
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);
        //System.out.println(computadoraDell);

        // Crear objetos para Computadora Asus
        Raton ratonAsus = new Raton("usb", "Asus");
        Teclado tecladoAsus = new Teclado("usb", "Asus");
        Monitor monitorAsus = new Monitor("Asus", 21);
        Computadora computadoraAsus = new Computadora("Computadora Asus", monitorAsus, tecladoAsus, ratonAsus);
        //System.out.println(computadoraAsus);

        // Crear objetos para Computadora Acer
        Raton ratonAcer = new Raton("bluetooth", "Acer");
        Teclado tecladoAcer = new Teclado("usb", "Acer");
        Monitor monitorAcer = new Monitor("Acer", 19);
        Computadora computadoraAcer = new Computadora("Computadora Acer", monitorAcer, tecladoAcer, ratonAcer);
        //System.out.println(computadoraAcer);

        //Creamos una orden
        System.out.println();
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraAcer);
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraAsus);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();

    }
}