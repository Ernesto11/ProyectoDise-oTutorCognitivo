package logicaDeNegocio;

import java.util.*;

/**
 * 
 */
public abstract class Documento implements Traducible {

    /**
     * Default constructor
     */
    public Documento() {
    }

    /**
     * 
     */
    protected String titulo;

    /**
     * 
     */
    protected Date fechaCreacion;

    /**
     * 
     */
    protected String fuenteDeDatos;

    /**
     * 
     */
    protected String rutaDeGuardado;

    /**
     * @param pFuenteDeDatos 
     * @param pContenido 
     * @param pRutaDeGuardado
     */
    public void Documento(String pFuenteDeDatos, String pContenido, String pRutaDeGuardado) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void generarArchivo() {
        // TODO implement here
        return null;
    }

    /**
     * @param pTexto 
     * @return
     */
    public abstract String traducirAIngles(String pTexto);

}