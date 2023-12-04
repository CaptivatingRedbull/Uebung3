/**
 * 1. 11 Weil 4 * 5 -> 20 - 6 -> 14 - 3 -> 11
 * 2. 1  Weil 4 % 5 -> 4 + 3 -> 7 - 6 -> 1
 * 3. -2 Weil -3 * 5 -> -15 % -11 -> -4 / 2 -> -2
 */

/* Arithmetik.java */
public class Arithmetik
{
   public static void main (String[] args)
   {
        int n;
        n = - 3 + 4 * 5 - 6;
        System.out.println(n);
        n = 3 + 4 % 5 - 6;
        System.out.println(n);
        n = -3 * 5 % - 11 / 2;
        System.out.println(n);
   }
}
