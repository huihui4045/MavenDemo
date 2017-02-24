package single;

/**
 * Created by gavin on 2017/2/24.
 */
public class StaticSingleton {

    private static class SingletonHolder {
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    private StaticSingleton() {
    }

    public static final StaticSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
