/**
 * Ziel: Möglichst wenige Münzen ausgeben für beträge unter 5€
 */
public class Muenzen {
    public static void main(String[]args){
        double auszahlen = 4.73;      //Eingangswert
        int rest = (int) (auszahlen * 100);     //noch auszuzahlender betrag
        int werte[] = {200, 100, 50, 20, 10, 5, 2, 1};      //Werte der Münzen
        int anzahl[] = {0, 0, 0, 0, 0, 0, 0, 0};
        
        for(int i = 0; i < werte.length; i++){
            while(rest >= werte[i]){
                rest = rest - werte[i];
                anzahl[i] = anzahl[i] + 1;
            }
        }
        System.out.println("Betrag: " + auszahlen);
        System.out.println("2€:     " + anzahl[0]);
        System.out.println("1€:     " + anzahl[1]);
        for(int i = 2; i < werte.length; i++)
            System.out.println(werte[i] + "ct:  " + anzahl[i]);
    }
}