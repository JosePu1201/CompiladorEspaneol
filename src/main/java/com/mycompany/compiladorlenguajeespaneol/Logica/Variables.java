/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compiladorlenguajeespaneol.Logica;

/**
 *
 * @author jose
 */
public class Variables {
    private String nombre;
    private String tipo;
    String dato;

    public Variables(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
    
}
