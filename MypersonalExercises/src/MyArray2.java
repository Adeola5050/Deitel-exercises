public class MyArray2 {
    public static void main(String[] args) {
         int [] array= {34, 56,78, 89, 90, 67, 43, 92, 33, 40, 68, 95, 22, 78, 36, 79};
         int total =0;
           //enhanced For loop
        //for (int i : array) total += i;

        // normal for loop
        for (int counter = 0; counter < array.length; counter++)
            total +=array[counter];

        System.out.printf("Total of array Elements: %d%n", total);

        }
    }

