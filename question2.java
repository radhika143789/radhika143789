import java.util.Scanner;
public class queston_2 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the name : ");
        String name = in.next();
        greet(name);


    }

    static String greet(String name){
        String message =("hello"+name);
        System.out.print(message);
         return message;

    }}


