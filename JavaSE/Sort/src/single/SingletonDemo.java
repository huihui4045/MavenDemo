package single;

/**
 * Created by gavin on 2017/2/24.
 */
public class SingletonDemo {

    public static void main(String[] args) {


        for (int i=0;i<100;i++){

            new Thread(runnable).start();
        }
    }

    private static Runnable runnable = () -> {

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {

            //Singleton.getSingleton();

            //StaticSingleton.getInstance();
            EnumSingleton.getInstance();
        }

        long end = System.currentTimeMillis();

        System.out.println("time:" + (end - start));
    };
}
