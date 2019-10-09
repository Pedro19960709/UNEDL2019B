
package Polidromo;

import java.util.Scanner;

    import java.util.Scanner;


public class Polidromo {
    public static boolean Polindromo(String Palabra){
        for (int i = 0; i < Palabra.length(); i++) {
            if (Palabra.charAt(i)!= Palabra.charAt(Palabra.length()-i-1)) {
               return false; 
            }
        }
        return true;
    }
    public void CargarDatos(){
         String Palabra="";
        Scanner dato = new Scanner (System.in);
        System.out.println("Ingresa la frase");
        Palabra=dato.nextLine();
        Palabra = Palabra.replace(" ","");
        if (Polindromo(Palabra)==true) {
            System.out.println("La frase es un polindromo\n"+Palabra);
        }else{
            System.out.println("La frase no es un polindromo\n"+Palabra);
        }
    }
    public static void main(String[] args) {
        Polidromo po = new Polidromo ();
        po.CargarDatos();
    }
}

