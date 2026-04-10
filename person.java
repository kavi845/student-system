// Abstract class representing a person
abstract class Person {

    protected String name; // Protected attribute, can be used by subclasses

    // Constructor to set name
    public Person(String name) {
        this.name = name;
    }

    // Abstract method to display details (must be implemented in subclasses)
    public abstract void displayDetails();
}