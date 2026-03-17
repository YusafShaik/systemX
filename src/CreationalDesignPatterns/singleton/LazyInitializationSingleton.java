package CreationalDesignPatterns.singleton;

public class LazyInitializationSingleton {

    private static LazyInitializationSingleton obj;


    private LazyInitializationSingleton() {

    }

    public static LazyInitializationSingleton getInstance() {
        if (obj == null) {
            obj = new LazyInitializationSingleton();
        }

        return obj;
    }
}
