package dat.src;

public class Formatstring {
    public static void main(String[] args) {
        String nama="Teguh";
        int Umur=10;
        System.out.println("Nama="+nama+" Umur= "+Umur);
    //conversion=d,s,c,b;
    //Struktur format =[argumen index$], [flags],[width],[.precision]conversion
        //Argumen index
        System.out.printf("Nama ku %1$s beli nasi %1$s, harganya %2$d",nama,10000);

        //flags
        int a=10;
        int b=12;
        int hasil=a+b;
        System.out.printf("\n%d - %d = %+d",a,b,hasil);

        //width
        int c=1000;
        System.out.println("INTEGER");
        System.out.printf("\n%10d",c);
        System.out.printf("\n%+-10d",c);
        System.out.printf("\n%010d\n",c);
        System.out.printf("%,10d\n",c);
        long d=1000000000;
        System.out.printf("%-,1d\n",d);

        //.precesion
        double pecahan=3.7666;
        System.out.printf("Nilai %.2f",pecahan);
    }
}
