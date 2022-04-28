/**
 * La clase módulo almacena el nombre, las horas, el contenido, el alumnado, los profesores del módulo y 
 * cómo se evalua a través de un examen y una tarea. También tienen los métodos de matricular Alumno, 
 * contratarProfesor y evaluarAlumno
 * @author ana
 */

public class MODULO {

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
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * @return the alumnado
     */
    public ALUMNO[] getAlumnado() {
        return alumnado;
    }

    /**
     * @param alumnado the alumnado to set
     */
    public void setAlumnado(ALUMNO[] alumnado) {
        this.alumnado = alumnado;
    }

    /**
     * @return the claustro
     */
    public PROFESOR[] getClaustro() {
        return claustro;
    }

    /**
     * @param claustro the claustro to set
     */
    public void setClaustro(PROFESOR[] claustro) {
        this.claustro = claustro;
    }

    /**
     * @return the pruebaexamen
     */
    public EXAMEN getPruebaexamen() {
        return pruebaexamen;
    }

    /**
     * @param pruebaexamen the pruebaexamen to set
     */
    public void setPruebaexamen(EXAMEN pruebaexamen) {
        this.pruebaexamen = pruebaexamen;
    }

    /**
     * @return the pruebaTarea
     */
    public TAREA getPruebaTarea() {
        return pruebaTarea;
    }

    /**
     * @param pruebaTarea the pruebaTarea to set
     */
    public void setPruebaTarea(TAREA pruebaTarea) {
        this.pruebaTarea = pruebaTarea;
    }

    private String nombre;

    private int horas;

    private String contenido;

    private ALUMNO[] alumnado;

    private PROFESOR[] claustro;

    private EXAMEN pruebaexamen;

    private TAREA pruebaTarea;

    public MODULO() {
    }

    /**
     * El método matricular alumno se usa para las matriculas del alumnado
     */
    public void matricularAlumno() {
    }

    /**
     * El método contratarProfesor  se usa para añadir profesores al módulo
     */
    public void contratarProfesor() {
    }
/**
     * El método evaluarAlumno se usa para las evaluaciones de los alumnos.
     */
    public void evaluarAlumno() {
    }
}
