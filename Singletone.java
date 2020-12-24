public final class Singleton {
    private static volatile Singleton _instance = null;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (_instance == null)
            synchronized (Singleton.class) {
                if (_instance == null)
                    _instance = new Singleton();
            }
        return _instance;
    }
}