package chapterThree;

public class DateTest {
    public static void main(String[] args) {
        Date today= new Date(1,19,2022);

        System.out.printf( "Yesterday's date is: %d/", today.getMonth());
        System.out.printf("%d/", today.getDay());
        System.out.printf("%d \n",today.getYear());

        today.setMonth(1);
        today.setDay(20);
        today.setYear(2022);

        System.out.printf( "Today's date is: %d/", today.getMonth());
        System.out.printf("%d/", today.getDay());
        System.out.printf("%d",today.getYear());



    }

}
