package sort;

/**
 * Created by gavin on 2016/12/27.
 */
public class Sort {

    public static void main(String[] args) {


        int[] a = SortUtils.getRandom(10000);

        int[] b = a.clone();
        int [] c=a.clone();
        int [] d=a.clone();
        int [] e=a.clone();

        for (int i = 0; i < a.length; i++) {

            System.out.printf(String.format("%d  ", a[i]));
        }

        long start = System.currentTimeMillis();

        SortUtils.BubbleSort(a);

        long end = System.currentTimeMillis();

        System.out.println(String.format("冒泡排序所用时间：%d", end - start));

        for (int i = 0; i < a.length; i++) {

            System.out.printf(String.format("%d  ", a[i]));
        }

        System.out.println("==================");
        System.out.println("快速排序前：");


        for (int i = 0; i < a.length; i++) {

            System.out.printf(String.format("%d  ", b[i]));
        }

        System.out.println("==================");
        System.out.println("==================");
        long start1 = System.currentTimeMillis();

        SortUtils.QuickSort(b, 0, a.length - 1);

        long end1 = System.currentTimeMillis();

        System.out.println(String.format("快速排序所用时间：%d", end1 - start1));

        for (int i = 0; i < a.length; i++) {

            System.out.printf(String.format("%d  ", b[i]));
        }


        System.out.println("==================");
        System.out.println("==================");
        long start_select = System.currentTimeMillis();

        SortUtils.SelectionSort(c);

        long end_select = System.currentTimeMillis();

        System.out.println(String.format("选择排序所用时间：%d", end_select - start_select));

        for (int i = 0; i < a.length; i++) {

            System.out.printf(String.format("%d  ", c[i]));
        }


        System.out.println("==================");
        System.out.println("==================");
        long start_insert = System.currentTimeMillis();

        SortUtils.insertSort(d);

        long end_insert = System.currentTimeMillis();

        System.out.println(String.format("插入排序所用时间：%d", end_insert - start_insert));

        for (int i = 0; i < a.length; i++) {

            System.out.printf(String.format("%d  ", d[i]));
        }



        System.out.println("==================");
        System.out.println("==================");
        long start_merge = System.currentTimeMillis();

        SortUtils.MergeSort(e);

        long end_merge = System.currentTimeMillis();

        System.out.println(String.format("归并排序所用时间：%d", end_merge - start_merge));

        for (int i = 0; i < a.length; i++) {

            System.out.printf(String.format("%d  ", d[i]));
        }
    }
}
