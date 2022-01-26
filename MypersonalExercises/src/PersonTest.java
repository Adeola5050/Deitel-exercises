public class PersonTest {
    public static void main(String[] args) {
        Person person= new Person(2,2, 1, "Adeola" );

        System.out.printf("The person's eyes is: %d \n" ,person.getEyes() );
       System.out.printf("The person's legs is: %d \n", person.getLegs());
        System.out.printf("The person's head is: %d \n", person.getHead());
        System.out.printf("The person's Name is: %s \n", person.getName());

    }
}
