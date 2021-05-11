package Section6OOPPart1;

import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String color;
    private String engine;

    public void setModel(String model) {
        if (model != null) {
            String validModel = model.toLowerCase();
            if (validModel.equals("carrera") || validModel.equals("comodore")) {
                this.model = model;
            } else {
                this.model = "Unknown";
            }
        }
    }
    public  String getModel() {
        return this.model;
    }
}
