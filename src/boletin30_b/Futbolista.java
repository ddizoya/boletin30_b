/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30_b;

import javax.swing.JOptionPane;

public class Futbolista extends SeleccionFutbol {

    int dorsal;
    String demarcacion;

    public Futbolista(int dorsal, String demarcacion, String nombre, String apellido, int edad, int id) {
        super(nombre, apellido, edad, id);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void entrevista() {
        JOptionPane.showMessageDialog(null, "Entrevista al FUTBOLISTA.");
    }

    @Override
    public void viajar() {
        JOptionPane.showMessageDialog(null, "El FUTBOLISTA viaja.");
    }

    @Override
    public void concentrarse() {
        JOptionPane.showMessageDialog(null, "El FUTBOLISTA se concentra.");
    }

    @Override
    public void entrenar() {
        JOptionPane.showMessageDialog(null, "El FUTBOLISTA entrena.");
    }

    @Override
    public void jugarPartido() {
        JOptionPane.showMessageDialog(null, "El FUTBOLISTA juega un partido.");
    }

    @Override
    public void impresionMetodos() {
        entrevista();
        viajar();
        concentrarse();
        entrenar();
        jugarPartido();
    }

    @Override
    public String toString() {
        return "Futbolista           Nombre: " + this.nombre + " Apellidos: " + this.apellido + " Edad: " + this.edad + " ID: " + this.id + " Demarcación: " + this.demarcacion + " Dorsal: "+ this.dorsal;
    }
}
