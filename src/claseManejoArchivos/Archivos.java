package claseManejoArchivos;

import clasePrincipal.NaveNoTripulada;
import clasePrincipal.NaveTripulada;
import clasePrincipal.VehiculoLanzadera;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Ivan 
 * Clase creada con el fin de almacenar los metodos necesarios para
 * trabjar con los ArrayList en donde se guardan los tipos de naves, para
 * acceder a sus metodos y mostrarlas por consola.
 */
public class Archivos {

    //Se instancia objeto de la clase scanner para trabajar con la datos ingresados por consola
    static Scanner inp = new Scanner(System.in);

    /**
     * Metodo para convertir el String de entrada en objeto tipo NaveTripulada,
     * seperando los atributos que vienen separados por "," con split y
     * almacenando en un String[] cada uno, para luego ser agregador al objeto.
     * Se considera dos casos segun la cantidad de atributos en el String de
     * entrada.
     *
     * @param texto Parametro con los atributos de forma
     * "nombre,nacionalidad,etc"
     * @return nave Parametro del tipo NaveTripulada
     */
    public static NaveTripulada stringANaveTripulada(String texto) {
        NaveTripulada nave = new NaveTripulada();
        String[] arrayTexto = texto.split(",");

        if (arrayTexto.length == 5) {
            nave.setNombre(arrayTexto[0]);
            nave.setNacionalidad(arrayTexto[1]);
            nave.setTipoDeCombustible(arrayTexto[2]);
            nave.setActividad(arrayTexto[3]);
            nave.setEstado(Boolean.valueOf(arrayTexto[4]));
        } else {
            nave.setNombre(arrayTexto[0]);
            nave.setNacionalidad(arrayTexto[1]);
            nave.setTipoDeCombustible(arrayTexto[2]);
            nave.setActividad(arrayTexto[3]);
            nave.setEstado(Boolean.valueOf(arrayTexto[4]));
            nave.setPeso(Double.valueOf(arrayTexto[5]));
            nave.setCapacidadDePersonas(Integer.valueOf(arrayTexto[6]));
            nave.setDistanciaDeOrbita(Integer.valueOf(arrayTexto[7]));
        }
        return nave;
    }
    //Cierre metodo

    /**
     * Metodo para convertir el String de entrada en objeto tipo
     * NaveNoTripulada, seperando los atributos que vienen separados por "," con
     * split y almacenando en un String[] cada uno, para luego ser agregador al
     * objeto. Se considera dos casos segun la cantidad de atributos en el
     * String de entrada.
     *
     * @param texto Parametro con los atributos de forma
     * "nombre,nacionalidad,etc"
     * @return nave Parametro del tipo NaveNoTripulada
     */
    public static NaveNoTripulada stringANaveNoTripulada(String texto) {
        NaveNoTripulada nave = new NaveNoTripulada();
        String[] arrayTexto = texto.split(",");

        if (arrayTexto.length == 5) {
            nave.setNombre(arrayTexto[0]);
            nave.setNacionalidad(arrayTexto[1]);
            nave.setTipoDeCombustible(arrayTexto[2]);
            nave.setActividad(arrayTexto[3]);
            nave.setEstado(Boolean.valueOf(arrayTexto[4]));
        } else {
            nave.setNombre(arrayTexto[0]);
            nave.setNacionalidad(arrayTexto[1]);
            nave.setTipoDeCombustible(arrayTexto[2]);
            nave.setActividad(arrayTexto[3]);
            nave.setEstado(Boolean.valueOf(arrayTexto[4]));
            nave.setPeso(Double.valueOf(arrayTexto[5]));
            nave.setFuerzaEmpuje(Double.valueOf(arrayTexto[6]));
        }
        return nave;
    }
    //Cierre metodo

