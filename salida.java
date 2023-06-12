import java.util.Scanner;
import javax.swing.JOptionPane;
public class salida {
public static void main(String [] args) {
 Scanner myObj = new Scanner(System.in);

System.out.println("EstoEsUnaPrueba");
System.out.println("Variables");
int entero = 1;

String string;
double decimal = 22.5;

System.out.println("Flotane");
System.out.println(decimal);
int entero2 = 5+5;

System.out.println("numEntero");
System.out.println(entero);
System.out.println("Entero2");
System.out.println(entero2);
for(int i = 1; i<5; i++){
entero2 = entero2+1;

}
System.out.println("Entero2");
System.out.println(entero2);
if (entero2<entero){
System.out.println("EsMenor");
}else {
if (55>22){
System.out.println("EsMayor");
}
}
}
}