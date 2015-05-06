/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin30_b;

import javax.swing.JOptionPane;

public class Entrenador extends SeleccionFutbol{
    int idFederacion;

    public Entrenador(int idFederacion, String nombre, String apellido, int edad, int id) {
        super(nombre, apellido, edad, id);
        this.idFederacion = idFederacion;
    }

    public void planificarEntrenamiento(){
        JOptionPane.showMessageDialog(null, "El ENTRENADOR entrena.");
    }
    
    @Override
    public void viajar(){
        JOptionPane.showMessageDialog(null, "El ENTRENADOR viaja.");
    }

    @Override
    public void impresionMetodos() {
        planificarEntrenamiento();
        viajar();
    }
    
    @Override
    public String toString(){
        return "Entrenador       Nombre: " + this.nombre + " Apellidos: "+ this.apellido +" Edad: "+ this.edad + " ID: " + this.id + " Federación: "+ this.idFederacion;
    }
    
}