    /**
     * Metodo para convertir el String de entrada en objeto tipo
     * VehiculoLanzadera, seperando los atributos que vienen separados por ","
     * con split y almacenando en un String[] cada uno, para luego ser agregador
     * al objeto. Se considera dos casos segun la cantidad de atributos en el
     * String de entrada.
     *
     * @param texto Parametro con los atributos de forma
     * "nombre,nacionalidad,etc"
     * @return nave Parametro del tipo VehiculoLanzadera
     */
    public static VehiculoLanzadera stringAVehiculoLanzadera(String texto) {
        VehiculoLanzadera nave = new VehiculoLanzadera();
        String[] arrayTexto = texto.split(",");

        if (arrayTexto.length == 5) {
            nave.setNombre(arrayTexto[0]);
            nave.setNacionalidad(arrayTexto[1]);
            nave.setTipoDeCombustible(arrayTexto[2]);
            nave.setActividad(arrayTexto[3]);
            nave.setEstado(Boolean.valueOf(arrayTexto[4]));
        } else {
            nave.setNombre(arrayTexto[0]);
            nave.setNacionalidad(arrayTexto[1]);
            nave.setTipoDeCombustible(arrayTexto[2]);
            nave.setActividad(arrayTexto[3]);
            nave.setEstado(Boolean.valueOf(arrayTexto[4]));
            nave.setPeso(Double.valueOf(arrayTexto[5]));
            nave.setPotencia(Integer.valueOf(arrayTexto[6]));
            nave.setAltura(Integer.valueOf(arrayTexto[7]));
            nave.setCapacidadDeCarga(Integer.valueOf(arrayTexto[8]));
        }
        return nave;
    }
    //Cierre metodo

    /**
     * Metodo para imprimir los tres tipos de nave con todos sus atributos por
     * consola
     *
     * @param navesTripuladas ArrayList que contiene naves tripuladas
     * @param navesNoTripuladas ArrayList que contiene naves o tripuladas
     * @param vehiculoLanzadera ArrayList que contiene vehiculos lanzadera
     */
    public static void mostrarTodasLasNaves(ArrayList<NaveTripulada> navesTripuladas, ArrayList<NaveNoTripulada> navesNoTripuladas, ArrayList<VehiculoLanzadera> vehiculoLanzadera) {
        mostrarNavesTripuladas(navesTripuladas);
        mostrarNavesNoTripuladas(navesNoTripuladas);
        mostrarVehiculosLanzadera(vehiculoLanzadera);
    }
    //Cierre metodo

    /**
     * Metodo para imprimir por consola los naves del tipo NaveTripulada
     *
     * @param navesTripuladas ArrayList que contiene naves tripuladas
     */
    public static void mostrarNavesTripuladas(ArrayList<NaveTripulada> navesTripuladas) {
        System.out.println("\nNaves Tripuladas");
        System.out.println("Nombre/Nacionalidad/Tipo de Combustible/Actividad/Peso/Estado/Capacidad de Personas/Distancia de Orbita");
        for (int i = 0; i < navesTripuladas.size(); i++) {
            System.out.println(navesTripuladas.get(i).getNombre() + "\t"
                    + navesTripuladas.get(i).getNacionalidad() + "\t"
                    + navesTripuladas.get(i).getTipoDeCombustible() + "\t"
                    + navesTripuladas.get(i).getActividad() + "\t"
                    + navesTripuladas.get(i).getPeso() + "\t"
                    + navesTripuladas.get(i).isEstado() + "\t"
                    + navesTripuladas.get(i).getCapacidadDePersonas() + "\t"
                    + navesTripuladas.get(i).getDistanciaDeOrbita());
        }

    }
    //Cierre metodo

    /**
     * Metodo para imprimir por consola los naves del tipo NaveNoTripulada
     *
     * @param navesNoTripuladas ArrayList que contiene naves no tripuladas
     */
    public static void mostrarNavesNoTripuladas(ArrayList<NaveNoTripulada> navesNoTripuladas) {
        System.out.println("\nNaves No Tripuladas");
        System.out.println("Nombre/Nacionalidad/Tipo de Combustible/Actividad/Peso/Estado/Fuerza de empuje");
        for (int i = 0; i < navesNoTripuladas.size(); i++) {
            System.out.println(navesNoTripuladas.get(i).getNombre() + "\t"
                    + navesNoTripuladas.get(i).getNacionalidad() + "\t"
                    + navesNoTripuladas.get(i).getTipoDeCombustible() + "\t"
                    + navesNoTripuladas.get(i).getActividad() + "\t"
                    + navesNoTripuladas.get(i).getPeso() + "\t"
                    + navesNoTripuladas.get(i).isEstado() + "\t"
                    + navesNoTripuladas.get(i).getFuerzaEmpuje());

        }

    }
    //Cierre metodo

