package single;

/**
 * Created by gavin on 2017/2/24.
 */
public enum EnumSingleton {

    INSTANCE;
    EnumSingleton() {
        System.out.printf("EnumSingleton is create");
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
