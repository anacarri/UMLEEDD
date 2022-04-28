/**
 * La clase ciclo almacena el nombre, la descripción,las horas ,el año y la lista de competencias del ciclo
 * @author ANA
 */

public class CICLO {

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
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the listaCompetencias
     */
    public COMPETENCIA[] getListaCompetencias() {
        return listaCompetencias;
    }

    /**
     * @param listaCompetencias the listaCompetencias to set
     */
    public void setListaCompetencias(COMPETENCIA[] listaCompetencias) {
        this.listaCompetencias = listaCompetencias;
    }

    private String nombre;

    private String descripcion;

    private int horas;

    private int year;

    private COMPETENCIA[] listaCompetencias;

    public CICLO() {
    }
}
