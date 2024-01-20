package DesignPatterns.DecoratorDP;

// The Farmhouse class is a concrete implementation of the Pizza base class
public class Farmhouse extends Pizza {

    // Override the getDescription method to provide the description of the Farmhouse pizza
    @Override
    public String getDescription() {
        return "Farmhouse";
    }

    // Override the cost method to specify the cost of the Farmhouse pizza
    @Override
    public int cost() {
        return 452; // Assuming 452 is the cost of a Farmhouse pizza
    }
}