    /**
     * Metodo para imprimir por consola los naves del tipo Vehiculolanzadera
     *
     * @param vehiculoLanzadera ArrayList que contiene vehiculos lanzadera
     */
    public static void mostrarVehiculosLanzadera(ArrayList<VehiculoLanzadera> vehiculoLanzadera) {
        System.out.println("\nVehiculos lanzadera");
        System.out.println("Nombre/Nacionalidad/Tipo de Combustible/Actividad/Peso/Estado/Potencia/Altura/Capacidad de Carga/Carga Actual");
        for (int i = 0; i < vehiculoLanzadera.size(); i++) {
            System.out.println(vehiculoLanzadera.get(i).getNombre() + "\t"
                    + vehiculoLanzadera.get(i).getNacionalidad() + "\t"
                    + vehiculoLanzadera.get(i).getTipoDeCombustible() + "\t"
                    + vehiculoLanzadera.get(i).getActividad() + "\t"
                    + vehiculoLanzadera.get(i).getPeso() + "\t"
                    + vehiculoLanzadera.get(i).isEstado() + "\t"
                    + vehiculoLanzadera.get(i).getPotencia() + "\t"
                    + vehiculoLanzadera.get(i).getAltura() + "\t"
                    + vehiculoLanzadera.get(i).getCapacidadDeCarga() + "\t"
                    + vehiculoLanzadera.get(i).getCargaActual());

        }
    }
    //Cierre metodo

    /**
     * Metodo para buscar una nave en especifico por Nombre, Nacionalidad o Tipo
     * de combustible en los 3 ArrayList e imprimirla por consola si se
     * encuentra
     *
     * @param atributo String que contiene el valor del atributo a buscar en los
     * ArrayList
     * @param navesTripuladas ArrayList que contiene naves tripuladas
     * @param navesNoTripuladas ArrayList que contiene naves o tripuladas
     * @param vehiculoLanzadera ArrayList que contiene vehiculos lanzadera
     */
    public static void buscarNavePorAtributo(String atributo, ArrayList<NaveTripulada> navesTripuladas, ArrayList<NaveNoTripulada> navesNoTripuladas, ArrayList<VehiculoLanzadera> vehiculoLanzadera) {
        ArrayList<NaveTripulada> naveTripulada = new ArrayList<>();
        ArrayList<NaveNoTripulada> naveNoTripulada = new ArrayList<>();
        ArrayList<VehiculoLanzadera> vehiculosLanzadera = new ArrayList<>();
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;

        for (int i = 0; i < navesTripuladas.size(); i++) {
            if (atributo.equals(navesTripuladas.get(i).getNombre()) || atributo.equals(navesTripuladas.get(i).getNacionalidad())
                    || atributo.equals(navesTripuladas.get(i).getTipoDeCombustible())) {
                naveTripulada.add(navesTripuladas.get(i));
                flag1 = true;
            };
        }
        if (flag1) {
            System.out.println("Se encontro en:");
            mostrarNavesTripuladas(naveTripulada);
        }

        for (int i = 0; i < navesNoTripuladas.size(); i++) {
            if (atributo.equals(navesNoTripuladas.get(i).getNombre()) || atributo.equals(navesNoTripuladas.get(i).getNacionalidad())
                    || atributo.equals(navesNoTripuladas.get(i).getTipoDeCombustible())) {
                naveNoTripulada.add(navesNoTripuladas.get(i));
                flag2 = true;
            };
        }
        if (flag2) {
            System.out.println("Se encontro en:");
            mostrarNavesNoTripuladas(naveNoTripulada);
        }

        for (int i = 0; i < vehiculoLanzadera.size(); i++) {
            if (atributo.equals(vehiculoLanzadera.get(i).getNombre()) || atributo.equals(vehiculoLanzadera.get(i).getNacionalidad())
                    || atributo.equals(vehiculoLanzadera.get(i).getTipoDeCombustible())) {
                vehiculosLanzadera.add(vehiculoLanzadera.get(i));
                flag3 = true;
            };
        }
        if (flag3) {
            System.out.println("Se encontro en:");
            mostrarVehiculosLanzadera(vehiculosLanzadera);
        }

    }
    //Cierre metodo

    /**
     * Metodo para buscar una nave de la clase NaveTripulada
     *
     * @param nombre String que contiene el nombre de la nave
     * @param navesTripuladas ArrayList que contiene naves tripuladas
     */
    public static void accederMetodosNaveTripulada(String nombre, ArrayList<NaveTripulada> navesTripuladas) {
        for (int i = 0; i < navesTripuladas.size(); i++) {
            if (nombre.equals(navesTripuladas.get(i).getNombre())) {
                metodosNaveTripulada(navesTripuladas.get(i));
            }
        }
    }
    //Cierre metodo

