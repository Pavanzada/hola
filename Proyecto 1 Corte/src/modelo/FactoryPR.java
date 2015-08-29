/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 */
public class FactoryPR {
    
    public static AbstractFactoryPR getFactory(String op){
        if (op == null){
            return null;
        }
        
        if (op.equalsIgnoreCase("PREGUNTA")){
            return new PreguntaFactory();
        }else if (op.equalsIgnoreCase("RESPUESTA")){
            return new RespuestaFactory();
        }
        
        return null;
    }
    
}
