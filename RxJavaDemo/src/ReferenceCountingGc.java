/**
 * Created by gavin on 2016/11/10.
 */
public class ReferenceCountingGc {

    public static void main(String[] args) {


        ReferenceCountingGc objA=new ReferenceCountingGc();

        objA=null;


        System.gc();
    }
}
