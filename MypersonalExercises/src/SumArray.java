public class SumArray {
    public static void main(String[] args) {
        int[]array={56 ,78, 89, 97, 67, 88, 90, 45, 34, 98, 70};

        int total = 0;
                for (int counter = 0; counter< array.length; counter++ )
                    total +=array[counter];
        System.out.printf("Total of array elements: %d%n", total);

    }

}
