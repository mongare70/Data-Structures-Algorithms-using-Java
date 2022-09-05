package Classes;

public class Robot {
    public String name;
    public String color;
    public double weight;

    public Robot(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String introduceSelf() {
        return "My name is " + this.name + ".";
    }
}
