import java.util.Scanner;
import javax.swing.JOptionPane;
public class salida {

public static void main (String args[]){
System.out.println("Esto es la prueba de un programa en este lenguaje");

int entero = 1;

int entero2 = 5+5;

double decimal = 222.5;

procedimiento (entero,entero2);
suma (decimal);
String algo1 = "Hola";

String algo2 = "Mundo";

String salida = stringSalida (algo1,algo2);;

System.out.println("La nueva salida es:");
System.out.println(salida);
Ciclos ();
System.out.println("Esto es la prueba de un cambio");
int nuevo = metodo (entero);;

switch (nuevo){
case 18:
System.out.println("La entrada es 18");

break;

 case 20:
System.out.println("La entrada es 20");

break;
 case 23:
System.out.println("LA entrdad es 23 y hara un proceimineto de saludo");

saludo ();
break;
}
System.out.println("Probaremos la lectura para saludar con un procedimiento");
String nombre;
String Apellidos;
nombre=JOptionPane.showInputDialog("Ingresa el dato");
Apellidos=JOptionPane.showInputDialog("Ingresa el dato");
saludoNombre (nombre,Apellidos);
}
public static int metodo(int asd){
System.out.println("Esto es una prueba de una funcion");

int nuevo = asd+22;

System.out.println("El resultado de la suma es:");
System.out.println(nuevo);
return nuevo;
}

public static void procedimiento(int algo,int asd){
System.out.println("Prueba de procedimiento");

int entero = algo+asd;

int asd2 = 555;

System.out.println("La Suma De Los Dos Entero Es");
System.out.println(entero);
System.out.println("Fin del procedimiento");
}
public static void suma(double cosas){
System.out.println("Procedimeinto con suma de flotantes");

double decimal = 55.2+cosas;

System.out.println("La suma de decimales es ");
System.out.println(decimal);
}
public static String stringSalida(String a,String b){
String algo;

algo = a+b;

System.out.println(algo);
return algo;
}
public static void Ciclos(){
System.out.println("Esto es una prueba con ciclos");

int entero = 22;

System.out.println("Ciclo for \n");
for(int i = 1; i<6; i++){
System.out.println("Aumento");

entero = entero+1;

System.out.println(entero);
}
int cosas = 5;

System.out.println("Ciclo mientras");
while (cosas>1){
System.out.println("Se mantiene el ciclo mientras");

cosas = cosas-1;

System.out.println(cosas);
}
}
public static void saludo(){
System.out.println("Hola mucho gusto");

}
public static void saludoNombre(String nombre,String apellidos){
String nuevo;

nuevo = nombre+apellidos;

System.out.println("Hola mucho gusto");
System.out.println(nuevo);
}
}