/* Zuweisung.java */
/*
 * Ausgabe:
 * 4
 * 8
 * 13
 * 18
 * 24
 * 12
 */

public class Zuweisung
{
    public static void main (String[] args)
    {
        int x = 3, y = 2, z; 
    
        System.out.println (z = x + 1); 
        System.out.println (z += x + 1);    
        System.out.println (z += x + y);   
        System.out.println (z += x += y);   //x=5 
        System.out.println (z += x += y = 1);  //x=6
        System.out.println (x *= x = 2);   
    }
}