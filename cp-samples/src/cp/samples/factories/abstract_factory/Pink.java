package cp.samples.factories.abstract_factory;

public class Pink extends Color{
    @Override
    public String getColor() {
        return "Pink";
    }

    @Override
    public String getRgbCode() {
        return "rgb(255, 182, 193)";
    }
}
