package dat.src;

import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
        String kalimat="BABI NGEPET";
        String kata= kalimat.substring(5, 11);
        System.out.println(kata);
        //Casting, karena print itu di format ke string
        int jumlah=10;
        System.out.println(kata+ jumlah);
        //upper and lower case
        System.out.println(kata.toUpperCase());
        System.out.println(kata.toLowerCase());
        //Replace
        String kalimat2;
        kalimat2=kalimat.replace("BABI", "MANUSIA");
        System.out.println(kalimat2);
        //Equality (persamaa)
        String a="Test";//dalam string pool.
        String b="Test";//Dalam string pool.
        String c = new String("Test");//Bukan string litelar dan bukan string dalam pool
        if(a==b){
            System.out.println("SAMA");
        }
        else{
            System.out.println("TIDAK SAMA");
        }

        if(a==c){
            System.out.println("SAMA");
        }
        else{
            System.out.println("TIDAK SAMA");
        }

        Scanner userinput = new Scanner(System.in);
        String kalimat_input= userinput.nextLine();
        //Bukan dalam string pool karena 
        //== adalah membandingkan dengan reference adrees lalu besaran ascii setiap char pada array of string
        System.out.println(kalimat_input);
        if(a==kalimat_input){
            System.out.println("SAMA");
        }
        else{
            System.out.println("TIDAK SAMA");
        }
        userinput.close();
        //Cara bandingkan isi string??
        //=>dengan equals pada string
        if(kalimat_input.equals(a)){
            System.out.println("SAMA");
        }
        else{
            System.out.println("TIDAK SAMA");
        }
    }
}
