import java.util.Scanner;
public class PopulationGrowthCalculator{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current world population");
        long currentWorldPopulation= scan.nextLong();
        System.out.println("Enter the population growth rate");
        int growthRate= scan.nextInt();
        double quotient = growthRate/100;
        double remainder = growthRate%100;
        //System.out.println("remainder "+remainder);
        double percentageGrowth= (quotient + remainder)/100;
        //System.out.println(percentageGrowth);
        for(int i=0; i<5; i++){
            currentWorldPopulation += percentageGrowth * currentWorldPopulation;
            System.out.printf("The world population year %d is %d%n",(i+1), currentWorldPopulation);
        }



    }




}

