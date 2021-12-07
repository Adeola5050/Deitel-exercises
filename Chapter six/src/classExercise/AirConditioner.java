package classExercise;

public class AirConditioner {
    private String name;
    private int temperature = 16;
    private boolean isOn = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTemperature() {
        return temperature;
    }

    public int decreaseTemperature() {
        if(temperature > 16) {
            temperature = temperature - 1;
        }
        return temperature;
    }

    public int increaseTemperature() {
        if(temperature < 30) {
            temperature = temperature + 1;
        }
        return temperature;
    }



    public void setOn(boolean on) {
        isOn = on;
    }

    public String isOn() {
        return "true";
    }

    public String isOff() {
        return "true";
    }

    public void setTemperature() {
        temperature = temperature + 1;
    }
}
