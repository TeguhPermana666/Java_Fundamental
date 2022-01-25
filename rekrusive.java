package dat.src;
import java.util.*;
import java.lang.String;
public class rekrusive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai: ");
        int nilai =input.nextInt();
        input.close();
        int hasil=rekrusif(nilai,"\nAtas");
        System.out.printf("\nHasil %d", hasil);
    }
    private static int rekrusif(int nilai,String daun){
        System.out.printf("\nDaun %s", daun);
        System.out.printf("\nFibonaci %d", nilai);
        if(nilai==1){
            return nilai;
        }
        else if(nilai==0||nilai==-1){
            return nilai;
        }
        else{
            return rekrusif(nilai-1,"kiri")+rekrusif(nilai-2,"kanan");
        }
    }
}
