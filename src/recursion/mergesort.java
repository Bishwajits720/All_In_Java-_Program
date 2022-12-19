package recursion;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
    int [] arr= {5,6,8,7,4,3,2,1};
        mergesort2(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {

        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;

            }
            k++;
        }
        while (i < first.length) {

                mix[k] = first[i];
                i++;
                k++;
            }
        while (j < second.length) {

                mix[k] = second[j];
                j++;
                k++;
            }

        return mix;
    }

    static void mergesort2(int[] arr, int s,int e) {
        if (e-s == 1) {
            return;
        }
        int mid = (s +e) / 2;

        mergesort2(arr, s, mid);
        mergesort2(arr, mid, e);

        merge1(arr,s,mid,e);
    }

    private static void merge1(int[] arr, int s,int m,int e) {

        int[] mix = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;

            }
            k++;
        }
        while (i < m) {

            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {

            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];

        }


    }
}





