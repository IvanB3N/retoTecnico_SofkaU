package clasePrincipal;

import claseManejoArchivos.Archivos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Ivan 
 * Clase principal para ejecutar el programa, en donde se encuentra
 * los menus de tipo Switch para navegar por las opciones
 */
public class Principal {

    static Scanner inp = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Se declaran tres listas segun el tipo de cada nave, en donde se
         * almacenara toda la informacion durante la ejecucion del programa
         *
         */
        ArrayList<NaveTripulada> navesTripuladas = new ArrayList<>();
        ArrayList<NaveNoTripulada> navesNoTripuladas = new ArrayList<>();
        ArrayList<VehiculoLanzadera> vehiculosLanzadera = new ArrayList<>();

        //Varible para controlar la ejecucion del sistema
        boolean estadoSistema = true;

        while (estadoSistema) {
            //Menu principal del sistema que accede a tres metodos: Agregar,Consular,Metodos
            System.out.println("Que desea hacer?\n1.Agregar nave\n2.Consultar Naves\n3.Metodos Naves\n4.Terminar programa");
            var opcion = inp.nextInt();
            System.out.flush();
            switch (opcion) {
                case 1 ->
                    agregarNave(navesTripuladas, navesNoTripuladas, vehiculosLanzadera);
                case 2 ->
                    mostrarNave(navesTripuladas, navesNoTripuladas, vehiculosLanzadera);
                case 3 ->
                    metodosNave(navesTripuladas, navesNoTripuladas, vehiculosLanzadera);
                case 4 ->
                    estadoSistema = false;
                default ->
                    throw new AssertionError();
            }
        }

    }

    /**
     * Metodo para mostrar menu de agregar naves segun el tipo de nave que se
     * escoja
     *
     * @param navesTripuladas ArrayList que contiene naves tripuladas
     * @param navesNoTripuladas ArrayList que contiene naves o tripuladas
     * @param vehiculosLanzadera ArrayList que contiene vehiculos lanzadera
     */
    public static void agregarNave(ArrayList<NaveTripulada> navesTripuladas, ArrayList<NaveNoTripulada> navesNoTripuladas, ArrayList<VehiculoLanzadera> vehiculosLanzadera) {
        System.out.println("Seleccione tipo de Nave\n1.Nave tripulada\n2.Nave no tripulada\n3.Vehiculo lanzadera");
        int opcion = inp.nextInt();
        String datos;

        switch (opcion) {
            case 1 -> {
                System.out.println("""
                                   Nave tripulada
                                   Ingrese los datos separados por comas:
                                   Nombre, Nacionalidad, Tipo de combustible, Actividad, Estado(True/False), Peso(opcional),Capacidad de Personas(opcional), Distancia de orbita(opcional)""");
                datos = inp.next();
                try {
                    navesTripuladas.add(Archivos.stringANaveTripulada(datos));
                } catch (Exception e) {
                    System.out.println("Error al agregar dato");
                }
            }
            case 2 -> {
                System.out.println("""
                                   Nave no tripulada
                                   Ingrese los datos separados por comas:
                                   Nombre, Nacionalidad, Tipo de combustible, Actividad, Estado(True/False), Peso(opcional), Fuerza empuje maxima(opcional)""");
                datos = inp.next();
                try {
                    navesNoTripuladas.add(Archivos.stringANaveNoTripulada(datos));
                } catch (Exception e) {
                    System.out.println("Error al agregar dato");
                }
            }
            case 3 -> {
                System.out.println("""
                                   Vehiculo lanzadera
                                   Ingrese los datos separados por comas:
                                   Nombre, Nacionalidad, Tipo de combustible, Actividad, Estado(True/False),Peso(opcional), Potencia(Opcional), Altura(Opcional), Capacidad de carga(opcional)""");
                datos = inp.next();
                try {
                    vehiculosLanzadera.add(Archivos.stringAVehiculoLanzadera(datos));
                } catch (Exception e) {
                    System.out.println("Error al agregar dato");
                }
            }
            default ->
                throw new AssertionError();
        }
    }
    //Cierre metodo

    /**
     * Metodo para mostrar el menu de consulta de de naves en tres casos: 1.Ver
     * todas las naves 2.Ver naves segun el tipo 3.Buscar nave o naves por
     * atributo(nombre,nacionalidad,tipo de combustible)
     *
     * @param navesTripuladas ArrayList que contiene naves tripuladas
     * @param navesNoTripuladas ArrayList que contiene naves o tripuladas
     * @param vehiculoLanzadera ArrayList que contiene vehiculos lanzadera
     */
    public static void mostrarNave(ArrayList<NaveTripulada> navesTripuladas, ArrayList<NaveNoTripulada> navesNoTripuladas, ArrayList<VehiculoLanzadera> vehiculoLanzadera) {
        System.out.println("Que tipo de consulta desea realizar?\n1.Ver todas las naves\n2.Ver por tipo\n3.Buscar por atributo");
        int opcion = inp.nextInt();

        switch (opcion) {
            case 1 ->
                Archivos.mostrarTodasLasNaves(navesTripuladas, navesNoTripuladas, vehiculoLanzadera);
            case 2 -> {
                System.out.println("Que tipo de naveas desea consultar?\n1.Nave tripulada\n2.Nave no tripulada\n3.Vehiculo lanzadera");
                opcion = inp.nextInt();
                switch (opcion) {
                    case 1 ->
                        Archivos.mostrarNavesTripuladas(navesTripuladas);
                    case 2 ->
                        Archivos.mostrarNavesNoTripuladas(navesNoTripuladas);
                    case 3 ->
                        Archivos.mostrarVehiculosLanzadera(vehiculoLanzadera);
                    default ->
                        throw new AssertionError();
                }
            }
            case 3 -> {
                System.out.println("Ingrese nombre, nacionalidad o tipo de combustible.");
                String atributo;
                atributo = inp.next();
                Archivos.buscarNavePorAtributo(atributo, navesTripuladas, navesNoTripuladas, vehiculoLanzadera);

            }
            default ->
                throw new AssertionError();
        }

    }
    //Cierre metodo

    /**
     * Metodo para mostrar el menu de metodos para cada nave y acceder a ellos,
     * haciendo la busqueda por nombre.
     *
     * @param navesTripuladas ArrayList que contiene naves tripuladas
     * @param navesNoTripuladas ArrayList que contiene naves o tripuladas
     * @param vehiculoLanzadera ArrayList que contiene vehiculos lanzadera
     */
    private static void metodosNave(ArrayList<NaveTripulada> navesTripuladas, ArrayList<NaveNoTripulada> navesNoTripuladas, ArrayList<VehiculoLanzadera> vehiculosLanzadera) {
        System.out.println("Seleccione tipo de Nave\n1.Nave tripulada\n2.Nave no tripulada\n3.Vehiculo lanzadera");
        int opcion = inp.nextInt();
        String nombre;

        switch (opcion) {
            case 1 -> {
                Archivos.mostrarNavesTripuladas(navesTripuladas);
                System.out.println("Seleccione el nombre de la nave");
                nombre = inp.next();
                Archivos.accederMetodosNaveTripulada(nombre, navesTripuladas);
            }
            case 2 -> {
                Archivos.mostrarNavesNoTripuladas(navesNoTripuladas);
                System.out.println("Seleccione el nombre de la nave");
                nombre = inp.next();
                Archivos.accederMetodosNaveNoTripulada(nombre, navesNoTripuladas);
            }
            case 3 -> {
                Archivos.mostrarVehiculosLanzadera(vehiculosLanzadera);
                System.out.println("Seleccione el nombre de la nave");
                nombre = inp.next();
                Archivos.accederMetodosVehiculoLanzadera(nombre, vehiculosLanzadera);
            }
            default ->
                throw new AssertionError();
        }

    }
    //Cierre metodo

}
//Cierre clase