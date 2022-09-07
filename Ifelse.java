import java.util.Scanner;

public class Ifelse {

    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        int salary=input.nextInt();
        // if(salary>10000){
        //     salary=salary+2000;
        // }
        // else{
        //     salary=salary+1000;
        // }

        if(salary>10000){
            salary=salary+2000;
        }
        else if(salary>20000){
            salary+=3000;
        }
        else{
            salary=salary+1000;
        }
        System.out.println(salary);
    }
}