/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compiladorlenguajeespaneol;

import com.mycompany.compiladorlenguajeespaneol.Grafico.panelPrincipal;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author jose
 */
public class CompiladorLenguajeEspaneol {

    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        panelPrincipal panel = new panelPrincipal();
        ventana.setTitle("Compilador");
        ventana.setSize(1000, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.add(panel);
        ventana.setVisible(true);
    }
}
