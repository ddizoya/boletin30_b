/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30_b;

import javax.swing.JOptionPane;

public class Seleccionador extends SeleccionFutbol {

    public Seleccionador(String nombre, String apellido, int edad, int id) {
        super(nombre, apellido, edad, id);
    }

    public void seleccionarJugador() {
        JOptionPane.showMessageDialog(null, "El SELECCIONADOR selecciona un jugador.");
    }

    @Override
    public void viajar() {
        JOptionPane.showMessageDialog(null, "El SELECCIONADOR viaja con la selección.");
    }

    @Override
    public void impresionMetodos() {
        seleccionarJugador();
        viajar();

    }

    @Override
    public String toString() {
        return "Seleccionador        Nombre: " + this.nombre + " Apellidos: " + this.apellido + " Edad: " + this.edad + " ID: " + this.id;
    }
}
