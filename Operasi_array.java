package dat.src;

import java.util.*;
public class Operasi_array {
    public static void main(String[] args) {
        int array_angka1[]={1,2,3,4,5};
        //mengubah aray menjadi string
        System.out.println("Merubah array ke string");
        print(array_angka1);

        //Mengcopy array
        System.out.println("\n\nMengcopy array ke array");
        System.out.println("\nMengcopy array dengan looping");
        int array_angka2[]=new int[array_angka1.length];
        for(int i=0;i<array_angka1.length;i++){
            array_angka2[i]=array_angka1[i];
        }
        print(array_angka1);
        print(array_angka2);
        System.out.println("\nALAMAT:");
        System.out.println(array_angka1);
        System.out.println(array_angka2);

        System.out.println("\n\nMengcopy Array dengan copyof");
        int array_angka3[];
        array_angka3=Arrays.copyOf(array_angka1, 5);
        print(array_angka3);
        System.out.println(array_angka3);
        System.out.println(array_angka1);

        System.out.println("\n\nMengcopy Array dengan copyofrange");
        int array_angka4[]=Arrays.copyOfRange(array_angka1, 0, 6);
        print(array_angka4);
        System.out.println(array_angka4);

        //Fill
        System.out.println("\n\nFill array");
        int array_angka5[]=new int[array_angka1.length];
        Arrays.fill(array_angka5, 9);
        print(array_angka5);

        //Komparasi array
        System.out.println("\n\nKomparasi array");
        int array_angka6[]={1,2,3,4,5,6};
        int array_angka7[]={1,2,3,4,5,7};

        if(Arrays.equals(array_angka6, array_angka7)){
            System.out.println("\nNilai di dalam Array sama");
        }
        else{
            System.out.println("\nNilai array di dalam tidak sama");
        }

        //Lebih besar pada array
        System.out.println("\nA1 > A2 Araay");
        System.out.println( Arrays.compare(array_angka6,array_angka7));

        int nilai=Arrays.compare(array_angka6,array_angka7);
        if(nilai==1){
            System.out.println("A1 LEBIH BESAR");
        }
        else if(nilai==-1){
            System.out.println("A2 LEBIH BESAR");
        }
        else{
            System.out.println("EQUALS");
        }

        //Mismatch=>mengetahui index yang berbeda
        System.out.println("\n\nMISMATCH OF INDEX AT ARRAY");
        int mismatch=Arrays.mismatch(array_angka6, array_angka7);
        if(mismatch==-1){
            System.out.println("\n=>Tidak ada yang berbeda pada index");
        }
        else{
            System.out.println("\n=>Index yang berbeda :"+mismatch);
        }
        int array_angka8[]={7,6,5,4,3,2,1,0};
        //sorting
        Arrays.sort(array_angka8);
        print(array_angka8);
        //Search
        int a=5;
        int e=Arrays.binarySearch(array_angka8,a);
        System.out.println("Nilai E= "+e);
    }
    private static void print(int array_angka[]){
        System.out.println("Array= "+ Arrays.toString(array_angka));
    }
}
