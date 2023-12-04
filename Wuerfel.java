
/**
 * gibt das Volumen und die Oberfläche eines Würfels mit gegebener Kantenlänge aus
 */

public class Wuerfel{
    public static void main(String[]args){
        int kantenlänge = 3;
        int volumen, oberfläche;

        volumen = kantenlänge * kantenlänge * kantenlänge;
        oberfläche = kantenlänge * kantenlänge * 6;

        System.out.println("Volumen: " + volumen);
        System.out.println("Oberfäche: " + oberfläche);
    }
}
