package dat.src;

public class bitwise {
    public static void main(String[] args) {
        byte a=3;
        byte b;
        String a_bit,b_bit;

        System.out.println("=====Left");
        a_bit=String.format("%8s",Integer.toBinaryString(a));
        System.out.printf("%s = %i\n",a_bit,a);

        b=(byte)(a<<3);
        b_bit=String.format("%8s",Integer.toBinaryString(b));
        System.out.printf("%s = %i",b_bit,b);

    }
}
