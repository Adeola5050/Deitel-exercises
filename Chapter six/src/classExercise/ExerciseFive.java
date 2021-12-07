package classExercise;

public class ExerciseFive {
    public static void main(String[] args) {
        int i = 1;
            while(i <= 6) {
                if(i == 1)
                System.out.println("1              1 2 3 4 5 6             1    1 2 3 4 5 6");
                if(i == 2)
                System.out.println("1 2            1 2 3 4 5             2 1      1 2 3 4 5");
                if(i == 3)
                System.out.println("1 2 3          1 2 3 4             3 2 1        1 2 3 4");
                if(i == 4)
                System.out.println("1 2 3 4        1 2 3             4 3 2 1          1 2 3");
                if(i == 5)
                System.out.println("1 2 3 4 5      1 2             5 4 3 2 1            1 2");
                if(i == 6)
                System.out.println("1 2 3 4 5 6    1             6 5 4 3 2 1              1");

               i++;
            }

    }
}
