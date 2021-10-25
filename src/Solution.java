import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// ENUNCIADO:

/* Un cop arribats a final de curs és necessari saber quina nota us queda de primer de DAM de mitjana. El programa consisteix en introduir 4 notes corresponents a les 4 UFs i calcular-ne la mitjana.

Input Format

Introdueix 4 nombres reals.

Constraints

Els nombres han d'estar en l'interval [0,10] 0 <= nota <= 10, on nota és qualsevol de les 4 notes introduïdes.

Output Format

Com a resultat s'ha de treure la mitjana artimètica de les 4 notes. En cas de decimals cal arrodonir la nota fent ús de Math.round() (https://guru99.es/math-java/)

Sample Input 0

4.0
5.0
6.0
8.0
Sample Output 0

6
Sample Input 1

3.2
5.75
9.45
1.2
Sample Output 1

5

*/






public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double nota4 = sc.nextDouble();

        double notaFinal = nota1 + nota2 + nota3 + nota4;
        double notaFinalRounded = (notaFinal/4);
        System.out.println(Math.round(notaFinalRounded));





    }



}
