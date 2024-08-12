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
 */public class MecanicoHashSet {
    private Set<Mecanico> mecanicos;

    public MecanicoHashSet() {
        mecanicos = new HashSet<>();
    }

    public boolean agregarMecanico(Mecanico mecanico) {
        return mecanicos.add(mecanico);
    }

    public boolean eliminarMecanico(Mecanico mecanico) {
        return mecanicos.remove(mecanico);
    }

    public Set<Mecanico> getMecanicos() {
        return mecanicos;
    }

    @Override
    public String toString() {
        return "MecanicoHashSet{" + "mecanicos=" + mecanicos + '}';
    }
    
    /**
     * Método estático para verificar si hay duplicados en una lista de mecánicos.
     * @param mecanicos Lista de mecánicos a verificar.
     * @return true si hay duplicados, false si no hay duplicados.
     */
    public static boolean hayDuplicados(List<Mecanico> mecanicos) {
        Set<Mecanico> setMecanico = new HashSet<>();
        for (Mecanico mecanico : mecanicos) {
            if (!setMecanico.add(mecanico)) {
                return true; // Si el `add` retorna `false`, significa que el `mecanico` ya estaba en el `set`
            }
        }
        return false; // Si no se encontraron duplicados
    }
}