package cp.samples.singleton;

public class App {
    public static void main(String[] args) {
        OnDemand.getInstance().getConfig("key1").ifPresent(c -> System.out.println(c));
        OnDemand.getInstance().getConfig("key2").ifPresent(c -> System.out.println(c));
        OnDemand.getInstance().getConfig("key3").ifPresentOrElse(c -> System.out.println(c),
                () -> System.out.println("Config not found!"));
    }
}
