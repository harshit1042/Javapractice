import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        int ans=sum2();
        System.out.println(ans);
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = in.nextInt();
        System.out.print("Enter number 2:");
        int num2 = in.nextInt();
        int sum2=num1+num2;
        return sum2;   // return means function over , after return can't run any thing
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();
        int sum=num1+num2;
        System.out.println("The sum = "+ sum);
    }
}
