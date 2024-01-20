package DesignPatterns.DecoratorDP;

// The Pizza class is an abstract base class for different types of pizzas
abstract public class Pizza {

    // Private member to store the pizza description
    private String description;

    // Getter method to retrieve the pizza description
    public String getDescription() {
        return description;
    }

    // Abstract method to calculate the cost of the pizza
    abstract public int cost();
}
