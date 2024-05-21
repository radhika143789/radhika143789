        import java.util.Scanner;
public class a2_26{
    public static void main(String[]args){
        int sum=0;
        int t=0;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number of number  you wanna add ");
        int a= in.nextInt();
        for(int i=1;i<=a;i++){
            System.out.println("Enter the number");
            int b=in.nextInt();


            sum= sum+b;


        }
        System.out.println(sum);
    }
}
