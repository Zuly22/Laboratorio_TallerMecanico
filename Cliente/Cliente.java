/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

/**
 *
 * @author munoz
 */
public class Cliente {
    private int ID;
    private String nombre;
    private String teléfono;
    private String dirección;

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public String getDirección() {
        return dirección;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public Cliente(int ID, String nombre, String teléfono, String dirección) {
        this.ID = ID;
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.dirección = dirección;
    }

    public Cliente() {
        this(0," "," "," ");
    }
    
    @Override
    public String toString() {
        return "Cliente" + "ID=" + ID + ", nombre=" + nombre + ", tel\u00e9fono=" + teléfono + ", direcci\u00f3n=" + dirección;
    }
}
