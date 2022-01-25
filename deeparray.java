package dat.src;

import java.util.Arrays;

public class deeparray {
    public static void main(String[] args) {
        int array1[] = {1,2,3,4,5},array2[],nilai=100;
        //array = pass by reference from fuction 
        //variabel biasa/ DATA PRIMITIVE= pass by value from function
        System.out.println("ARRAY=>PASS BY REFERENCE");
        array2=new int[5];
        System.out.println(array1);
        System.out.println(array2);

        array2=array1;
        System.out.println(array1);
        System.out.println(array2);
        
        array1[0]=100;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        fungsiarray(array1);
        System.out.println(Arrays.toString(array2));

        System.out.println("FUNGSI VARIABEL=>PASS BY VALUE");
        fungsivar(nilai);
        System.out.println("luar fungsi "+nilai);
    }
    private static int fungsiarray(int array1[]){
        return array1[1]=20;
    }

    private static void fungsivar(int a){
        a=10;
        System.out.println("dalam fungsi :"+a);
    }
}
