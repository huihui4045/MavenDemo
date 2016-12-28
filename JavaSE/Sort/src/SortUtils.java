import java.util.Random;

/**
 * Created by gavin on 2016/12/27.
 */
public class SortUtils {

    /**
     * 桶排序
     *
     * @param a
     */
    public static void BucketSort(int a) {


    }


    /**
     * 冒泡排序
     *
     * @param a
     */
    public static void BubbleSort(int[] a) {

        int temp;

        for (int i = 0; i < a.length - 1; i++) {


            for (int j = 0; j < a.length - 1 - i; j++) {


                if (a[j] > a[j + 1]) {

                    swap(a, j);

                }
            }
        }

    }

    private static void swap(int[] a, int j) {
        int temp;
        temp = a[j];
        a[j] = a[j + 1];
        a[j + 1] = temp;
    }

    /**
     * 获取随机数
     *
     * @param size
     * @return
     */
    public static int[] getRandom(int size) {

        int[] a = new int[size];

        Random random = new Random();

        for (int i = 0; i < a.length; i++) {

            a[i] = random.nextInt(size) + 1;
        }

        return a;
    }

}
