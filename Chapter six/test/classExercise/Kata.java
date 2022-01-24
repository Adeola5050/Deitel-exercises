package classExercise;

public class Kata {
//    public char calculateGradeFor(int score) {
//        if (score >= 90) return 'A';
//        if (score >= 80) return 'B';
//        if (score >= 70) return 'C';
//        if (score >= 65) return 'D';
//        if (score >= 50) return 'F';
//        return 0;
//
//
//    }
//
//    public static int calculatePriceFor(int copies) {
//        if (copies <= 4) return 2000 * copies;
//        if (copies <= 9) return 1800 * copies;
//        if (copies <= 29) return 1600 * copies;
//        if (copies <= 49) return 1500 * copies;
//        if (copies <= 99) return 1300 * copies;
//        if (copies <= 199) return 1200 * copies;
//        if (copies <= 499) return 1100 * copies;
//        if (copies <= 900) return 1000 * copies;
//        return copies;
//    }
//
//    // public static int totalCanBeCalculatedOf(int[] numbers) {

    // }

//    public static int calculateTotalOf(int[] numbers) {
//        int total = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            total+= numbers[i];
//        }
//        return total;
//
//    }
//
//        public static int calculateMinimumOf(int[] numbers) {
//        int minimumNumber = numbers[0];
//        for (int number : numbers) {
//            minimumNumber = Math.min(minimumNumber, number);
//        }
//        return minimumNumber;
//
//    }
//
//    public static int calculateMaximumOf(int[] numbers) {
//        int maximumNumber = numbers[0];
//        for (int number : numbers) {
//            maximumNumber = Math.max(maximumNumber, number);
//        }
//        return maximumNumber;

//    }

//    public static double calculateAverageOf(int[] numbers) {
//        double average = 3.0;
//        int total = 0;
//        for (int number : numbers) {
//            total += number;
//        }
//        return average;
//
//    }




    public static int calculateminOfMinMaximumOf(int[] numbers) {
        int minOfMinMaxNumber = numbers[0];
        for (int number : numbers) {
            minOfMinMaxNumber= Math.min(minOfMinMaxNumber, number);
        }
        return minOfMinMaxNumber;

    }
}

