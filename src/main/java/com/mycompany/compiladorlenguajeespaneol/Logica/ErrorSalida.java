/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compiladorlenguajeespaneol.Logica;

/**
 *
 * @author jose
 */
public class ErrorSalida {
    private int fila;
    private int columna;
    private String descripcion;

    public ErrorSalida(int fila, int columna, String descripcion) {
        this.fila = fila;
        this.columna = columna;
        this.descripcion = descripcion;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Error{" + "fila=" + fila + ", columna=" + columna + ", descripcion=" + descripcion + '}';
    }
    
    

}
