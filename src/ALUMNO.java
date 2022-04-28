/**
 * La clase módulo almacena el nombre, las horas, el contenido, el alumnado, los profesores del módulo y 
 * cómo se evalua a través de un examen y una tarea. También tienen los métodos de matricular Alumno, 
 * contratarProfesor y evaluarAlumno
 * @author ana
 */

public class ALUMNO extends PERSONA {

    /**
     * @return the notaMedia
     */
    public String getNotaMedia() {
        return notaMedia;
    }

    /**
     * @param notaMedia the notaMedia to set
     */
    public void setNotaMedia(String notaMedia) {
        this.notaMedia = notaMedia;
    }

    /**
     * @return the matricula
     */
    public MODULO[] getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(MODULO[] matricula) {
        this.matricula = matricula;
    }

    private String notaMedia;

    private MODULO[] matricula;

    public ALUMNO() {
    }

     /**
     * El método emitir certificado, se usa cuando el alumno ha superado el ciclo y se tiene que emitir el certificado
     */
    public void emitirCertificado() {
    }

    /**
     * El método calcularNotaMedia va a calcular la nota media del ciclo
     */
    public Double calcularNotaMedia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * El método matricular que va a añadir alumnos al módulo
     */
    public void matricular() {
    }
}
