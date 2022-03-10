public class ContinueTest {
    public static void main(String[] args) {
       for (int count =1; count <= 50; count++)
       {
           if(count==40)
               continue;;
           System.out.printf("%d \n", count);
       }
        System.out.printf("%nUsed continue to skip printing 40%n");
    }
}
