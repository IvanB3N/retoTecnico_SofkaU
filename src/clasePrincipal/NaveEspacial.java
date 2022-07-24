package clasePrincipal;

/**
 * @author 
 * Ivan Esta clase abstracta define los principales atributos que
 * comparten los diferentes tipos de naves espaciales, ademas de dos metodos que
 * las naves comparten en comun.
 */
public abstract class NaveEspacial {

    /**
     * Atributos generales que contienen todos los tipos de naves: nombre unico
     * de cada nave, pais al cual pertenece la nave, tipo de combustible con el
     * que funciona la nave, el rango de tiempo en el cual la nave opero y
     * estado que se define en True/False si la nave aun esta en funcionamiento.
     */
    String nombre;
    String nacionalidad;
    String tipoDeCombustible;
    String actividad;
    boolean estado;

    //Constructor que recibe todos los atributos
    public NaveEspacial(String nombre, String nacionalidad, String tipoDeCombustible, String actividad, boolean estado) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.tipoDeCombustible = tipoDeCombustible;
        this.actividad = actividad;
        this.estado = estado;
    }

    //Constructor para instanciar las clases que lo heredan
    public NaveEspacial() {
    }
    //Cierre de constructores

    //Getter y Setter de la clase Nave Espacial
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    //Cierre Getters y Setters

    //Metodos abstractos para ser implementados por los tipos de naves
    public abstract void cargarCombustible(String combustible);

    public abstract void combustion();
    //Cierre metodos

}
//Cierre clase abstracta
