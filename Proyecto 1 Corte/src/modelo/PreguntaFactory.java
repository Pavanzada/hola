/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 */
public class PreguntaFactory extends AbstractFactoryPR{

    @Override
    public Pregunta getPregunta(String tipo) {
        if (tipo == null){
            return null;
        }
        if (tipo.equalsIgnoreCase("SIMPLE")){
            return new PreguntaSimple();
        }
        return null;
    }

    @Override
    public Respuesta getRespuesta(String tipo) {
        return null;
    }
    
}
