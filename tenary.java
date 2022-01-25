package dat.src;

import java.util.Scanner;

public class tenary {
    public static void main(String[] args){
        int a;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input Nilai: ");a=userInput.nextInt();
        userInput.close();
        int x=(a==10)? ((int)Math.pow(a, 2)) : (a/2);
        System.out.println("Nilai = "+x);        
    }
}
