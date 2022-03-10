package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;
import static turtleGraphics.PenState.*;

public class TurtleTest {
    Turtle ijapa;

    @BeforeEach
    public void setUp() {
        ijapa = new Turtle();
    }

    @Test
    public void turtleExist() {
//        Turtle ijapa= new Turtle();
        assertNotNull(ijapa);


    }

    @Test
    public void turtleHasAPenTest() {
        Pen pen = ijapa.getPen();
        assertNotNull(pen);
    }

    @Test
    public void penIsUpByDefaultTest() {
        Pen pen = ijapa.getPen();
        assertEquals(pen.getState(), Up);
    }

    @Test
    public void turtleCanMovePenDownTest() {
        assertSame(ijapa.getPen().getState(), Up);
//when
        ijapa.penDown();
//        assert
        assertSame(ijapa.getPen().getState(), PenState.Down);
    }

    @Test
    public void turtleCanMovePenUpTest() {
//        given
        ijapa.penDown();
//    assert
        assertSame(ijapa.getPen().getState(), Down);

        ijapa.penUp();

        assertSame(ijapa.getPen().getState(), Up);
    }

    @Test
    public void turtleCanTurnRight_whileFacingEastTest() {
        assertSame(ijapa.getCurrentDirection(), Direction.EAST);
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), WEST);
    }

    @Test
    public void turtleCanTurnRight_whileFacingSouthTest() {
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), WEST);

        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
//        assertSame(NORTH,ijapa.getCurrentDirection());
    }

    //to do face West
    @Test
    public void turtleCanTurnRight_WhileFacingWestTest() {
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), WEST);
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRight_WhileFacingNorthTest() {
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), SOUTH);
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(EAST, ijapa.getCurrentDirection());

    }

    @Test
    public void turtleCanTurtleTurnLeft_whileFacingEastTest() {
        ijapa.turnLeft();
//        assertSame(ijapa.getCurrentDirection(),SOUTH);
//        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeft_WhileFacingNorthTest() {
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeft_WhileFacingWestTest() {
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getCurrentDirection());

    }

    @Test
    public void turtleCanTurnLeft_WhileFacingSouthTest() {
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanMove_WhileFacingEastTest() {
        ijapa.moveWithoutWriting(6);
        ijapa.moveWithoutWriting(5);
        Position expected = new Position(0, 9);
        assertEquals(expected, ijapa.getCurrentPosition());

    }

    @Test
    public void turtleCanMove_WhileFacingSouthTest() {
        ijapa.turnRight();
        ijapa.moveWithoutWriting(6);
        Position expected = new Position(0, 5);
        assertEquals(expected, ijapa.getCurrentPosition());

    }

    @Test
    public void turtleCanMove_WhileFacingNorthTest() {
        ijapa.turnRight();
        ijapa.moveWithoutWriting(6);
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.moveWithoutWriting(6);
        Position expected = new Position(5, 5);
        assertEquals(expected, ijapa.getCurrentPosition());
    }

    @Test
    public void turtleCanMove_WhileFacingWestTest() {
        ijapa.moveWithoutWriting(6);
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.moveWithoutWriting(3);
        Position expected = new Position(2, 5);
        assertEquals(expected, ijapa.getCurrentPosition());
    }

    @Test
    public void turtleCanWrite_whenPenIsDownTest() {
        ijapa.penDown();
        SketchPad pad = new SketchPad(5, 5);
        ijapa.move(5, pad);
        //assert
        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());

        int[][] floor = pad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[0][3]);
        assertEquals(1, floor[0][4]);
//        pad.display();
    }

    @Test
    void turtleCanWrite_whileFacingSouthTest_WhenPenIsDown() {
        ijapa.penDown();
        SketchPad pad = new SketchPad(5, 5);
        ijapa.turnRight();
        ijapa.move(3, pad);

        assertEquals(new Position(0, 2), ijapa.getCurrentPosition());
        int[][] floor = pad.getFloor();
        assertEquals(0, floor[0][0]);
        assertEquals(0, floor[1][0]);
        assertEquals(0, floor[2][0]);
        pad.display();
    }

    @Test
    void turtleCanWrite_whileFacingNorthTest_WhenPenIsDown() {
        SketchPad pad = new SketchPad(5, 5);
        ijapa.turnRight();
        ijapa.move(3, pad);
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertEquals(new Position(0, 2), ijapa.getCurrentPosition());
        ijapa.penDown();
        ijapa.move(1, pad);
        int[][] floor = pad.getFloor();
        assertEquals(0, floor[2][0]);
    }

    @Test
    void turtleCanWrite_whileFacingWestTest_WhenPenIsDown() {
        SketchPad pad = new SketchPad(5, 5);
        ijapa.move(2, pad);
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(new Position(0, 1), ijapa.getCurrentPosition());
        ijapa.penDown();
        ijapa.move(2, pad);
        int[][] floor = pad.getFloor();
        assertEquals(0, floor[0][1]);
        assertEquals(0, floor[0][0]);
    }

    @Test
    public void whenTurtlesGoesOutOfSketchPad_exceptionIsThrown() {
        ijapa.penDown();
        SketchPad sketchPad = new SketchPad(5, 5);
        //    assertThrows(InvalidMoveException.class,()-> ijapa.move(5,sketchPad));
        try {
            ijapa.move(5, sketchPad);
        } catch (InvalidMoveException e) {
            assertEquals(InvalidMoveException.class, e.getClass());
            assertEquals("Ijapa don fall", e.getMessage());
        }
    }

    @Test
    void whenTurtleIsFacingSouth_AndGoesOutOfSketchPad_exceptionIsThrown() {
        ijapa.turnRight();
        ijapa.penDown();
        SketchPad pad = new SketchPad(5, 5);
        try {
            ijapa.move(6, pad);
        } catch (InvalidMoveException e) {
            assertEquals(InvalidMoveException.class, e.getClass());
            assertEquals("Ijapa don fall", e.getMessage());
        }
    }

    @Test
    void whenTurtleIsFacingNorth_AndGoesOutOfSketchPad_exceptionIsThrown() {
        ijapa.turnRight();
        ijapa.moveWithoutWriting(3);
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.penDown();
        SketchPad pad = new SketchPad(5, 5);
        try {
            ijapa.move(6, pad);
        } catch (InvalidMoveException e) {
            assertEquals(InvalidMoveException.class, e.getClass());
            assertEquals("Ijapa don fall", e.getMessage());
        }
    }

    @Test
    void whenTurtleIsFacingWest_AndGoesOutOfSketchPad_exceptionIsThrown() {
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.penDown();
        SketchPad pad = new SketchPad(5, 5);
        try {
            ijapa.move(4, pad);
        } catch (InvalidMoveException e) {
            assertEquals(InvalidMoveException.class, e.getClass());
            assertEquals("Ijapa don fall", e.getMessage());
        }


    }
}

