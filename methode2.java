package dat.src;
import java.util.*;
public class methode2 {
    public static void main(String[] args) {
        //rekrusive =>perulangan dengan fungsi calling and called
        Scanner userInput = new Scanner(System.in);
        System.out.print("Nilai:");
        int nilai=userInput.nextInt();
        userInput.close();

        rekrusif1(nilai);
        System.out.printf("\n");

        int n2=rekrusif2(nilai);
        System.out.println("rekrusif2 adalah "+n2);
        
        System.out.printf("\n");
        int n3=rekrusif3(nilai);
        System.out.println("rekrusif3 adalah "+n3);
    }
    private static void rekrusif1(int nilai){
        if(nilai==0){
            return;
        }
        System.out.printf("%d ",nilai);
        rekrusif1(nilai-1);
    }
    private static int rekrusif2(int nilai){
        if(nilai==0){
            return nilai;
        }
        System.out.printf("%d ",nilai);
        
        return nilai + rekrusif2(nilai-1);
    }
    private static int rekrusif3(int nilai){
        System.out.printf("%d ",nilai);
        if(nilai==1){
            return nilai;
        }
        
        
        return nilai * rekrusif3(nilai-1);
    }
}
