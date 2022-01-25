package dat.src;

import java.util.Scanner;

public class gantijika {
    public static void main(String[] args) {
        String data;
        Scanner userInput=new Scanner(System.in); 
        System.out.print("Masukan Nama:");data=userInput.nextLine();
        userInput.close();
        switch(data){
            case "teguh":
                System.out.println("Teguh Disini!");
                break;
            case "babi":
                System.out.println("Maksudmu apa ni ?!!");
                break;
            default:
                System.out.println("Ketik diantara babi dan aku");
                break;
        }
        System.out.println("Pemilihan Selesai!!"); 
    }
}
