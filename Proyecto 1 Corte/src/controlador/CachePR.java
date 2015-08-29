/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.AbstractFactoryPR;
import modelo.Cuestionario;
import modelo.FactoryPR;
import modelo.Pregunta;
import modelo.Respuesta;
import modelo.Tema;

/**
 *
 */
public class CachePR {
    private static AbstractFactoryPR pregFactory = FactoryPR.getFactory("PREGUNTA");
    private static AbstractFactoryPR respFactory = FactoryPR.getFactory("RESPUESTA");
    
    private static Hashtable<String, Pregunta> preguntaCache = new Hashtable();
    private static Hashtable<String, Respuesta> respuestaCache = new Hashtable();
    private static Hashtable<String, Cuestionario> cuestionarioCache = new Hashtable();
    private static Hashtable<String, Tema> temaCache = new Hashtable();
    
    

    public CachePR() {
    }
    
    public static void cargarCache(){
        cargarPreguntas();
        cargarRespuestas();
    }
    
    
    private static void cargarPreguntas(){
        Pregunta p = pregFactory.getPregunta("SIMPLE");
        preguntaCache.put("SIMPLE", p);
    }
    
    public static void agregarPregunta(Pregunta p){
        preguntaCache.put(p.getNombre(), p);
    }
    
    private static void cargarRespuestas(){
        Respuesta r1 = respFactory.getRespuesta("SIMPLE");
        Respuesta r2 = respFactory.getRespuesta("COMPUESTA");
        
        respuestaCache.put("SIMPLE", r1);
        respuestaCache.put("COMPUESTA", r2);
    }
    
    public static void agregarRespuesta(Respuesta r){
        respuestaCache.put(r.getRespuesta(), r);
    }
    
    public static Pregunta getPregunta(String tipo){
        Pregunta p = preguntaCache.get(tipo);
        if (p != null){
            try {
                p.clone();
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(CachePR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return p;
    }
    
    public static Respuesta getRespuesta(String tipo){
        Respuesta r = respuestaCache.get(tipo);
        if (r != null){
            try {
                r.clone();
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(CachePR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return r;
    }

    public static Hashtable<String, Pregunta> getPreguntaCache() {
        return preguntaCache;
    }

    public static Hashtable<String, Respuesta> getRespuestaCache() {
        return respuestaCache;
    }

    public static Hashtable<String, Cuestionario> getCuestionarioCache() {
        return cuestionarioCache;
    }
    
    public static void agregarCuestionario(Cuestionario c){
        cuestionarioCache.put(c.getIdCuestionario()+"", c);
    }

    public static Hashtable<String, Tema> getTemaCache() {
        return temaCache;
    }
    
    public static void agregarTema(Tema t){
        temaCache.put(t.getTema(), t);
    }

}