    /**
     * Metodo para buscar una nave de la clase NaveNoTripulada
     *
     * @param nombre String que contiene el nombre de la nave
     * @param navesNoTripuladas ArrayList que contiene naves no tripuladas
     */
    public static void accederMetodosNaveNoTripulada(String nombre, ArrayList<NaveNoTripulada> navesNoTripuladas) {
        for (int i = 0; i < navesNoTripuladas.size(); i++) {
            if (nombre.equals(navesNoTripuladas.get(i).getNombre())) {
                metodosNaveNoTripulada(navesNoTripuladas.get(i));
            }
        }
    }
    //Cierre metodo

    /**
     * Metodo para buscar una nave de la clase VehiculoLanzadera
     *
     * @param nombre String que contiene el nombre de la nave
     * @param vehiculosLanzadera ArrayList que contiene vehiculos lanzadera
     */
    public static void accederMetodosVehiculoLanzadera(String nombre, ArrayList<VehiculoLanzadera> vehiculosLanzadera) {
        for (int i = 0; i < vehiculosLanzadera.size(); i++) {
            if (nombre.equals(vehiculosLanzadera.get(i).getNombre())) {
                metodosVehiculoLanzadera(vehiculosLanzadera.get(i));
            }
        }
    }
    //Cierre metodo

    /**
     * Metodo para acceder a los metodos una nave de la clase NaveTripulada y
     * usarlos
     *
     * @param naveTripulada ArrayList que contiene naves tripuladas
     */
    private static void metodosNaveTripulada(NaveTripulada naveTripulada) {
        System.out.println("Metodos disponibles:\n1.Cargar combsutible\n2.Combustion\n3.Modificar cantidad de personas");

        int opcion = inp.nextInt();
        switch (opcion) {
            case 1 -> {
                System.out.println("Ingrese tipo de combustible:");
                String combustible = inp.next();
                naveTripulada.cargarCombustible(combustible);
            }
            case 2 ->
                naveTripulada.combustion();
            case 3 -> {
                System.out.println("Ingrese la cantidad de personas:");
                int cantidadPersonas = inp.nextInt();
                naveTripulada.modificarCantidadPersonas(cantidadPersonas);
            }
            default ->
                throw new AssertionError();
        }
    }
    //Cierre metodo

    /**
     * Metodo para acceder a los metodos una nave de la clase NaveNoTripulada y
     * usarlos
     *
     * @param naveNoTripulada ArrayList que contiene naves tripuladas
     */
    private static void metodosNaveNoTripulada(NaveNoTripulada naveNoTripulada) {
        System.out.println("Metodos disponibles:\n1.Cargar combsutible\n2.Combustion\n3.Aplicar fuerza");

        int opcion = inp.nextInt();
        switch (opcion) {
            case 1 -> {
                System.out.println("Ingrese tipo de combustible:");
                String combustible = inp.next();
                naveNoTripulada.cargarCombustible(combustible);
            }
            case 2 ->
                naveNoTripulada.combustion();
            case 3 -> {
                System.out.println("Ingrese la fuerza a aplicar:");
                double fuerza = inp.nextDouble();
                naveNoTripulada.aplicarFuerza(fuerza);
            }
            default ->
                throw new AssertionError();
        }
    }
    //Cierre metodo

    /**
     * Metodo para acceder a los metodos una nave de la clase VehiculoLanzadera
     * y usarlos
     *
     * @param vehiculoLanzadera ArrayList que contiene vehiculos lanzadera
     */
    private static void metodosVehiculoLanzadera(VehiculoLanzadera vehiculoLanzadera) {
        System.out.println("Metodos disponibles:\n1.Cargar combsutible\n2.Combustion\n3.Modificar Carga");

        int opcion = inp.nextInt();
        switch (opcion) {
            case 1 -> {
                System.out.println("Ingrese tipo de combustible:");
                String combustible = inp.next();
                vehiculoLanzadera.cargarCombustible(combustible);
            }
            case 2 ->
                vehiculoLanzadera.combustion();
            case 3 -> {
                System.out.println("Ingrese la carga actual:");
                int carga = inp.nextInt();
                vehiculoLanzadera.modificarCarga(carga);
            }
            default ->
                throw new AssertionError();
        }
    }
    //Cierre metodo
}
//Cierer clase
