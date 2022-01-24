package FamilySomething;

public class Husband {
    private wife iyawo;

    public Husband(wife wife) {
        iyawo = wife;
    }



    public void askWifeToCook(String cookWhat){
        System.out.println("Begging my wife to cook" );

        switch (cookWhat){
            case "Indomie":
                System.out.println("Get lost");
                break;
            default:
                iyawo.cook();
            }
        }
    }