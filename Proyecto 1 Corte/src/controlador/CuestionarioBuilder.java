/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import modelo.Cuestionario;
import modelo.Materia;
import modelo.Tema;

/**
 *
 */
public class CuestionarioBuilder {
    
    public Cuestionario generarCuestionario(){
        Cuestionario c = new Cuestionario();
        return c;
    }
    
    public Materia generarMateria(String nombre){
        Materia m = new Materia();
        m.setMateria(nombre);
        
        return m;
    }
    
    public Tema generarTema(String nombre){
        Tema t = new Tema();
        t.setTema(nombre);
        t.setCuestionario(generarCuestionario());
        return t;
    }

    public Cuestionario generarCuestionario(Tema tema) {
        tema.setCuestionario(generarCuestionario());
        return tema.getCuestionario();
    }
    
}
