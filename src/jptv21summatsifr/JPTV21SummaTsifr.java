
package jptv21summatsifr;

import java.util.Scanner;

public class JPTV21SummaTsifr {

    public static void main(String[] args) {
      System.out.println("vvedite 4islo: ");
        int x = new Scanner(System.in).nextInt();
        int summ = 0;

        while (x > 0) {
            summ += x % 10;
            x /= 10;
        }
        System.out.println("summa tsifr: " + summ);
    }
    
}
