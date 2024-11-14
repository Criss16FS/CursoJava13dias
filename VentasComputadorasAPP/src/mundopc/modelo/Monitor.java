package mundopc.modelo;

public class Monitor {
    private int idMonitor;
    private String marca;
    private double pulgadas;
    private static int contadorMonitores;

    //Constructor privado
    private Monitor() {
        idMonitor = contadorMonitores++;
    }

    //Constructor publico
    public Monitor(String marca, double pulgadas) {
        this(); //llamada al Constructor privado
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", pulgadas=" + pulgadas +
                '}';
    }
}
