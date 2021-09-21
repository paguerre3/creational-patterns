package cp.samples.factories.abstract_factory;

public class Dog extends Toy{
    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public void makeSound() {
        System.out.println("Guau");
    }
}
