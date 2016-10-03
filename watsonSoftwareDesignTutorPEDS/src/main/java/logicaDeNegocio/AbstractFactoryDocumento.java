package logicaDeNegocio;

import java.util.*;

/**
 * 
 */
public interface AbstractFactoryDocumento {

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