package dat.src;

public class lop_array {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        //primitf
        System.out.println("Primitve");
        for(int i=0;i<5;i++){
            System.out.println(array[i]);
        }
        //used function
        System.out.println("leght");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        //collection
        System.out.println("collection");
        for(int nilai:array){
            System.out.println(nilai);
        }
    }
}
