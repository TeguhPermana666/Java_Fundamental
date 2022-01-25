package dat.src;

import java.util.Scanner;

public class dowile {
    public static void main(String[] args) {
        int n,i=0;
        //Input
        Scanner inputUser=new Scanner (System.in);
        System.out.print("Masukan Batas:");
        n=inputUser.nextInt();
        inputUser.close();
        System.out.println("Nilai:");
        do{
            System.out.printf("%d ",i+1);
            i++;
        }while(i<n);   
    }
}
