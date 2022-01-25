package dat.src;

public class pointer {
    public static void main(String[] args) {
        
        intObj a= new intObj();
        // buat constrcutor objeck yang berarti memiliki alamat yang sama pada
        // a dengan class intObj dimana pada class tersebut terdapat sebuah
        // methode yakni int pada class intObj

        a.value=10;
        System.out.println(a.value);
        intObj b=a;
        //mengincludekan b agar alamatnya sama dengan a atau class intObj
        b.value=20;
        System.out.println(b.value);
        System.out.println(a.value);
        //Nilainya sama ?
        //karena b dan a alamat sama reference sama dan b assig nilai maka a
        // juga assigment sebuah nilai sebesar 20

    }
}
class intObj{
    public int value;
}
