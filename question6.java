import java.util.Scanner;
public class question6 {
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the amount(in Rupees):");
    int r=in.nextInt();
    float d= (float) r / 82;
    System.out.println("the amount (in dollar) is: "+d);
    }
}
