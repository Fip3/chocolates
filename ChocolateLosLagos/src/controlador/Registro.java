/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author felip
 */

import modelo.*;
import java.util.ArrayList;

public class Registro {
    ArrayList<Chocolate> coleccion;
    
    public Registro() {
        coleccion = new ArrayList<>();
    }
    
    public boolean agregar(){
        return true;
    }
    
    public boolean eliminar(int codigo){
        return true;
    }
    
    public String listar(){
        return "";
    }
    
    public Chocolate buscar(int codigo) {
        return (new Chocolate());
    }
   
    
}
