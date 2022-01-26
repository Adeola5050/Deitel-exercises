package chapterThree;

public class HealthRecords {
    private String firstName;
    private String lastName;
    private String gender;
    private int dateOfBirth;
    private int height;
    private int weight;


    public HealthRecords(String firstName, String lastName,String gender, int dateOfBirth, int height,int weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
    }
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {

        this.weight = weight;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}


