package dat.src;

import java.util.Scanner;

public class methode {
    public static void main(String[] args) {
        int a,y;
        Scanner userInput = new Scanner(System.in);
       System.out.print("Nilai: "); a=userInput.nextInt();
        userInput.close();
        y=hitung(a);
        System.out.printf("Eksponen %d = %d",a,y);
    }
    private static int  hitung(int x){
        int hasil= x * x;
        return hasil;
    }
}
