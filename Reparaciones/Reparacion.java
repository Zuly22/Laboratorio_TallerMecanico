/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reparaciones;

import java.time.LocalDate;
import Vehiculo.Vehiculo;
import Mecanico.Mecanico;
/**
 *
 * @author Johel M
 */
//Atributos: ID, vehículo, mecánico, fecha, descripción, estado.
//▪ Métodos: getters y setters, toString().
public class Reparacion {
    private int ID;
    private Vehiculo vehiculo;
    private Mecanico mecanico;
    private LocalDate fecha;
    private String descripcion;
    private boolean estado;

    public int getID() {
        return ID;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Reparacion(int ID, Vehiculo vehiculo, Mecanico mecanico, String descripcion) {
        this.ID = ID;
        this.vehiculo = vehiculo;
        this.mecanico = mecanico;
        this.fecha = LocalDate.now();
        this.descripcion = descripcion;
        this.estado = false;
    }
    public Reparacion(){
        this(0,new Vehiculo(),new Mecanico(),"");
    }

    @Override
    public String toString() {
        return "Reparacion{" + "ID: " + ID + ", vehiculo: " + vehiculo + 
                ", mecanico: " + mecanico + ", fecha: " + fecha + ", descripcion: " 
                + descripcion + ", estado: " + estado + '}';
    }
    
    
    
}
