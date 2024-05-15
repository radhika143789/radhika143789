import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= in.nextInt();
        if(n!=0){
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    
                    System.out.println(i);
                }


            }
        }


    }
}
