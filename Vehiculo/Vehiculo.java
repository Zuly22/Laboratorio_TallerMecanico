/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;



/**
 *
 * @author DaniTini
 */
public class Vehiculo { 
    private String matrícula;
    private String modelo;
    private String marca; 
    private int aniofabricación;

    public String getMatrícula() {
        return matrícula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAniofabricación() {
        return aniofabricación;
    }

    public Vehiculo(String matrícula, String modelo, String marca, int aniofabricación) {
        this.matrícula = matrícula;
        this.modelo = modelo;
        this.marca = marca;
        this.aniofabricación = aniofabricación;
    }

    public Vehiculo() {
        this("","","",0);
    }
//gptoo
    @Override
    public String toString() {
        return "Vehiculo{" + "matr\u00edcula=" + matrícula + ", modelo=" + modelo + ", marca=" + marca + ", aniofabricaci\u00f3n=" + aniofabricación + '}';
    }
}
