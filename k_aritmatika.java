package dat.src;

import java.util.Scanner;

public class k_aritmatika {
    public static void main(String[] args) {
        int a,Nilai;
        Scanner inputUser = new Scanner(System.in);
        System.out.printf("Masukan Nilai= ");
        a=inputUser.nextInt();
        inputUser.close();
        Nilai=(int) Math.pow(a, 2);
        System.out.println("Nilai Adalah "+Nilai);
    }    
}
