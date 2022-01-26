package classExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    @Test
    public void bikeCanBeTurnedOnTest(){
        // given
        AutomaticBike bike = new AutomaticBike();
        //when
        bike.IsTurnOn();
        //check
        assertEquals(true,bike.IsTurnOn());

    }
    @Test
    public void bikeCanBeTurnedOffTest(){

        AutomaticBike bike = new AutomaticBike();
        bike.IsTurnOff();
        assertEquals(false, bike.IsTurnOff);
    }

    @Test
    public void bikeCanBeAcceleratedTest(){


    }

}