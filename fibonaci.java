package dat.src;
import java.util.*;
public class fibonaci{
    public static void main(String[] args) {
        /* 
        0 1 1 2 3 5 8 13 ...
        */
        int i=0,n,fn1=1,fn2=0,nilai;

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Nilai Batas:");
        n = scan.nextInt(); 
        scan.close();
        while(i<n){
            nilai=fn1+fn2;
            System.out.printf("%d   ",nilai);
            fn2=fn1;
            fn1=nilai;
            i++;
        }
    }
}