import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true){
        System.out.println("**** APlicacion Calculadora *****");
        //MENU
        mostrarMenu();
        System.out.print("Ingresa una opcion: ");
        try {
            var opcion = Integer.parseInt(consola.nextLine());
            //revisar opciones
            if (opcion <= 4 && opcion >= 1) {
                selecOpcion(opcion, consola);
            } else if (opcion == 5) {
                System.out.println("Hasta pronto");
                break;
            } else {
                System.out.println("Opcion erronea " + opcion);
            }
            // Salto antes de repetir el ciclo
            System.out.println();
        }//Fin Try
        catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        } // Fin de while
    }// Fin Main

    private static void mostrarMenu(){
    //MENU
        System.out.println("""
        1.Suma
        2. Resta
        3. Multiplicacion
        4.Division
        5. Salir
        """);
        System.out.print("Ingresa una opcion: ");
    } //Fin mostrarMenu

    private static void selecOpcion(int opcion, Scanner consola){
        System.out.print("Proporciona el valor 1: ");
        var x = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona el valor 2: ");
        var y = Double.parseDouble(consola.nextLine());
        double z;

        switch (opcion) {
            case 1 -> opSuma(x, y);
            case 2 -> opResta(x, y);
            case 3 -> opMulti(x, y);
            case 4 -> opDivi(x, y);

            default -> System.out.println("Opcion erronea " + opcion);
        }
    } //Fin selecOpcion

    private static void opSuma(double x, double y) {
        double z = x + y;
        System.out.println("El resultado de la suma es: " + z);
    }

    private static void opResta(double x, double y) {
        double z = x - y;
        System.out.println("El resultado de la resta es: " + z);
    }

    private static void opMulti(double x, double y) {
        double z = x * y;
        System.out.println("El resultado de la multiplicacion es: " + z);
    }

    private static void opDivi(double x, double y) {
        double z = x / y;
        System.out.println("El resultado de la division es: " + z);
    }
}// Fin Class
