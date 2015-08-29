/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class RespuestaCompuesta implements Respuesta{
    private int pregunta;
    private String respuesta;
    private ArrayList<Respuesta> opciones;

    public RespuestaCompuesta() {
        opciones = new ArrayList<>();
    }

    public int getPregunta() {
        return pregunta;
    }

    public void setPregunta(int pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public ArrayList<Respuesta> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Respuesta> opciones) {
        this.opciones = opciones;
    }
    
    public void agregarOpcion(Respuesta r){
        if (opciones == null){
            opciones = new ArrayList<>();
        }
        opciones.add(r);
    }

    @Override
    public void setPregunta(Pregunta p) {
        this.pregunta = p.getId();
    }

    @Override
    public List<Respuesta> getRespuestas() {
        return opciones;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object object = null;
        try{
            object = super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return object;
    }

    @Override
    public String getTipo() {
        return "COMPUESTA";
    }
    
    
    @Override
    public String toString() {
        return getTipo()+" " + getRespuesta() + " " + getOpciones().size();
    }
    
}
