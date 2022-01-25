package dat.src;
import java.util.*;
public class latihan_array {
    public static void main(String[] args) {
        //Penjumlahan
        System.out.println("Penjumlahan");
        int array1[]={5,4,3,2,1};
        int array2[]= Arrays.copyOf(array1,array1.length);
        print(array1, "Array1= ");
        print(array2,"Array2=");
        int hasil_jumlah[]= Penjumlahan(array1, array2);
        print(hasil_jumlah,"Penjumlahan= ");
        //Sorting.
        int array3[]={9,8,7,6,5,4,3,2,1,0};
        Arrays.sort(array3);
        print(array3, "Sort Array 3=");

        //Sorting kebelakang
        int hasil_sortback[]=sort_back(array3);
        print(hasil_sortback, "Sortback= ");
    }
    private static void print(int array[], String Message){
        System.out.println(Message+" = "+Arrays.toString(array));
    }
    private static int Penjumlahan(int array1[], int array2[])[]{
        int hasil_jumlah[]= new int[array1.length];
        for(int i=0;i<array1.length;i++){
            hasil_jumlah[i]=array1[i] + array2[i];
        }
        return hasil_jumlah;
    }
    private static int sort_back(int array3[])[]{
        int buffer;
        //9,8,7,6,5,4,3,2,1
        //1,2,3,4
        //5
        //6,7,8,9
        for(int i=0;i<array3.length;i++){
            if(i==array3.length/2){
                break;
            }
            buffer=array3[i];
            array3[i]=array3[(array3.length-1)-i];
            array3[(array3.length-1)-i]=buffer;
        }
        return array3;
    }
}
