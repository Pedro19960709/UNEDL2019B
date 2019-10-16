/*
No pude crear la programacion orientada a objetos se me complico 
hacer los llamados de las clases y saber como utilizar los get y set;
*/
package Examen;

import java.util.Scanner;
public class TestTapiseria {

    Scanner dato;
    private float metros =0;
    private float costoTotal =0;
    private float precioTapiz = 0;
    private float dimencionlargo = 0;
    private float dimencionAncho = 0;
    
    
    public void CargarDatos(){
        dato = new Scanner (System.in);
        System.out.println("Ingresa el Tamaño de la habitacion\n");
        do{
        System.out.println("Dimencion de largo\t");
        dimencionlargo = dato.nextFloat();
        }while(dimencionlargo<0);
        do{
        System.out.println("Dimencion de ancho\t");
        dimencionAncho = dato.nextFloat();
        }while(dimencionAncho<0);
        do{
        System.out.println("Precio por metro cuadrado\t");
        precioTapiz = dato.nextInt();
        }while(precioTapiz<0);
        
    }
    public void OperacioDatos(){
        metros = dimencionlargo * dimencionAncho;
        System.out.println("Mis metros cuadrados son:\n"+metros);
        costoTotal=metros * precioTapiz;
        System.out.println("Precio por tapizar es de:\n"+costoTotal);
        
    }
    public static void main(String[] args) {
        TestTapiseria tp = new TestTapiseria();
        tp.CargarDatos();
        tp.OperacioDatos();
    }

}
