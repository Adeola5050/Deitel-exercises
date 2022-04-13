import java.util.Scanner;

public class ParkingCharges {
    double minimumCharges=2.00;
    Scanner scanner= new Scanner(System.in);
    int hour= scanner.nextInt();

    public void minimumChargesForThreeHours(){

        if(hour==3){
            System.out.println(minimumCharges);


        }

    }
    public void additionalChargesForEachHour(){
        if(hour>3&&hour<10) {
            double additionalCharges = 0.50;
            double total = additionalCharges * hour;
            double chargesFee = minimumCharges + total;
            System.out.println(chargesFee);
        }


    }

    public void maximumChargesForTwentyHour(){
        if(hour>10&&hour<=24){
            double maximumCharges=10.00;
            System.out.println(maximumCharges);

        }
    }
    public void allMethod(){
        minimumChargesForThreeHours();
        additionalChargesForEachHour();
        maximumChargesForTwentyHour();
    }

    public static void main(String[] args) {
        System.out.println("enter a hour");
        ParkingCharges fee= new ParkingCharges();
        fee.allMethod();
    }

    }


