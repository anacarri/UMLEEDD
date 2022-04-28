/**
 * La clase competencia almacena la descripción y el nombre de la misma.
 * @author ANA
 */

public class COMPETENCIA {

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String descripcion;

    private String nombre;

    public COMPETENCIA() {
    }
}
