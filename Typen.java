
/**
 * Überlegungen: 
 * 1. Das Programm gibt  0 aus, da 0.9F in ein int umgewandelt wird -> 0 (wird immer abgerundet) und danach erst wird 0*2 gerechnet -> 0
 * 2. Das Programm gitb 50 aus, da 7/2 -> 3 + 2 -> 5 * 10 -> 50
 * 3. Das Programm gibt 3,0 aus, da beide quotienen ganzzahlen sind -> Ganzzahldivision -> 10/3 -> 3 zu float -> 3,0
 * 4. Das Programm gibt 3,3333333 aus, da nun ein Quotient vom Datentyp Float ist -> bis zu genauest möglichen stelle -> grenze von float
 */

public class Typen {
    public static void main(String [] args){
        int   i;
        float f;
        i = (int)0.9F*2;
        System.out.println(i);
        i = 2;
        i = 10 * (i + 7/2);
        System.out.println(i);
        f = 10/3;
        System.out.println(f);
        f = 10;
        f = f/3;
        System.out.println(f);
    }
}
