package MyList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;


class ToiletriesListTest {
    ToiletriesList myList;
    @BeforeEach
public void setMyList(){
        myList= new ToiletriesList(0);
    }

    @Test
    public void listCanBeCreatedTest(){
    myList.canAdd("bodyCream");
        // myList.canAdd("hairCream");
//    myList.canAdd("detergent");
    assertArrayEquals(new String []{"bodyCream", null, null,null},myList.getToiletries());

    }
    @Test
    public void sizeCanBeCheckedTest(){
        myList.getSize();
        myList.canAdd("bodyCream");
        myList.canAdd("hairCream");
        myList.canAdd("detergent");
 assertEquals(3,myList.getSize());
    }
    @Test
  public void myListCapacityTest(){
        myList.getMyList();
        myList.canAdd("bodyCream");
        myList.canAdd("hairCream");
        myList.canAdd("detergent");
        myList.canAdd("bodyWash");
        myList.canAdd("toiletRoll");
        myList.canAdd("faceCleanser");
        myList.canAdd("cottonWool");
        myList.canAdd("toiletWash");
        myList.canAdd("dettol");
        myList.canAdd("airFreshner");
        myList.canAdd("bodySpray");
        myList.canAdd("perfume");
        assertEquals(12,myList.getSize());


    }
    @Test
    public void myListCanBeRemovedTest(){
        myList.canRemove();

    }
}