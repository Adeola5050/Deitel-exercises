package chapterTwo;

import java.util.Scanner;
public class ValueofCylinder{
    public static void main(String[] args){

        Scanner input= new Scanner (System.in);
        System.out.println("Enter the radius and length of a Cylinder: ");

        double radius= input.nextDouble();
        int length= input.nextInt();
        double area;
        area= radius *radius* 3.142;
        double volume= area * length;
        System.out.printf("The area %.2f.%nThe volume is %.2f", area,volume );


























    }
}