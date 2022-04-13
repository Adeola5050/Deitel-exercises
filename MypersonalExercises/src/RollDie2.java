import java.security.SecureRandom;

public class RollDie2 {
    public static void main(String[] args) {

        SecureRandom randomNumbers= new SecureRandom();
        // array of frequency counters
        int [] frequency = new int[7];

        //roll ie 6,000,000 times: use dir value as frequency index
        for (int roll = 1; roll <=6000000 ; roll++)
            ++frequency[1 + randomNumbers.nextInt(6)];

        System.out.printf("%s%10s%n", " Face", "Frequency");

        //output each array element's value

        for (int face = 0; face < frequency.length; face++)
            System.out.printf("%4d%10d%n", face, frequency[face]);

        }


        }


