package Decorator;

public abstract class BundleDeal {
    String description;
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}