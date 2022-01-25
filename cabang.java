package dat.src;

import java.util.Scanner;
public class cabang {
    public static void main(String[] args) {
        int a;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Nilai= ");;a=inputUser.nextInt();
        inputUser.close();
        if(a==0){
            System.out.println("Nilai adalah "+a);
        }
        else{
            System.out.println("Nilai tidak NOL!!");
        }
    }
}
