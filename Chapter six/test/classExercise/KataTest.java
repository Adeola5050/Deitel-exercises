package classExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void aGradeCanBeCalculatedTest(){
        Kata gradeSomething = new Kata();
        char result = gradeSomething.calculateGradeFor(92);
   assertEquals('A', result);
    }
    @Test
    public void bGradeCanBeCalculatedTest(){
        Kata gradeSomething = new Kata();
        char result = gradeSomething.calculateGradeFor(89);
        assertEquals('B',result);

    }
    @Test
    public void cGradeCanBeCalculatedTest(){
        Kata gradeSomething = new Kata();
        char myResult = gradeSomething.calculateGradeFor(70);
        assertEquals('C',myResult);
    }
    @Test
    public void dGradeCanBeCalculatedTest(){
        Kata gradeSomething = new Kata();
        char myResult = gradeSomething.calculateGradeFor(65);
        assertEquals('D',myResult);
    }
    @Test
    public void fGradeCanBeCalculatedTest(){
        Kata gradeSomething = new Kata();
        char result = gradeSomething.calculateGradeFor(59);
        assertEquals('F',result);
    }
    @Test
    public void oneToFourcopiesTest(){
        int copies = Kata.calculatePriceFor(3);
        assertEquals(6000,copies);
    }
    @Test
    public void fiveToNinecopiesTest(){
        Kata priceSomething = new Kata();
        int copies = priceSomething.calculatePriceFor(8);
        assertEquals(14400,copies);
    }
    @Test
    public void tenToTwentyNinecopiesTest(){
        Kata priceSomething = new Kata();
        int copies = priceSomething.calculatePriceFor(25);
        assertEquals(40000,copies);
    }
    @Test
    public void thirtyToFourtyNinecopiesTest(){
        Kata priceSomething = new Kata();
        int copies = priceSomething.calculatePriceFor(40);
        assertEquals(60000,copies);
    }
    @Test
    public void fiftyToNinetyNinecopiesTest(){
        Kata priceSomething = new Kata();
        int copies = priceSomething.calculatePriceFor(90);
        assertEquals(117000,copies);
    }


    @Test
    public void hundredToOneHundredAndNinetyNinecopiesTest(){
        Kata priceSomething = new Kata();
        int copies = priceSomething.calculatePriceFor(180);
        assertEquals(216000,copies);
    }
    @Test
    public void twoHundredToFourHundredandNinetyNinecopiesTest(){
        Kata priceSomething = new Kata();
        int copies = priceSomething.calculatePriceFor(450);
        assertEquals(495000,copies);
    }
    @Test
    public void fiveHundredToNineHundredcopiesTest(){
        Kata priceSomething = new Kata();
        int copies = priceSomething.calculatePriceFor(800);
        assertEquals(800000,copies);
    }


}
