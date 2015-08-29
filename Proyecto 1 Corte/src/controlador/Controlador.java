/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.util.ArrayList;
import modelo.Cuestionario;
import modelo.Materia;
import modelo.Pregunta;
import modelo.Respuesta;
import modelo.Tema;

/**
 *
 */
public class Controlador {
    
    
    //BuilderI
    private CuestionarioBuilder builder;
    //BuilderF
    
    
    //SinglentonI
    private static Controlador instancia = new Controlador();

    public static Controlador getInstance(){
        return instancia;
    }
    //SinglentonF
    
    private ArrayList<Materia> materias;
    
    
    public Controlador() {
        //PrototypeI
        CachePR.cargarCache();
        //PrototypeF
        builder =  new CuestionarioBuilder();
        materias = new ArrayList<Materia>();
    }
    
    public Materia crearMateria(String nombre){
        Materia m = builder.generarMateria(nombre);
        materias.add(m);
        return m;
    }
    
    public Tema crearTema(String nombre){
        Tema t = builder.generarTema(nombre);
        return t;
    }
    
    public String getMaterias(){
        String mat = "";
        for (Materia m : materias){
            mat += "\n"+m.toString();
        }
        return mat;
    }
    
    public String getMateriasTemas(){
        String mat = "";
        for (Materia m : materias){
            mat += "\n"+m.toString();
            for (Tema t : m.getTemas()){
                mat += "\t"+t.toString();
            }
        }
        return mat;
    }
    
    public String getMateriasTemasCuestionarios(){
        String mat = "";
        for (Materia m : materias){
            mat += "\n"+m.toString();
            for (Tema t : m.getTemas()){
                mat += "\t"+t.toString();
                mat += " "+t.getCuestionario().toString();
            }
        }
        return mat;
    }
    
    public String getPreguntas(){
        String prg = "";
        for (Pregunta pr :  CachePR.getPreguntaCache().values()){
            prg += "\n"+pr.getNombre() + " " +pr.getTipo();
        }
        return prg;
    }
    
    public String getRespuestas(){
        String resp = "";
        for (Respuesta res :  CachePR.getRespuestaCache().values()){
            resp += "\n"+res.getRespuesta() + " " +res.getTipo();
        }
        return resp;
    }
    
    public Pregunta crearPregunta(String tipo){
        return CachePR.getPregunta(tipo);
    }
    
    public void agregarPregunta(Pregunta p){
        CachePR.agregarPregunta(p);
    }
    
    public void agregarRespuesta(Respuesta r){
        CachePR.agregarRespuesta(r);
    }
    
    public void agregarCuestionario(Cuestionario c){
        CachePR.agregarCuestionario(c);
    }
    
    public void agregarTema(Tema t){
        CachePR.agregarTema(t);
    }
    
    public static void main(String aaa[]){
        Controlador c = Controlador.getInstance();
        Materia m = c.crearMateria("Matematicas");
        System.out.println(c.getMaterias());
        
        Tema suma = c.crearTema("Suma");
        Tema resta = c.crearTema("Resta");
        
        m.getTemas().add(suma);
        m.getTemas().add(resta);
        
        Cuestionario cuestionario = c.builder.generarCuestionario(suma);
        cuestionario.addRespuesta(CachePR.getPregunta("SIMPLE"), CachePR.getRespuesta("SIMPLE"));
        
        System.out.println(c.getMateriasTemas());
        System.out.println(c.getMateriasTemasCuestionarios());
        System.out.println(c.getPreguntas());
        System.out.println(c.getRespuestas());
        
    }
    
    
    
}
