package dat.src;

import java.io.FileInputStream;
import java.io.IOException;

public class io_stream {
    public static void main(String[] args) throws IOException{
        FileInputStream data = new FileInputStream("input.txt");
        System.out.println(data.read()); 
        data.close();
    }
}
