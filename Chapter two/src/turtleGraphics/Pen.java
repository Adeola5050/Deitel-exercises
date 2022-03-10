package turtleGraphics;

public class Pen {
    private PenState state =PenState.Up;
    public PenState getState(){
            return state;

        }
        public void setState(PenState penState){
        state =penState;
    }
}
