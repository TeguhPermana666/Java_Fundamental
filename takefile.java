package dat.src;

import java.util.Scanner;

public class takefile {
    public static void main(String[] args) {
        //Membuat perhitungan menghitung luas persegi panjang
        //L=Pxl
        int p=10,l=5;
        int L=p * l;
        System.out.println("Nilainya adalah = "+L+" ,Gampang kan?");
        //Ambil input
            //Proses input
        Scanner userInput = new Scanner(System.in);
        System.out.printf("\nPanjang = ");
        int input1 = userInput.nextInt();
        System.out.printf("\nLebar = ");
        int input2 = userInput.nextInt();
        System.out.printf("\nTinggi = ");
        int input3 = userInput.nextInt();
        //Tutup Input biar ga bocor memorynya
        userInput.close();
        //Cetak
        System.out.println("Input adalah = "+input1+", " +input2+", " +input3);
        System.out.printf("\nLuas Balok adalah %d",input1 * input2 * input3);
    }
}
