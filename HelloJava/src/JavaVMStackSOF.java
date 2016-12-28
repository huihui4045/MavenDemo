/**
 * Created by gavin on 2016/10/27.
 */
public class JavaVMStackSOF implements Formula {


    @Override
    public double calculate(int a) {

        double sqrt = sqrt(a);
        return sqrt;
    }


    public static void text(){
        System.out.println("text");
    }


    /*public static void main(String[] arg) throws Throwable{





       *//* JavaVMStackSOF oom=new JavaVMStackSOF();


        try {
            oom.stackLeak();

        } catch (Exception e) {


            System.out.println("length:"+oom.stackLength);

            throw e;



        }*/

    //}

    /*private int stackLength=1;

    public void stackLeak(){

        stackLength++;


        stackLeak();
    }*/
}
