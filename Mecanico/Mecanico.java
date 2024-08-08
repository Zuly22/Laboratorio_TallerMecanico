/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mecanico;

/**
 *
 * @author zulay
 */
public class Mecanico {
   private String nombre;
   private int id;
   private String especialidad;

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Mecanico(String nombre, int id, String especialidad) {
        this.nombre = nombre;
        this.id = id;
        this.especialidad = especialidad;
    }
   
   public Mecanico (){
       this("", 0, "");
   }

    @Override
    public String toString() {
        return "Mecanico{" + "nombre=" + nombre + ", id=" + id + ", especialidad=" + especialidad + '}';
    }
   
   
    
}
