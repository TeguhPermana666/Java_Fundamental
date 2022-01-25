package dat.src;
import java.util.Scanner;
public class methodeex {
    public static void main(String[] args) {
        //Merantaikan exception
                    //   0 1 2 null
        int[] arraydata={1,2,3};
        System.out.println("Data ke :");
        Scanner userinput=new Scanner(System.in);
        int input = userinput.nextInt();

        int nilai=take_array(arraydata,input);
        System.out.printf("Index %d Bernilai : %d",input,nilai);
        //Alamat yang null otomatis bernilai 0 keren.
        int trowfungsi;
        try {
            trowfungsi=fungsi_ex(input,arraydata);
            System.out.printf("Nilai index %d adalah %d",arraydata[trowfungsi],trowfungsi);
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("END ABOUT THROWS");
        }
        userinput.close();
    } 


    private static int fungsi_ex(int index,int array[])throws Exception{
        //melemparkan execption untuk di ujikan pada try
        int hasil= array[index];
        return  hasil;
    }
    //Transeferin Doang anjir bendingan pakai input aja dah wkwk
    private static int take_array(int array[],int index){
        int hasil=0;
        try{
            hasil=array[index];
        }
        catch(Exception e){
            System.out.println("ERROR");
        }
        finally{
            System.out.println("Akhir Dari Program");
        }
        return hasil;
    }
}
