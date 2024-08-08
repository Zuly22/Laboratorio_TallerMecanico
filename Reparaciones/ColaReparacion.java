/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reparaciones;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Johel M
 */
public class ColaReparacion {
    private Queue<Reparacion> colaReparaciones;

    public Queue<Reparacion> getColaReparaciones() {
        return colaReparaciones;
    }

    public ColaReparacion() {
        this.colaReparaciones = new LinkedList();
    }
    
    public void agregarReparacion(Reparacion reparacion){
        this.colaReparaciones.add(reparacion);
    }
    
    public Reparacion atendiendoReparacion(){
        return this.colaReparaciones.poll();
    }

    @Override
    public String toString() {
        return "ColaReparacion{" + "colaReparaciones=" + colaReparaciones.toArray().toString() + '}';
    }
    
}
