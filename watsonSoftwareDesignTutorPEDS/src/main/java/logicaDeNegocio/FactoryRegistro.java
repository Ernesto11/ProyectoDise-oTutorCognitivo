package logicaDeNegocio;

import java.util.*;

/**
 * 
 */
public class FactoryRegistro implements AbstractFactoryRegistro {

    /**
     * Default constructor
     */
    public FactoryRegistro() {
    }

    /**
     * @param DTO_Registro 
     * @return
     */
    public Registro crearRegistro(void DTO_Registro) {
        // TODO implement here
        return null;
    }

    /**
     * @param DTO_Registro 
     * @return
     */
    public abstract Registro crearRegistro(void DTO_Registro);

}