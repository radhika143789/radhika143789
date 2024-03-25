import java.util.Scanner;
public class basicjavaprograms {

    public static void main(String[] args) {
        System.out.println("Choose the shape of which you wanna print the area");


        System.out.println("1. Circle Java Program \n" +
                "2.Triangle\n" +
                "3.Rectangle Program\n" +
                "4. Isosceles Triangle\n" +
                "5. Parallelogram\n" +
                "6. Rhombus\n" +
                "7. Equilateral Triangle");
        Scanner in = new Scanner(System.in);
         int a = in.nextInt();
        System.out.println("The number you choose is " + a);


            if (a <= 7) {
                if (a == 1) {
                    System.out.println("enter the value of the radius");
                    int r = in.nextInt();
                    if (r > 0) {
                        double b = 3.14 * r * r;
                        System.out.println("the area of thr circle is " + b);

                    } else {
                        System.out.println("Enter the correct value");
                    }
                }

                if (a == 2) {
                    System.out.println("enter the value of the base");
                    int c = in.nextInt();
                    
                    System.out.println("enter the value of the height");

                    int d = in.nextInt();
                    if (c > 0 && d > 0) {
                        double e = 0.5 * c * d;
                        System.out.println("the area of the triangle is " + e);

                    } else {
                        System.out.println("Enter the correct value");
                    }
                }
                if (a == 3) {
                    System.out.println("enter the value of the length");
                    int c = in.nextInt();
                    System.out.println("enter the value of the breath");
                    int d = in.nextInt();
                    if (c > 0 && d > 0) {
                        double e = c * d;
                        System.out.println("the area of thr rectangle is " + e);

                    } else {
                        System.out.println("Enter the correct value");
                    }
                }
                if (a == 4) {
                    System.out.println("enter the value of the base");
                    int c = in.nextInt();
                    System.out.println("enter the value of the height");

                    int d = in.nextInt();
                    if (c > 0 && d > 0) {
                        double e = 0.5 * c * d;
                        System.out.println("the area of the Isosceles triangle is " + e);

                    } else {
                        System.out.println("Enter the correct value");
                    }
                }
                if (a == 5) {
                    System.out.println("enter the value of the base");
                    int c = in.nextInt();
                    System.out.println("enter the value of the height");

                    int d = in.nextInt();
                    if (c > 0 && d > 0) {
                        double e = c * d;
                        System.out.println("the area of thr parallelogram is " + e);

                    } else {
                        System.out.println("Enter the correct value");
                    }
                }
                if (a == 6) {
                    System.out.println("enter the value of the diagonal 1");
                    int c = in.nextInt();
                    System.out.println("enter the value of the diagonal 2");

                    int d = in.nextInt();
                    if (c > 0 && d > 0) {
                        double e = 0.5 * c * d;
                        System.out.println("the area of the Rhombus is " + e);

                    } else {
                        System.out.println("Enter the correct value");
                    }
                }
                if (a == 7) {
                    System.out.println("enter the value of the base");
                    int c = in.nextInt();
                    System.out.println("enter the value of the height");

                    int d = in.nextInt();
                    if (c > 0 && d > 0) {
                        double e = 0.5 * c * d;
                        System.out.println("the area of the equilateral triangle is " + e);

                    } else {
                        System.out.println("Enter the correct value");
                    }
                }
            }
            else {
                System.out.println("Enter the correct option");

            }

        }
    }

