/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.compiladorlenguajeespaneol.Grafico;

import com.mycompany.compiladorlenguajeespaneol.Flex_Y_Cup.Lexer;
import com.mycompany.compiladorlenguajeespaneol.Flex_Y_Cup.parser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.xml.sax.ext.LexicalHandler;

/**
 *
 * @author jose
 */
public class Botones extends javax.swing.JPanel {
    
    private panelPrincipal panel;
    private String salida;

    /**
     * Creates new form Botones botones de aaccion para compilaa, ejecutar,
     * limpiar pantalla y acerca de
     */
    public Botones(panelPrincipal panel) {
        this.panel = panel;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 0));
        jButton1.setText("Compilar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);

        jButton2.setBackground(new java.awt.Color(102, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 255, 0));
        jButton2.setText("Ejecutar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);

        jButton3.setBackground(new java.awt.Color(102, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 255, 0));
        jButton3.setText("Limpiar pantallas ");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);

        jButton4.setBackground(new java.awt.Color(0, 255, 0));
        jButton4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Acerca de");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
    }// </editor-fold>//GEN-END:initComponents
    /*
    *Obtiene el tecto del area de texto en basa a las salidas del parser en caso de que no tenga ningun error
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String entrada = panel.getCentro().getEntrada().getText();
        StringReader lectrua = new StringReader(entrada);
        Lexer lexer = new Lexer(lectrua);
        parser nuevoparser = new parser(lexer);
        try {
            nuevoparser.parse();
        } catch (Exception ex) {
            Logger.getLogger(Botones.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (!nuevoparser.getError()) {
            salida = "import java.util.Scanner;\n"
                    + "import javax.swing.JOptionPane;\n"
                    + "public class salida {\n"
                    + "public static void main(String [] args) {\n"
                    + " Scanner myObj = new Scanner(System.in);\n";
            for (String salida1 : nuevoparser.getSalidas()) {
                salida = salida + "\n" + salida1;
            }
            salida = salida + "\n}\n}";
            panel.getCentro().getTerminal().setText(salida);
            crer(salida);
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la lectura del archivo");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    /*
    *Limpa los dos areas de texto
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        panel.getCentro().getTerminal().setText("");
        panel.getCentro().getEntrada().setText("");
    }//GEN-LAST:event_jButton3ActionPerformed
    /*
    *invoca los metodos de terminal para poder ejecutar desde la app
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        comandos("javac", "salida.java");
        comandos("java", "salida");

    }//GEN-LAST:event_jButton2ActionPerformed
    /*
    *Informacion a cerca del programa
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String algo = "Espaneol\n"
                + "El siguiente lenguaje esta creado\n"
                + "con el fin de que el usuario cree\n"
                + "codigo en espanol para que luego el\n"
                + "id lo compile a codigo java y luego\n"
                + "lo ejecute, a continuacion te mostramos\n"
                + "ejemplos de la sitaxis:\n\n"
                + "Escribir en consola:\n"
                + "\tEscribir(\"Texto a esfribir\")\n"
                + "Crear variables:\n"
                + "\tEntero nombreVariable;\n"
                + "\tTexto nombreVariable;\n"
                + "\tflotante nombreVariable;\n"
                + "Ciclos:\n"
                + "\tpara(puntoa,puntob)\n"
                + "\tUna linea de codigo de otro tipo\n"
                + "\tfin para\n"
                + "Comparaciones:\n"
                + "\tSi(condicion)\n"
                + "\tUna linea de codigo de otro tipo\n"
                + "\tFinSi\n"
                + "\tSino\n"
                + "\tUna linde de codigo de otro tipo\n"
                + "Lectura de entrada de texto:\n"
                + "\tLeer(vaariableDondeGuardar);\n"
                + "Para mas dudas o consultas consultar con el desarrollador\n"
                + "E-mail: joseluis-pusam@cunoc.edu.gt";
        JOptionPane.showMessageDialog(null, algo, "Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton4ActionPerformed
    /*
    *Comandos de ejecucion para la terminal
     */
    public void comandos(String primero, String segundo) {
        try {
            // Comando a ejecutar
            String[] command = {primero, segundo};

            // Crear el proceso
            ProcessBuilder pb = new ProcessBuilder(command);

            // Redirigir la salida del proceso
            pb.redirectErrorStream(true);

            // Iniciar el proceso
            Process process = pb.start();

            // Leer la salida del proceso
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            panel.getCentro().getTerminal().append("\n----------" + primero + " " + segundo + "----------");
            while ((line = reader.readLine()) != null) {
                panel.getCentro().getTerminal().append("\n" + line);
            }
            panel.getCentro().getTerminal().append("\n");
            // Esperar a que el proceso termine
            int exitCode = process.waitFor();
            System.out.println("El proceso terminó con el código de salida: " + exitCode);
            
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
    Creacion de los archivos .java previo a la eliminacion de los anteriores para evitar conflictos 
     */
    public void crer(String entrada) {
        comandos("rm", "salida.java");
        comandos("rm", "salida.class");
        try {
            String ruta = "salida.java";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(entrada);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
