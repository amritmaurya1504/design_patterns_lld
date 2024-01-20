package DesignPatterns.DecoratorDP;

// The MushroomDecorator class is a concrete decorator for adding Mushroom topping to a pizza
public class MushroomDecorator extends PizzaDecorator {

    // Private member to store the reference to the base pizza
    private Pizza pizza;

    // Constructor to initialize the MushroomDecorator with a base pizza
    public MushroomDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    // Override the getDescription method to include the Mushroom topping in the description
    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Mushroom";
    }

    // Override the cost method to add the cost of Mushroom topping to the base pizza cost
    @Override
    public int cost() {
        return pizza.cost() + 40; // Assuming 40 is the cost of adding Mushroom
    }
}
