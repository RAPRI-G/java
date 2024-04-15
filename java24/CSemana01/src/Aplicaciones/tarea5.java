package Aplicaciones;
import java.util.Scanner;
public class tarea5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double radio, altura, area, volumen;
        final double PI = 3.14;
        
        System.out.print("ingrese su radio: ");
        radio = Float.parseFloat(teclado.nextLine());
        
        System.out.print("ingrese su altura: ");
        altura = Float.parseFloat(teclado.nextLine());
        
        
        area = 2 * PI * radio * (radio + altura);
        volumen = PI * radio * 2 * altura;
        System.out.println("----Reporte----");
        System.out.println("---------------");
        System.out.println("el radio es  :" + radio);
        System.out.println("La altura es: " + altura);
        System.out.println("El AREA es  : " + area);
        System.out.println("El VOLUMEN es  : " + volumen);
    }
}
