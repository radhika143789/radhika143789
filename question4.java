import java.util.Scanner;
public class question4 {
    public static void main(String[]args){
        Scanner in= new Scanner (System.in);
        System.out.println("Enter first number: ");
        int a = in.nextInt();
        System.out.println("Enter second number: ");
        int b = in.nextInt();
        System.out.println(" menu:1 for addition /n 2 for subtraction /n 3 for multiplication /n 4 for division");
        System.out.println("choose the operation: ");
        int c = in.nextInt();
        if(c==1){
            int d;
            d= a+b;
            System.out.println("a+b="+d);
        }
        if(c==2){
            int d;
            d= a-b;
            System.out.println("a-b="+d);
        }
        if(c==3){
            int d;
            d= a*b;
            System.out.println("a*b="+d);
        }
        if(c==4){
            float d;
            d= a/b;
            System.out.println("a/b="+d);
        }
        else{
            System.out.println("Enter the valid choice");
        }
    }
}

