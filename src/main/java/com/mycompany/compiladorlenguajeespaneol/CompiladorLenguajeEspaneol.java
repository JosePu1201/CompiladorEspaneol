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
/*
    Pruebas Xd
    Si(8>4)
    Texto algo;
    Finsi
    Sino
    Si(5<25)
    Texto nunca;
    Finsi
    Finsi
    */
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
//    public String crearFor(String priemro,String segundo){
//        String salida = "";
//        try {
//            int uno = Integer.parseInt(priemro);
//            int dos = Integer.parseInt(segundo);
//            if(uno != dos){
//                if(uno < dos){
//                    salida = "for(int i = "+uno+"; "+"i"+">"+dos+"; i++){\n";
//                }
//                else{
//                    salida = "for(int i = "+dos+"; "+"i"+"<"+uno+"; i--){\n";
//                }
//            }
//        } catch (Exception e) {
//        }
//        return salida;
//    }
}
