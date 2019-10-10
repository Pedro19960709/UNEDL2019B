package Operadores;

import javax.swing.JOptionPane;

public class Operadores {

    int valor1;
    int valor2;
    String operador;
    int res = 0;
    boolean res2;

    //Mètodo para cuando tenga activado los operadores aritmèticos
    public int setOperadores(int valor1, int valor2, String operador) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operador = operador;

        switch (operador) {
            case "+":
                res = this.valor1 + this.valor2;
                System.out.println("Elegiste el operador suma");
                System.out.println("La suma de " + this.valor1 + " + " + this.valor2 + " es: " + res);
                break;
            case "-":
                res = this.valor1 - this.valor2;
                System.out.println("Elegiste el operador resta");
                System.out.println("La resta de " + this.valor1 + " - " + this.valor2 + " es: " + res);
                break;
            case "*":
                res = this.valor1 * this.valor2;
                System.out.println("Elegiste el operador multiplicacion");
                System.out.println("La multiplicacion de " + this.valor1 + " * " + this.valor2 + " es: " + res);
                break;
            case "/":
                res = this.valor1 / this.valor2;
                System.out.println("Elegiste el operador division");
                System.out.println("La division de " + this.valor1 + " / " + this.valor2 + " es: " + res);
                break;
            case "%":
                res = this.valor1 % this.valor2;
                System.out.println("Elegiste el operador de residuo");
                System.out.println("El residuo de " + this.valor1 + " % " + this.valor2 + " es: " + res);
                break;

        }
        return res;
    }

    //Mètodo para cuando tenga activado los operadores Lògicos
    public boolean setOperadoresLogicos(int valor1, int valor2, String operador) {
        res2 = false;
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operador = operador;
        
        switch (operador) {
            case "<":
               JOptionPane.showMessageDialog(null,"Si el valo1 es menor a valor2 sera true");
               if(this.valor1 < this.valor2){
                   res2 = true;
               }
               break;
               case ">":
               JOptionPane.showMessageDialog(null,"Si el valo1 es mayor a valor2 sera true");
               if(this.valor1 > this.valor2){
                   res2 = true;
               }
               break;
               case "<=":
               JOptionPane.showMessageDialog(null,"Si el valo1 es menor o igual a valor2 sera true");
               if(this.valor1 <= this.valor2){
                   res2 = true;
               }
               break;
               case ">=":
               JOptionPane.showMessageDialog(null,"Si el valo1 es mayor o igual a valor2 sera true");
               if(this.valor1 >= this.valor2){
                   res2 = true;
               }
               break;
               case "==":
               JOptionPane.showMessageDialog(null,"Si el valo1 es igual a valor2 sera true");
               if(this.valor1 == this.valor2){
                   res2 = true;
               }
               break;
               case "!=":
               JOptionPane.showMessageDialog(null,"Si el valo1 es diferente a valor2 sera true");
               if(this.valor1 != this.valor2){
                   res2 = true;
               }
               break;
               case "&&":
               JOptionPane.showMessageDialog(null,"Si el valo1 es mayor a 0 y valor2 tambien es mayor a 0 true");
               if(this.valor1 >0 && this.valor2 >0){
                   res2 = true;
               }
               break;
               case "||":
               JOptionPane.showMessageDialog(null,"Si el valo1 es mayor 0 o valor2 es mayor a 0 true");
               if(this.valor1>0 || this.valor2>0){
                   res2 = true;
               }
               break;
               
                

        }
        return res2;

    }
}
