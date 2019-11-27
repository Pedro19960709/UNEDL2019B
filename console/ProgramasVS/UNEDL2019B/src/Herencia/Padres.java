
package Herencia;

public class Padres {

    protected float estatura;
    protected float peso;
    protected String colorPiel;
    protected String colorOjos;
    protected String colorCabello;

    public Padres() {//Estado inicial de los atributos
        estatura = 1.86f;
        peso = 120;
        colorPiel = "Negro";
        colorOjos = "cafe";
        colorCabello = "Negro";
    }
    
    protected String movimientoOrejas(){
        return "Movimiento de orejas";
    }
    
    protected String limpieza(){
        return "Obsesión con la limpieza";
    }
    
    public float getEstatura() {
        return estatura;
    }

    public float getPeso() {
        return peso;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public String getColorCabello() {
        return colorCabello;
    }

}


