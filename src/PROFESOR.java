
/**
 * La clase profesor, almacena los atributos de NRP y docencia, así como los métodos añadirModulo y setNRP
 * @author ana
 */
public class PROFESOR extends PERSONA {

    /**
     * @return the NRP
     */
    public String getNRP() {
        return NRP;
    }

    /**
     * @param NRP the NRP to set
     */
    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    /**
     * @return the docencia
     */
    public MODULO[] getDocencia() {
        return docencia;
    }

    /**
     * @param docencia the docencia to set
     */
    public void setDocencia(MODULO[] docencia) {
        this.docencia = docencia;
    }

    private String NRP;

    private MODULO[] docencia;

    
   
    public PROFESOR() {
    }
     /**
     * El método añadirModulo sirve para añadir el módulo al profesor
     */
    public void anadirmodulo() {
    }

      /**
     * El método setNRP sirve para almacenar el número de registro personal (NRP) 
     */
    public void setNRP() {
    }
}
