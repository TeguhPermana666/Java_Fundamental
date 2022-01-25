package dat.src;

import java.io.FileInputStream;
import java.util.Scanner;

public class exeption {
    public static void main(String[] args) {
        //Membuka file
        /* 
        Managed execption agar tidak terjadi eror runtime
        =>User memasuki diluar kelakuan dari program
        
        -try:
        coba lakukan ini(blok code pada {}),jika ada exception maka diambil
        menggunakan catch

        ->catch
        =>menangkap execption yang ditandai dengan pemberian pesan pada terminal

        ->finaly
        =dijalankan setelah try dan catch dilakukan
        biasanya dipakai untuk mengclose file, dimana buka file terjadi pada
        try dan catch , sudah selesai maka dilakukan sebuah finaly.
        */
        int array []={1,2,3,4};
        FileInputStream data=null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Inputkan Index Array:"); int index=userInput.nextInt();
        try{
        System.out.printf("Index Inputan %d adalah %d",index,array[index]);
        }
        catch(Exception e){//Menangkap execpion dengan kode e
            System.out.println(e);
            System.err.println("ERROR");
        }
        finally{
            System.out.println("Selesai");
        }
        try{
            data=new FileInputStream("input.txt");
        }
        catch(Exception e){

            System.err.println("ERRO FILE NOT FOUND");
        }
        finally{
            System.out.println("END");
        }
        System.out.println(data);
        userInput.close();
    }
}
