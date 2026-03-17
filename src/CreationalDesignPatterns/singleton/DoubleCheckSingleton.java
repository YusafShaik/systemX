package CreationalDesignPatterns.singleton;

public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton obj;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {
        if (obj == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (obj == null) {
                    obj = new DoubleCheckSingleton();
                }
            }
        }
        return obj;
    }
}
