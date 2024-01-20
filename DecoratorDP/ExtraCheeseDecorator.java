package DesignPatterns.DecoratorDP;

// The ExtraCheeseDecorator class is a concrete decorator for adding extra cheese to a pizza
public class ExtraCheeseDecorator extends PizzaDecorator {

    // Private member to store the reference to the base pizza
    private Pizza pizza;

    // Constructor to initialize the ExtraCheeseDecorator with a base pizza
    public ExtraCheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    // Override the cost method to add the cost of extra cheese to the base pizza cost
    @Override
    public int cost() {
        return pizza.cost() + 60; // Assuming 60 is the cost of adding extra cheese
    }

    // Override the getDescription method to include " + extra cheese" in the description
    @Override
    public String getDescription() {
        return pizza.getDescription() + " + extra cheese";
    }
}
