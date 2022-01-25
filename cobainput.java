package dat.src;
import java.util.*;
public class cobainput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.printf("Inputan user :%d", a);
        System.out.printf("\n");
        Float b = input.nextFloat();
        System.out.printf("Nilai inputan user adalah %.2f",b);
        input.close();
    }
}
