package cp.samples.factories.abstract_factory;

public class Doll extends Toy{
    @Override
    public String getType() {
        return "Doll";
    }

    @Override
    public void makeSound() {
        System.out.println("WOW!");
    }
}
