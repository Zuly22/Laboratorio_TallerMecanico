/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.util.HashMap;
/**
 *
 * @author munoz
 */


public class ClienteVehiculo {
    
    HashMap<Cliente,Vehiculo> ClienteVehiculos;

    public HashMap<Cliente, Vehiculo> getClienteVehiculos() {
        return ClienteVehiculos;
    }
   
    public ClienteVehiculo() {
        ClienteVehiculos = new java.util.HashMap();
    }
       public void agregarVehiculo(Cliente cliente, Vehiculo vehiculo) {
        ClienteVehiculos.put(cliente,vehiculo);
    }
        public Vehiculo buscarPalabra(Cliente cliente, Vehiculo vehiculo) {
        return ClienteVehiculos.get(cliente);
        }

        
    @Override
    public String toString() {
        return "ClienteVehiculo" + "ClienteVehiculos=" + ClienteVehiculos;
    }
        
        
       
}
