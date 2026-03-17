package CreationalDesignPatterns.singleton;

public class Main {

    public static void main(String[] args) {


        EagerInitializationSingleton eagerObj= EagerInitializationSingleton.getInstance();

        LazyInitializationSingleton lazyObj= LazyInitializationSingleton.getInstance();

        BillPughSingleton obj= BillPughSingleton.getInstance();

        SynchronizedSingleton sObj= SynchronizedSingleton.getInstance();

        DoubleCheckSingleton dObj= DoubleCheckSingleton.getInstance();


    }
}
