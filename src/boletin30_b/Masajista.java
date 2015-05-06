/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30_b;

import javax.swing.JOptionPane;

public class Masajista extends SeleccionFutbol {

    String titulacion;
    int anosExperiencia;

    public Masajista(String titulacion, int anosExperiencia, String nombre, String apellido, int edad, int id) {
        super(nombre, apellido, edad, id);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public void darMasaje() {
        JOptionPane.showMessageDialog(null, "El MASAJISTA da masaje.");
    }

    @Override
    public void viajar() {
        JOptionPane.showMessageDialog(null, "El MASAJISTA viaja.");
    }

    @Override
    public void impresionMetodos() {
        darMasaje();
        viajar();
    }

    @Override
    public String toString() {
        return "Masajista        Nombre: " + this.nombre + " Apellidos: " + this.apellido + " Edad: " + this.edad + " ID: " + this.id + " Titulación: "+ this.titulacion + " Años de experiencia: " + this.anosExperiencia;
    }

}
