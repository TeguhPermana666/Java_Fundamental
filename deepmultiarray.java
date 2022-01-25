package dat.src;


import java.util.Arrays;

public class deepmultiarray {
    public static void main(String[] args) {
        int array[][]=
        {
            {1,2},
            {3,4,5,6},
            {7,8,9,10,11}
        };
        System.out.println(Arrays.toString(array));
        /*My logic about java
        Contructor OBject array{
            Object of state:
            a001
            a002
            a003
        }
        Behavior object
        a001{
            1,2.
        }
        a002{
            3,4,5,6.
        }
        a003{
            7,8,9,10,11
        }
        */
        System.out.println(Arrays.deepToString(array));
    }
}
