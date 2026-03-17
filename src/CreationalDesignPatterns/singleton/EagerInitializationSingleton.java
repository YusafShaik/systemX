package CreationalDesignPatterns.singleton;

public class EagerInitializationSingleton {

    private static final EagerInitializationSingleton obj = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {

    }

    public static EagerInitializationSingleton getInstance() {
        return obj;
    }
}
