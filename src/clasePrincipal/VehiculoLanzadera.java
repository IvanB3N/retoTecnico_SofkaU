package clasePrincipal;

/**
 *
 * @author Ivan
 * Tipo de nave la cual transporta una carga util, hereda metodos y
 * atributos de la clase NaveEspacial, se usan principalmente para llevar la
 * carga util al espacio, normalmente satelites u otras naves.
 */
public class VehiculoLanzadera extends NaveEspacial {

    /**
     * Atributos que son proporcionados en el texto para algunos casos de naves
     * tipo vehiculo lanzadera, como lo son el peso, potencia, altura y
     * capacidad de carga, la carga actual es definida si la nave esta activa y
     * no se supuera la capacidad de carga.
     */
    private int potencia, altura, capacidadDeCarga, cargaActual = 0;
    private double peso;

    //Cosntructor cuando se conoce todos los atributos de una nave tipo vehiculo lanzadera
    public VehiculoLanzadera(int potencia, int altura, int capacidadDeCarga, double peso, String nombre, String nacionalidad, String tipoDeCombustible, String actividad, boolean estado) {
        super(nombre, nacionalidad, tipoDeCombustible, actividad, estado);
        this.potencia = potencia;
        this.altura = altura;
        this.capacidadDeCarga = capacidadDeCarga;
        this.peso = peso;
    }

    //Constructor cuando solo se concen los atributos principales de una nave tipo vehiculo lanzadera
    public VehiculoLanzadera(String nombre, String nacionalidad, String tipoDeCombustible, String actividad, boolean estado) {
        super(nombre, nacionalidad, tipoDeCombustible, actividad, estado);
    }

    //Constructor necesario para instanciar el objeto de clase VehiculoLanzadera y manejarlo en la clase archivos para su posterior almacenamiento en arreglos
    public VehiculoLanzadera() {
    }
    //Cierre constructores

    //Getters y Setters para la clase
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(int capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    //Cierre Getters y Setters

    //Metodos de la clase Vehiculo lanzadera
    /**
     * Metodo que modifica la carga actual del vehiculo lanzadera siempre que
     * este este activo y no se supere la capacidad de carga de la nave.
     *
     * @param carga El parametro carga define el nuevo valor de la carga actual.
     */
    public void modificarCarga(int carga) {
        if (estado) {
            if (carga <= capacidadDeCarga) {
                cargaActual = carga;
            } else {
                System.out.println("No se puede superar la capacidad de carga");
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
     * que recibe la nave tipo vehiculo lanzadera.
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
            System.out.println("Combustion exitosa");
            peso = peso * 0.099;
        } else {
            System.out.println("La nave no esta en funcionamiento");
        }
    }
    //Cierre metodo
}
//Cierre clase
