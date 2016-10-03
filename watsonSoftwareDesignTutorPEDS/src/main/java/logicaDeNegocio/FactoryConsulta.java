package logicaDeNegocio;

import java.util.*;

/**
 * 
 */
public class FactoryConsulta implements AbstractFactoryConsulta {

    /**
     * Default constructor
     */
    public FactoryConsulta() {
    }

    /**
     * @param pObjetoDTO
     */
    public void crearConsultaPorVoz(DTO_Consulta pObjetoDTO) {
        // TODO implement here
    }

    /**
     * @param pObjetoDTO
     */
    public void crearConsultaPorTexto(DTO_Consulta pObjetoDTO) {
        // TODO implement here
    }

    /**
     * @param pObjetoDTO
     */
    public abstract void crearConsultaPorVoz(DTO_Consulta pObjetoDTO);

    /**
     * @param pObjetoDTO
     */
    public abstract void crearConsultaPorTexto(DTO_Consulta pObjetoDTO);

}