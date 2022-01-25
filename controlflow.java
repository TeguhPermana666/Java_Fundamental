package dat.src;

public class controlflow {
    public static void main(String[] args) {
        //break,continue,return used
        /*
        =>Break=mengehntikan suatu jalannya program baik
        ->khususnya menghentikan jalannya sebuah loping
        
        =>continue = control program kembali keawal loping
        dimana di bawahnya akan di skip atau memulai aksi dari awal

        =>return digunakan untuk mengembalikan nilai pada methode
        yang ditandai dengan keluar dari methode.
        
        */
        int a=0;

        while(true){
            a++;
            if(a==10){
                break;
            }
            else if(a==5){
                continue;
            }
            if(a==9){
                return;
            }
            System.out.printf("%d   ",a);

        }
    }
}
