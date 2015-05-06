package boletin30_b;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public abstract class SeleccionFutbol implements IIntegranteSeleccionFutbol {
    String nombre;
    String apellido;
    int edad;
    int id;

    public SeleccionFutbol(String nombre, String apellido, int edad, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;
    }

    
    @Override
    public void concentrarse() {
        
    }

    @Override
    public void viajar() {
      
    }

    @Override
    public void entrenar() {
        
    }

    @Override
    public void jugarPartido() {
        
    }
    public abstract void impresionMetodos();
    
}
