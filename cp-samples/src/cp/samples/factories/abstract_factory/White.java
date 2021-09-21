package cp.samples.factories.abstract_factory;

public class White extends Color{
    @Override
    public String getColor() {
        return "White";
    }

    @Override
    public String getRgbCode() {
        return "rgb(255,255,255)";
    }
}
