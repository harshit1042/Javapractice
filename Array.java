import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // // syntax
        // // datatype[] variable_name = new datatype[size];
        // // int[] rno1 = new int[5];
        // Scanner in = new Scanner(System.in);
        // int[] arr = new int[5];
        // // input using for loops
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        String[] str =new String[4];
        for(int i=0;i<str.length;i++){
            str[i]= in.next();
        }

        System.out.println(Arrays.toString(str));

        //modify
        str[1]="harshit";
        System.out.println(Arrays.toString(str));

    }
}
