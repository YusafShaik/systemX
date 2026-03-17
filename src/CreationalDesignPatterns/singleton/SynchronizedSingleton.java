package CreationalDesignPatterns.singleton;

public class SynchronizedSingleton {

    private static SynchronizedSingleton obj;


    private SynchronizedSingleton() {

    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (obj == null) {
            obj = new SynchronizedSingleton();
        }

        return obj;
    }
}
