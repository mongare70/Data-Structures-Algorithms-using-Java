package Classes;

public class Person {
    public String name;
    public String personality;
    public boolean isSitting;
    public Robot robotOwned;

    public Person(String name, String personality, boolean isSitting) {
        this.name = name;
        this.personality = personality;
        this.isSitting = isSitting;
    }   

    public boolean sitDown() {
        return this.isSitting = true;
    }

    public boolean standUp() {
        return this.isSitting = false;
    }

    public static void main(String[] args) {
        Robot r1 = new Robot("Tom", "red", 30);
        Person p1 = new Person("Alice", "aggressive", false);
        p1.robotOwned = r1;
        System.out.println(p1.robotOwned.introduceSelf());
    }
}
