import java.util.Scanner;
public class question_5 {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        System.out.println("Input the first number ");
        int a = in.nextInt();
        System.out.println("Input the second number ");
        int b = in.nextInt();
        if(a>b){
            System.out.println("the greatest number is "+a);
        }
        else{
            System.out.println("the greatest number is "+b);
        }

    }
}
