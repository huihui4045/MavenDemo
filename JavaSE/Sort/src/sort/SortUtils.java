package sort;

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
     * 归并排序
     *
     * @param data
     */
    public static void MergeSort(int[] data) {
        MergeSort(data, 0, data.length - 1);
    }

    private static void MergeSort(int[] data, int left, int right) {
        if (left >= right)
            return;
        // 找出中间索引
        int center = (left + right) / 2;
        // 对左边数组进行递归
        MergeSort(data, left, center);
        // 对右边数组进行递归
        MergeSort(data, center + 1, right);
        // 合并
        merge(data, left, center, right);

    }

    /**
     * 将两个数组进行归并，归并前面2个数组已有序，归并后依然有序
     *
     * @param data   数组对象
     * @param left   左数组的第一个元素的索引
     * @param center 左数组的最后一个元素的索引，center+1是右数组第一个元素的索引
     * @param right  右数组最后一个元素的索引
     */
    private static void merge(int[] data, int left, int center, int right) {
        // 临时数组
        int[] tmpArr = new int[data.length];
        // 右数组第一个元素索引
        int mid = center + 1;
        // third 记录临时数组的索引
        int third = left;
        // 缓存左数组第一个元素的索引
        int tmp = left;
        while (left <= center && mid <= right) {
            // 从两个数组中取出最小的放入临时数组
            if (data[left] <= data[mid]) {
                tmpArr[third++] = data[left++];
            } else {
                tmpArr[third++] = data[mid++];
            }
        }
        // 剩余部分依次放入临时数组（实际上两个while只会执行其中一个）
        while (mid <= right) {
            tmpArr[third++] = data[mid++];
        }
        while (left <= center) {
            tmpArr[third++] = data[left++];
        }
        // 将临时数组中的内容拷贝回原数组中
        // （原left-right范围的内容被复制回原数组）
        while (tmp <= right) {
            data[tmp] = tmpArr[tmp++];
        }
    }


    /**
     * 插入排序
     * <ul>
     * <li>从第一个元素开始，该元素可以认为已经被排序</li>
     * <li>取出下一个元素，在已经排序的元素序列中从后向前扫描</li>
     * <li>如果该元素（已排序）大于新元素，将该元素移到下一位置</li>
     * <li>重复步骤3，直到找到已排序的元素小于或者等于新元素的位置</li>
     * <li>将新元素插入到该位置中</li>
     * <li>重复步骤2</li>
     * </ul>
     *
     * @param a 时间复杂度 时间复杂度是O(n*n)
     */
    public static void insertSort(int[] a) {

        for (int i = 1; i < a.length; i++) {

            int key = a[i];
            int j;
            for (j = i - 1; j >= 0 && a[j] > key; j--) {

                a[j + 1] = a[j];
            }

            a[j + 1] = key;
        }
    }

    /**
     * 选择排序
     * 选择排序<br/>
     * <li>在未排序序列中找到最小元素，存放到排序序列的起始位置</li>
     * <li>再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。</li>
     * <li>以此类推，直到所有元素均排序完毕。</li>
     *
     * @param a 不稳定 时间复杂度是O(n*n)
     */
    public static void SelectionSort(int[] a) {
        int d;
        int length = a.length;
        for (int i = 0; i < length - 1; i++) {

            d = i;

            for (int j = i + 1; j < length; j++) {

                if (a[j] < a[d]) {

                    d = j;
                }
            }

            if (d != i) {

                swap(a, i, d);
            }

        }
    }

    /**
     * 快速排序
     *
     * @param a
     * @param left  左边下标
     * @param right 右边下标
     *              不稳定，时间复杂度最理想O(nlogn)最差时间O(n^2)
     */
    public static void QuickSort(int[] a, int left, int right) {

        if (left > right)
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
     * <p>
     * 稳定，时间复杂度O(n^2)
     *
     * @param a
     */
    public static void BubbleSort(int[] a) {

        int temp;

        for (int i = 0; i < a.length - 1; i++) {


            for (int j = 0; j < a.length - i - 1; j++) {


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
