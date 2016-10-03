package logicaDeNegocio;

import java.util.*;

/**
 * 
 */
public class FactoryDocumento implements AbstractFactoryDocumento {

    /**
     * Default constructor
     */
    public FactoryDocumento() {
    }

    /**
     * @param DTO_Documento 
     * @return
     */
    public PDF crearPDF(void DTO_Documento) {
        // TODO implement here
        return null;
    }

    /**
     * @param DTO_Documento 
     * @return
     */
    public TXT crearTXT(void DTO_Documento) {
        // TODO implement here
        return null;
    }

    /**
     * @param DTO_Documento 
     * @return
     */
    public abstract PDF crearPDF(void DTO_Documento);

    /**
     * @param DTO_Documento 
     * @return
     */
    public abstract TXT crearTXT(void DTO_Documento);

}