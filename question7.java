import java.util.Scanner;
public class question7 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the nth value: ");
        int n = in.nextInt();
        int p=0;
        int i =1;
        int c=2;
        while(c<=n){
            int a =i;
            a=i+p;

            c++;
            p=i;
            i=a;
            System.out.println(p);
        }

    }
}
