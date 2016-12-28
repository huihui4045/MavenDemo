/**
 * Created by gavin on 2016/12/27.
 */
public class Sort {

    public static void main(String[] args) {


        int[] a = SortUtils.getRandom(10000);

        long start = System.currentTimeMillis();

        SortUtils.BubbleSort(a);

        long end = System.currentTimeMillis();

        System.out.println(String.format("冒泡排序所用时间：%d", end - start));

        for (int i = 0; i < a.length; i++) {

            System.out.printf(String.format("%d  ", a[i]));
        }
    }
}
