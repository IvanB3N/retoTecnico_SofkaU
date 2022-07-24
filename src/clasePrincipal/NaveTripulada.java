package clasePrincipal;

/**
 *
 * @author Ivan 
 * Tipo de nave la cual lleva tripulantes, hereda metodos y
 * atributos de la clase NaveEspacial, se usan principalmente para misiones
 * lunares, experimetnacion en el exterior y mantenimiendo de satelites.
 */
public class NaveTripulada extends NaveEspacial {

    /**
     * Atributos que son proporcionados en el texto para algunos casos de naves
     * tripuladas, como lo son el peso, la capacidad de personas y la distancia
     * de orbita a la que se encuentra la nave, las personas abordo son
     * defindias si la nave esta activa.
     */
    private int capacidadDePersonas, distanciaDeOrbita, personasAbordo = 0;
    private double peso;

    //Cosntructor cuando se conoce la capacidad de personas de la nave y la distancia de orbita
    public NaveTripulada(int capacidadDePersonas, int distanciaDeOrbita, double peso, String nombre, String nacionalidad, String tipoDeCombustible, String actividad, boolean estado) {
        super(nombre, nacionalidad, tipoDeCombustible, actividad, estado);
        this.capacidadDePersonas = capacidadDePersonas;
        this.distanciaDeOrbita = distanciaDeOrbita;
        this.peso = peso;
    }

    //Cosntructor cuando no se conoce la capacidad de personas de la nave y la distancia de orbita
    public NaveTripulada(String nombre, String nacionalidad, String tipoDeCombustible, String actividad, boolean estado) {
        super(nombre, nacionalidad, tipoDeCombustible, actividad, estado);
    }

    //Constructor necesario para instanciar el objeto de clase NaveTripulada y manejarlo en la clase archivos para su posterior almacenamiento en arreglos
    public NaveTripulada() {
    }
    //Cierre constructores    

    //Getters y Setters para a clase
    public double getPeso() {
        return peso;
    }

    public int getCapacidadDePersonas() {
        return capacidadDePersonas;
    }

    public int getDistanciaDeOrbita() {
        return distanciaDeOrbita;
    }

    public void setCapacidadDePersonas(int capacidadDePersonas) {
        this.capacidadDePersonas = capacidadDePersonas;
    }

    public void setDistanciaDeOrbita(int distanciaDeOrbita) {
        this.distanciaDeOrbita = distanciaDeOrbita;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    //Cierre Gettersd y Setters

    //Metodos de la clase
    /**
     * Metodo que modifica la cantidad de personas que se encuentran en la nave,
     * cumpliendo que esta este activa y no se superen la cantidad maxima de
     * personas.
     *
     * @param cantidad El parametro cantidad define la cantidad de pesonas que
     * se encuentras acualmente abordo de la nave.
     */
    public void modificarCantidadPersonas(int cantidad) {
        if (estado) {
            if (cantidad <= capacidadDePersonas) {
                personasAbordo = cantidad;
                System.out.println("Cantidad de personas en nave actualizada");
            } else {
                System.out.println("No se puede superar la capacidad de personas");
            }
        } else {
            System.out.println("La nave esta inactiva");
        }
    }
    //Cierre metodo

    /**
     * Método que carga combustible a la nave y por consecuencia aumenta el peso
     * de esta, siempre que la nave este activa y el combustible sea del tipo
     * que usa la nave(la formula solo es de tipo ejemplo).
     *
     * @param combustible El parametro combustible define el tipo de combustible
     * que recibe la nave tripulada.
     */
    @Override
    public void cargarCombustible(String combustible) {
        if (estado && peso!=0) {
            if (combustible.equals(tipoDeCombustible)) {
                peso = 1.01 * peso;
                System.out.println("Se cargo el combustible");

            } else {
                System.out.println("El tipo de combustible no es compatible con la nave");
            }
        } else {
            System.out.println("La nave no esta en funcionamiento");
        }
    }
    //Cierre metodo

    /**
     * Método que realiza la nave si esta activa, al consumir combustible el
     * peso de la nave baja(la formula solo es una estimacion a tipo ejemplo).
     */
    @Override
    public void combustion() {
        if (estado && peso!=0) {
            if (!tipoDeCombustible.equals("NoRegistra")) {
                System.out.println("Combustion exitosa");
                peso = peso * 0.099;
            }else{
                System.out.println("No se puede realizar combustion");
            }
        } else {
            System.out.println("La nave no esta en funcionamiento");
        }
    }
    //Cierre metodo
}
//Cierre clase
