package logicaDeNegocio;

import java.util.*;

/**
 * 
 */
public interface AbstractFactoryConsulta {

    /**
     * @param pObjetoDTO
     */
    public abstract void crearConsultaPorVoz(DTO_Consulta pObjetoDTO);

    /**
     * @param pObjetoDTO
     */
    public abstract void crearConsultaPorTexto(DTO_Consulta pObjetoDTO);

}