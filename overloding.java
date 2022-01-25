package dat.src;



public class overloding {
    public static void main(String[] args) {
        babi(10);
        babi(10.7f);
    }
    private static void babi(int a){
        System.out.printf("Nilai = %d",a);
    }
    private static void babi(float a){
        System.out.printf("\nNilai%.2f",a);
    }

}
