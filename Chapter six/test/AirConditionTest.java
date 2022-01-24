
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest{
    @Test
    public void acCanBeTurnOnTest(){

//        given
        AirConditioner ac = new AirConditioner();
//        when
        ac.isOn();
//        check
        assertTrue(true, ac.isOn());
    }

@Test
    public void acCanBeTurnedOffTest() {

//        given
    AirConditioner ac = new AirConditioner();
//        when
    ac.isOff();
//        check
    assertTrue(true, ac.isOff());
        }

    @Test

    public void temperatureCanBeDecreased() {
//        given
        AirConditioner ac = new AirConditioner();
//        when
        ac.decreaseTemperature();
//        check
        assertEquals(16, ac.getTemperature());

    }

    @Test

    public void temperatureCanBeIncreased() {
//        given
        AirConditioner ac = new AirConditioner();
//        when
        ac.increaseTemperature();
//        check
        assertEquals(17, ac.getTemperature());

    }

    @Test
    public void temperatureCannotExceedThirty() {
        AirConditioner ac = new AirConditioner();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();



//        check
        assertEquals(30, ac.getTemperature());
    }

    @Test
    public void temperatureCannotDecreaseBelowSixten() {
        AirConditioner ac = new AirConditioner();
        ac.decreaseTemperature();
        ac.decreaseTemperature();


//        check
        assertEquals(16, ac.getTemperature());
    }
}


