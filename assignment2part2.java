import java.util.Scanner;

public class basicjavaprogram2 {
        public static void main(String[] args) {
            System.out.println("Choose the shape of which you wanna print the area");


            System.out.println("1. Perimeter Of Circle\n" +
                    "2.Perimeter Of Equilateral Triangle\n" +
                    "3.Perimeter Of Parallelogram\n" +
                    "4 Perimeter Of Rectangle\n" +
                    "5.Perimeter Of Square\n" +
                    "6.Perimeter Of Rhombus");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            System.out.println("The number you choose is " + a);


            if (a <= 6) {
                if (a == 1) {
                    System.out.println("enter the value of the radius");
                    int r = in.nextInt();
                    if (r > 0) {
                        double b = 2*3.14 * r ;
                        System.out.println("the perimeter of thr circle is " + b);

                    } else {
                        System.out.println("Enter the correct value");
                    }
                }

                if (a == 2) {
                    System.out.println("enter the value of the side");
                    int c = in.nextInt();

                    if (c > 0 ) {
                        double e = 3*c;
                        System.out.println("the perimeter of the triangle is " + e);

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
                        double e = 2*(c+d);
                        System.out.println("the perimeter of the parallelogram is " + e);

                    } else {
                        System.out.println("Enter the correct value");
                    }
                }
                if (a == 4) {
                    System.out.println("enter the value of the length");
                    int c = in.nextInt();
                    System.out.println("enter the value of the breath");
                    int d = in.nextInt();
                    if (c > 0 && d > 0) {
                        double e = 2*(c+d);
                        System.out.println("the perimeter of the rectangle is " + e);

                    } else {
                        System.out.println("Enter the correct value");
                    }
                }


                if (a==5||a == 6) {
                    System.out.println("enter the value of the side");
                    int c = in.nextInt();

                    if (c > 0 ) {
                        double e = 4*c;
                        if(a==5) {
                            System.out.println("the perimeter of square is " + e);
                        }
                        else {
                            System.out.println("the perimeter of Rhombus is " + e);
                        }

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



