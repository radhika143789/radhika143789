import java.util.Scanner;
public class question8 {
    public static void main(String[]args){
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the number to check ");
    int n=in.nextInt();
    if(n >0){
        System.out.println("the number is palindrome");
    }
    else{
        System.out.println("the number is not palindrome");
    }
    }
}
