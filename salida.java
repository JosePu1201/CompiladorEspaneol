import java.util.Scanner;
import javax.swing.JOptionPane;
public class salida {

public static void main (String args[]){
System.out.println("EstoEsUnaPruebaMain");

int entero = 1;

int entero2 = 5+5;

double decimal = 222.5;

procedimiento (entero,entero2,decimal);
suma (decimal);
}
public static int metodo(int asd){
int nuevo = asd+22;


return nuevo;
}

public static void procedimiento(int algo,int asd,double cosas){
System.out.println("EstoEsUnProcedimiento");

int entero = algo+asd;

int asd2 = 555;

System.out.println("LaSumaDeLosDosEnteroEs");
System.out.println(entero);
entero = metodo (entero);;

System.out.println(entero);
}
public static void suma(double cosas){
System.out.println("EstoEsUnProcedimiento");

int entero = 55+22;

System.out.println("LaSumaDeLosDosEnteroEs");
System.out.println(entero);
}
}