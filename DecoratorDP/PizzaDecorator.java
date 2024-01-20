package DesignPatterns.DecoratorDP;

// The PizzaDecorator class is an abstract class representing decorators for pizzas
abstract public class PizzaDecorator extends Pizza {

    // Abstract method to calculate the cost of the decorated pizza
    abstract public int cost();
}
