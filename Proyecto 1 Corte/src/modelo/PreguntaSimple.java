/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 */
public class PreguntaSimple implements Pregunta{
    
    private int id;
    private String nombre;
    private String descri;
    private String complejidad;
    private double porcentaje;
    

    public PreguntaSimple() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getTipop() {
        return "SIMPLE";
    }

    public String getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(String complejidad) {
        this.complejidad = complejidad;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String getTipo() {
        return getTipop();
    }

    @Override
    public String getDescripcion() {
        return getDescri();
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
    public String toString() {
        return getTipo()+" " + getNombre() + " " + getDescripcion();
    }
    
}
