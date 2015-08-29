/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.ArrayList;

/**
 *
 */
public class Cuestionario {
    
    private ArrayList<Pregunta> preguntas;
    private ArrayList<Respuesta> respuestas;
    private int idCuestionario;

    public Cuestionario() {
        preguntas = new ArrayList<>();
        respuestas = new ArrayList<>();
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }
    
    public void addPregunta(Pregunta p){
        if (preguntas == null){
            preguntas = new ArrayList<>();
        }
        preguntas.add(p);
    }
    
    public void addRespuesta(Pregunta p, Respuesta r){
        addPregunta(p);
        r.setPregunta(p);
        addRespuesta(r);
    }
    
    public void addRespuesta(Respuesta r){
        if (respuestas == null){
            respuestas = new ArrayList<>();
        }
        respuestas.add(r);
    }

    @Override
    public String toString() {
        return "Preguntas : " + getPreguntas().size() + " Respuestas : "+getRespuestas().size();
    }

    public int getIdCuestionario() {
        return idCuestionario;
    }

    public void setIdCuestionario(int idCuestionario) {
        this.idCuestionario = idCuestionario;
    }
    
}
