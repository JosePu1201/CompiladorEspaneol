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
 Escribir("EstoEsUnaPrueba");
Escribir("Variables");
Entero entero = 1;
Texto string;
flotante decimal = 22.5;
Escribir("Flotane");
Escribir(decimal);
Entero entero2 = 5+5;
Escribir("numEntero");
Escribir(entero);
Escribir("Entero2");
Escribir(entero2);
para(1,5)	
	Escribir(entero2);
	entero2 = entero2 +1;
finpara
Escribir("Entero2");
Escribir(entero2);
Si( entero2 < entero )
	Escribir("EsMenor");
Finsi
Sino
	Si(55>22)
	
		Escribir("EsMayor");
		Escribir("EsMayor");
	Escribir("EsMayor");
	Finsi
Finsi

cambio(entero2)
caso 1:
Escribir("hola");
parar
caso 2:
Escribir("hola");
parar
caso 3:
Escribir("hola");
parar
caso 44:
Escribir("hola");
parar
caso 14:
para(1,20)
Escribir("ESooo");
finpara
parar

finCaso
mientras(entero2>5)
	Escribir("While");
	entero2 = entero2-1;
finMientras	
Escribir("Entero2Es");
Escribir(entero2);
    */
    public static void main(String[] args) {
        /*
        Frame principal y ventanas*/
        JFrame ventana = new JFrame();
        panelPrincipal panel = new panelPrincipal();
        ventana.setTitle("CompiladorE");
        ventana.setSize(1000, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.add(panel);
        ventana.setVisible(true);
    }

}
