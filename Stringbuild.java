package dat.src;

import java.lang.StringBuilder;

public class Stringbuild {
    public static void main(String[] args) {
        StringBuilder Nama;
        Nama=new StringBuilder("Teguh");
        print(Nama);
        print(Nama.append(" Jembut memek kimoci"));
        //Casting
        String casting=Nama.toString();
        System.out.println("Nama: "+casting);
        int addresbuild=System.identityHashCode(casting);
        System.out.println("Alamat: "+Integer.toHexString(addresbuild));
    }
    private static void print(StringBuilder nama){
        System.out.println("Nama= "+nama);
        System.out.println("Ukuran= "+nama.length());
        System.out.println("Capacity= "+nama.capacity());
        //default 16,total =leght +default
        int addresbuild=System.identityHashCode(nama);
        System.out.println("Addres= "+Integer.toHexString(addresbuild));
    }
}
