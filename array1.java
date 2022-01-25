package dat.src;
import java.util.*;

public class array1 {
public static void main(String[] args) {
    int[] arrayinteger;
    int n,i;
//Deklarasi
    Scanner input= new Scanner(System.in);
    System.out.print("Nilai Batas:");
    n=input.nextInt();

    arrayinteger=new int[n];
    i=0;
    
    //inputssss
    while(i<n){
        arrayinteger[i]=input.nextInt();
        i++;
    }
    
    //output
    int j=0;
    while(j<n){
    System.out.println(arrayinteger[j]);
    j++;
    }
 input.close();
 int [] array2={1,2,3,4,5};
 array2[0]=2;
 System.out.println(array2[0]);
 System.out.println(array2[1]);
 System.out.println(array2[2]);
 System.out.println(array2[3]);
 System.out.println(array2[4]);
    }    
}
