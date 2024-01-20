package DesignPatterns.DecoratorDP;

// The PizzaHut class demonstrates the use of the Decorator Design Pattern
public class PizzaHut {

    public static void main(String[] args) {
        // Create a base Farmhouse pizza
        Pizza pizza = new Farmhouse();

        // Decorate the pizza with ExtraCheese
        pizza = new ExtraCheeseDecorator(pizza);

        // Further decorate the pizza with Jalapino
        pizza = new JalapinoDecorator(pizza);

        // Continue decorating the pizza with Mushroom
        pizza = new MushroomDecorator(pizza);

        // Display the total cost of the decorated pizza
        System.out.println("Rs. " + pizza.cost());

        // Display the description of the decorated pizza
        System.out.println(pizza.getDescription());
    }
}
