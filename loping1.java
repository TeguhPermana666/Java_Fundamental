package dat.src;

public class loping1 {
    public static void main(String[] args) {
    /*perulangan
        1.while
        2.do while
        3.for
        4.rekrusif
    */
        int i=0;
        boolean kondisi=true;
        while (kondisi) {
            System.out.println("Babi di while loping");
            if(i==4){
                System.out.println("END OF PROGRAM");
                kondisi=false;
            }
            i++;
        }
    }
}
