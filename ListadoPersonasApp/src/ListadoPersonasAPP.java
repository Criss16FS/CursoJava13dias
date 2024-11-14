import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasAPP {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in); //Escanear la consola para las entradas de texto
        List<Persona> personas = new ArrayList<Persona>(); //Definir el listado de personas
        //Menu
        var salir = false;

        while (!salir){
            mostraMenu();
            try {
                salir = ejecutarOperacion(consola, personas);
            } catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            System.out.print("\n");
        }



    }

    private static void mostraMenu(){
        System.out.println("+++++ Listado Personas APP +++++");
        System.out.print("""
                1. Agregar
                2. Listar
                3. Eliminar
                4. Salir
                """);
        System.out.print("Proporciona la opción: ");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        //Revisamos la opcion proporcionada
        switch (opcion){
            case 1 -> { //Funcion Crear Persona
                System.out.print("Proporciona el nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Proporciona el telefono: ");
                var tel = consola.nextLine();
                System.out.print("Proporciona el email: ");
                var email = consola.nextLine();
                //Crear Persona
                var persona = new Persona(nombre, tel, email);
                //Agregamos a la lista
                personas.add(persona);
                System.out.println("Persona agregada con exito!");
                System.out.println("La lista tiene: " + personas.size() + " personas");
            } //Fin caso 1
            case 2 -> { // Listar Personas
                System.out.println("Listado de personas: ");
                if (personas.size() > 0){
                    //Mejora usando lambda y metodo de referencia
                    //personas.forEach(persona -> System.out.println(persona.toString())); //opcion 1
                    personas.forEach(System.out::println); // Opcion 2
                } else {
                    System.out.println("No hay personas registradas");
                }


            }
            case 3 -> {//Eliminar persona
                //Primero listamos las personas
                System.out.println("+++ Listado de personas +++");
                personas.forEach(persona -> System.out.println(persona.toString()));

                //Ejecutamos la funcion
                System.out.print("Proporciona el ID de la persona a eliminar: ");
                int id = Integer.parseInt(consola.nextLine());
                eliminarPersona(personas, id);

            }
            case 4 -> {//Salimos del ciclo
                System.out.print("Hasta Pronto...");
                salir = true;
            }
            default -> System.out.println("Opcion erronea " + opcion);
        }//Fin Switch
        return salir;
    }

    private static void eliminarPersona(List<Persona> personas, int id) {
        boolean personaEliminada = personas.removeIf(persona -> persona.getId() == id);
        if (personaEliminada) {
            System.out.println("Persona con ID " + id + " eliminada con éxito.");
        } else {
            System.out.println("No se encontró una persona con el ID " + id);
        }
    }
}
