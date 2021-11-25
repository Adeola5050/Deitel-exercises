import java.util.Scanner;
public class Circle {
        public static void main(String[] args){
            Scanner scanner= new Scanner(System.in);

            System.out.println("ENTER A RADIUS VALUE");
            int radius= scanner.nextInt();

            double constantPI= Math.PI;

            System.out.printf("Area of the circle is %f%n",constantPI*radius*radius);

            System.out.printf("Circumference of the circle is %f%n",2*constantPI*radius);

            System.out.printf("Diameter of the circle is %d%n",2*radius);

        }
    }


