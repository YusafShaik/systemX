package CreationalDesignPatterns.singleton;

public class BillPughSingleton {

    private BillPughSingleton(){

    }

    public static BillPughSingleton getInstance(){
        return SingletonHelperClass.INSTANCE;
    }

    public static class SingletonHelperClass {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }


}
