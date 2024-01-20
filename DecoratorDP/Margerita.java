package DesignPatterns.DecoratorDP;

// The Margerita class is a concrete implementation of the Pizza base class
public class Margerita extends Pizza {

    // Override the getDescription method to provide the description of the Margerita pizza
    @Override
    public String getDescription() {
        return "Margerita";
    }

    // Override the cost method to specify the cost of the Margerita pizza
    @Override
    public int cost() {
        return 199; // Assuming 199 is the cost of a Margerita pizza
    }
}
