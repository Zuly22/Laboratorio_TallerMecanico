/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mecanico;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mecanico mecanico = (Mecanico) o;
        return id == mecanico.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    
    public static boolean hayDuplicados(List<Mecanico> mecanicos) {
        Set<Mecanico> setMecanicos = new HashSet<>();
        for (Mecanico mecanico : mecanicos) {
            if (!setMecanicos.add(mecanico)) {
                return true; 
            }
        }
        return false; 
    }

    @Override
    public String toString() {
        return "Mecanico{" + "nombre=" + nombre + ", id=" + id + ", especialidad=" + especialidad + '}';
    }
   
   
    
}
