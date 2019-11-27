
package Herencia;

import Herencia.Habilidades;
public class Hijo extends Padres implements Habilidades{

    public Hijo() {
        
    }
    

    public static void main(String[] args) {
        Hijo ref = new Hijo();
        System.out.println("########################## HERENCIA ##########################");
        System.out.println("\n-------------------- Atributos --------------------");
        System.out.println("Heredé de mi madre el color de cabello: " + ref.getColorCabello());
        System.out.println("Heredé de mi padre el color de piel: " + ref.getColorPiel());
        System.out.println("Heredé de ambos la baja estatura: " + ref.getEstatura() + " cm");
        System.out.println("Heredé de mi madre el color de los ojos: " + ref.getColorOjos());
        System.out.println("Heredé de ambos la complexión delgabada: " + ref.getPeso() + " kg");
        System.out.println("\n-------------------- Comportamientos --------------------");
        System.out.println("Heredé de mi padre: " + ref.movimientoOrejas());
        System.out.println("Heredé de mi madre: " + ref.limpieza());
        System.out.println("\n -------------------- Habilidades de terceros --------------------");
        System.out.println(ref.dibujar());
        System.out.println(ref.resolverEcuacionesDiferenciales());
    }

    public String dibujar() {
        return "Aprendí técnicas de dibujo de un profesor de la secundaria";
    }

    public String resolverEcuacionesDiferenciales() {
        return "Aprendí a resolver ecuaciones diferenciales de un físico";
    }

}
