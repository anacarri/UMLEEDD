/**
 * La clase examen almacena la descripción, y la lista de preguntas.Así como los métodos de calificar,elegirPreguntas y ordenarPreguntas
 * @author ANA
 */

public class EXAMEN {

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
     * @return the listapreguntas
     */
    public PREGUNTA[] getListapreguntas() {
        return listapreguntas;
    }

    /**
     * @param listapreguntas the listapreguntas to set
     */
    public void setListapreguntas(PREGUNTA[] listapreguntas) {
        this.listapreguntas = listapreguntas;
    }

    private String descripcion;

    private PREGUNTA[] listapreguntas;

    
    public EXAMEN() {
    }

    /**
     * El método sirve para poner calificación a un examen
     */
    public void calificar() {
    }

    /**
     * El método elegirPreguntas  sirve para almacenar las preguntas
     */
    public void elegirPreguntas() {
    }

    /**
     * El método ordenarPreguntas sirve para ordenar las preguntas del examen
     */
    public void ordenarPreguntas() {
    }
}
