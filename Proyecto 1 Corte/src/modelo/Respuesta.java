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
public interface Respuesta extends Cloneable{
    
    public void setPregunta(Pregunta p);
    public String getRespuesta();
    public List<Respuesta> getRespuestas();
    public Object clone() throws CloneNotSupportedException;
    public String getTipo();
    
}
