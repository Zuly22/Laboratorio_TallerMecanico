/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reparaciones;

import java.util.Stack;

/**
 *
 * @author Johel M
 */
public class HistorialReparaciones {
    private Stack<Reparacion> historial;

    public Stack<Reparacion> getHistorial() {
        return historial;
    }

    public HistorialReparaciones() {
        this.historial = new Stack();
    }
    
    public void agregarAHistorial(Reparacion reparacion){
        this.historial.push(reparacion);
    }
    
    public Reparacion eliminarDelHistorial(){
        return this.historial.pop();
    }

    @Override
    public String toString() {
        return "HistorialReparaciones{" + "historial=" + historial.toArray().toString() + '}';
    }
    
    
    
}
