import java.util.Scanner;
public class question3 {
   public static void main(String[]args){
       Scanner in= new Scanner(System.in);
       System.out.println("Enter the principal value :");
       int  principal=in.nextInt();
       System.out.println("Enter the rate value :");
       int rate=in.nextInt();
       System.out.println("Enter the time value :");
       int time =in.nextInt();
       int simple_interest;
       simple_interest=(principal*rate*time)/100;
       System.out.println(simple_interest);


   }
}
