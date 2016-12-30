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
     * 快速排序
     * @param a
     * @param left  左边下标
     * @param right 右边下标
     */
    public static void QuickSort(int[] a, int left, int right) {

        if (a == null || a.length == 0 || left > right)
            return;

        int i, j, temp;

        i = left;
        j = right;

        temp = a[left];

        while (i != j) {


            while (a[j] >= temp && i < j) j--;

            while (a[i] <= temp && i < j) i++;

            if (i < j) {


                swap(a, i, j);
            }

        }

        a[left] = a[i];

        a[i] = temp;

        QuickSort(a, left, i - 1);

        QuickSort(a, i + 1, right);


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

                    swap(a, j, j + 1);

                }
            }
        }

    }

    /**
     * 交互两个元素的位置
     *
     * @param a
     * @param m
     * @param n
     */
    private static void swap(int[] a, int m, int n) {
        int temp;
        temp = a[m];
        a[m] = a[n];
        a[n] = temp;
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
