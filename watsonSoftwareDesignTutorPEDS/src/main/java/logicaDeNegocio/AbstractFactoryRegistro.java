package logicaDeNegocio;

import java.util.*;

/**
 * 
 */
public interface AbstractFactoryRegistro {

    /**
     * @param DTO_Registro 
     * @return
     */
    public abstract Registro crearRegistro(void DTO_Registro);

}