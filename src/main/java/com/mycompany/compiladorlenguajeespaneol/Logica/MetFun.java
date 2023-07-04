/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compiladorlenguajeespaneol.Logica;

import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class MetFun {
    private boolean isFun;
    private String tipo;
    private String nombre;
    private ArrayList <Variables> parametros = new ArrayList<>();

    public MetFun(boolean isFun, String nombre) {
        this.isFun = isFun;
        this.nombre = nombre;
    }

    public boolean isIsFun() {
        return isFun;
    }

    public void setIsFun(boolean isFun) {
        this.isFun = isFun;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Variables> getVariables() {
        return parametros;
    }

    public void setVariables(ArrayList<Variables> variables) {
        this.parametros = variables;
    }
    
    
    
    
}
