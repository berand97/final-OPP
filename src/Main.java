import unac.edu.co.Auto;

import java.util.Scanner;

public class Main  {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la distancia que recorrera el auto 1");
        int h = scan.nextInt();
        System.out.println("Ingrese la distancia que recorrera el auto 2");
        int k = scan.nextInt();
        System.out.println("Ingrese la distancia que recorrera el auto 3");
        int l = scan.nextInt();
        Auto thread = new Auto(h,1);
        Auto thread2 = new Auto(k,2);
        Auto thread3 = new Auto(l,3);
        thread.start();
        thread2.start();
        thread3.start();
    }
}



