package FamilySomething;

import org.junit.Test;

public class HusbandTest {
    

    @Test
    public void iyawoSnatchingTest(){
        wife petersWife= new wife();
        Husband peter=new Husband(petersWife);
        peter.askWifeToCook("Indomie");

    }


    }
