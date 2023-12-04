/*
 * Ausgabe:
 * 10
 * 11
 * 23
 * 35
 */

public class Inkrement {
    public static void main (String[] args)
    {
        int x, z = 10;
    
        System.out.println (x = z++);  
        System.out.println (z = ++x);  
        System.out.println (x += ++z);  
        System.out.println (z += x++);  
    }
}