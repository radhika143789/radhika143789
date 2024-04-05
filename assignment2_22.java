import java.util.Scanner;

public class Solution {
    public int subtractProductAndSum(int n) {
        int p = 1;
        int s = 0;

        while (n != 0) {
            int r = n % 10;
            s += r;
            p *= r;
            n = n / 10;
        }

        int d = (s - p);
        return d;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Solution solution = new Solution();
        int result = solution.subtractProductAndSum(num);
        System.out.println("The result is " + result);
    }
}
