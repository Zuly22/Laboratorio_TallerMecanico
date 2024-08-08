/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ArrayListVehiculo {
    
    public static void main(String[] args) {
       
        
        ArrayList<Vehiculo>listaVehiculo = new ArrayList<>();
    
        listaVehiculo.add(new Vehiculo("5032254","Camaro","SSD",2025));
        listaVehiculo.add(new Vehiculo("50322","Toyota","Coroya",2023));
        listaVehiculo.add(new Vehiculo("50322","Toyota","Coroya",2023));
        listaVehiculo.remove(0);
        for(Vehiculo vehiculo : listaVehiculo){
            System.out.print(vehiculo);
        }
    } 
    
    
    
   
    
      
       
        }
    
