import java.util.Scanner;
public class que9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Value to check: ");
        int n = in.nextInt();
        int sum = 0;
        int b = n;
        while (n > 0) {
            int r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }
        if (sum == b) {
            System.out.println("The number is the armstrong number");
        } else {
            System.out.println("the number is not an armstrong number");
        }
    }
}
