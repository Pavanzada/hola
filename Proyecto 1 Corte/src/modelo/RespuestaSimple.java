/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.List;

/**
 *
 */
public class RespuestaSimple implements Respuesta{
    private int pregunta;
    private String respuesta;

    public RespuestaSimple() {
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

    @Override
    public void setPregunta(Pregunta p) {
        this.pregunta = p.getId();
    }

    @Override
    public List<Respuesta> getRespuestas() {
        return null;
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
        return "SIMPLE";
    }

    @Override
    public String toString() {
        return getTipo() + " " + getRespuesta();
    }
    
    
    
    
}
