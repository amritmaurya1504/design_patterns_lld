package DesignPatterns.DecoratorDP;

// The JalapinoDecorator class is a concrete decorator for adding Jalapino topping to a pizza
public class JalapinoDecorator extends PizzaDecorator {

    // Private member to store the reference to the base pizza
    private Pizza pizza;

    // Constructor to initialize the JalapinoDecorator with a base pizza
    public JalapinoDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    // Override the getDescription method to include the Jalapino topping in the description
    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Jalapino";
    }

    // Override the cost method to add the cost of Jalapino topping to the base pizza cost
    @Override
    public int cost() {
        return pizza.cost() + 30; // Assuming 30 is the cost of adding Jalapino
    }
}
