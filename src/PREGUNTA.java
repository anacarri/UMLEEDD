/**
 * La clase Pregunta alamcena los atributos de enunciado,respuestas y respuestaValida.
 * @author Ana
 */

public class PREGUNTA {

    /**
     * @return the enunciado
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     * @param enunciado the enunciado to set
     */
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    /**
     * @return the respuestas
     */
    public String[] getRespuestas() {
        return respuestas;
    }

    /**
     * @param respuestas the respuestas to set
     */
    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }

    /**
     * @return the respuestaValida
     */
    public int getRespuestaValida() {
        return respuestaValida;
    }

    /**
     * @param respuestaValida the respuestaValida to set
     */
    public void setRespuestaValida(int respuestaValida) {
        this.respuestaValida = respuestaValida;
    }

    private String enunciado;

    private String[] respuestas;

    private int respuestaValida;

    public PREGUNTA() {
    }
}
