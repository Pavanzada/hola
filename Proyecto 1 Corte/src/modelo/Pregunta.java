/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 */
public interface Pregunta extends Cloneable{
    
    public String getTipo();
    public String getComplejidad();
    public Double getPorcentaje();
    public Integer getId();
    public String getNombre();
    public String getDescripcion();
    public Object clone() throws CloneNotSupportedException;
    
    
}
