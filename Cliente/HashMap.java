/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

/**
 *
 * @author munoz
 */
import java.util.HashMap;

public class HashMap {
    
    HashMap<Cliente,Vehiculo> ClienteVehiculos;

    public HashMap() {
        ClienteVehiculos = new java.util.HashMap();
    }
       public void agregarVehiculo(Cliente cliente, Vehiculo vehiculo) {
        ClienteVehiculos.put(cliente,vehiculo);
    }
        public String buscarPalabra(Cliente cliente, Vehiculo vehiculo) {
        return ClienteVehiculos.getOrDefault(cliente,"Cliente no encontrado");
    }
        
       
}
