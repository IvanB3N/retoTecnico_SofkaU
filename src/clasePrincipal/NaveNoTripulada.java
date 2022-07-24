package clasePrincipal;

/**
 * @author Ivan 
 * Tipo de nave el cual no lleva tripulantes, hereda atributos y
 * metodos de la clase NaveEspacial, se usan principalmente para estudiar otros
 * cuerpos celestes.
 */
public class NaveNoTripulada extends NaveEspacial {

    /**
     * Atributos que son proporcionados en el texto para algunos casos de naves
     * no tripuladas, como lo son el peso y la velocidad maxima que la nave
     * puede alcanzar, el parametro velocidad actual se establece si la nave aun
     * esta en funcionamiento.
     */
    private double fuerzaEmpuje,  peso;

    //Constuctor general con todas las variables de entrada 

    public NaveNoTripulada(double fuerzaEmpuje, double peso, String nombre, String nacionalidad, String tipoDeCombustible, String actividad, boolean estado) {
        super(nombre, nacionalidad, tipoDeCombustible, actividad, estado);
        this.fuerzaEmpuje = fuerzaEmpuje;
        this.peso = peso;
    }

    //Construtor cuando la variable fuerzaEmpuje no se conoce
    public NaveNoTripulada(String nombre, String nacionalidad, String tipoDeCombustible, String actividad, boolean estado) {
        super(nombre, nacionalidad, tipoDeCombustible, actividad, estado);
    }

    //Constructor necesario para instanciar el objeto de clase NaveNoTripulada y manejarlo en la clase archivos para su posterior almacenamiento en arreglos
    public NaveNoTripulada() {
    }
    //Cierre de constructores

    //Getters y Setters para la clase NaveNoTripulada
    public double getPeso() {
        return peso;
    }
    public double getFuerzaEmpuje() {
        return fuerzaEmpuje;
    }

    public void setFuerzaEmpuje(double fuerzaEmpuje) {
        this.fuerzaEmpuje = fuerzaEmpuje;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    //Cierre Getters y Setters

    //Metodos de la clase 
    /**
     * Método que aplica fuerza necesaria si esta no es superior a la cueal
     * puede proporcioar la nave y ademas la nave este en funcionamiento.
     *
     * @param fuerza El parametro fuerza define fuerza que necesita aplicar la 
     * nave.
     */
    public void aplicarFuerza(double fuerza) {
        if (estado) {

            if (fuerza <= fuerzaEmpuje && this.fuerzaEmpuje != 0) {
                System.out.println("Fuerza de empuje aplicada");
            } else {
                System.out.println("No se puede aplicar la fuerza");
            }
        } else {
            System.out.println("La nave no esta en funcionamiento");
        }
    }
    //Cierre metodo

    /**
     * Método que carga combustible a la nave y por consecuencia aumenta el peso
     * de esta, siempre que la nave este activa y el combustible sea del tipo
     * que usa la nave(la formula solo es de tipo ejemplo).
     *
     * @param combustible El parametro combustible define el tipo de combustible
     * que recibe la nave no tripulada.
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
