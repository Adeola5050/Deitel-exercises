public class Person {
    private int eyes;
    private int legs;
    private int head;
    private String name;


    public Person(int eyes,int legs, int head, String name){
        this.eyes = eyes;
        this.legs = legs;
        this.head = head;
        this.name = name;
    }
    public void setEyes(int eyes) {

        this.eyes = eyes;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getHead() {
        return head;
    }

    public String getName() {
        return name;
    }

}

