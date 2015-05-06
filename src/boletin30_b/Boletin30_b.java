/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin30_b;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Boletin30_b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SeleccionFutbol obj1 = new Entrenador(140,"Juan","García Solano",34,5001);
        SeleccionFutbol obj2 = new Futbolista(7,"Delantero","Miguel","Díez Souto",21,5037);
        SeleccionFutbol obj3 = new Masajista("Grado en Terapeuta",7,"Ana","Fernández Martínez",43,6007);
        SeleccionFutbol obj4 = new Seleccionador("Manuel","Álvarez Ortiz",50,5003);
    
    ArrayList <SeleccionFutbol> listaSeleccion = new ArrayList<>();
    listaSeleccion.add(obj1);
    listaSeleccion.add(obj2);
    listaSeleccion.add(obj3);
    listaSeleccion.add(obj4);
    
    for(SeleccionFutbol x:listaSeleccion){
        //Falta ver cómo imprimir los métodos concretos para cada objeto.

        JOptionPane.showMessageDialog(null, x.toString());
        x.impresionMetodos();
    }
    
    
    }
    
}
