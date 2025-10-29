package org.example;

public class BubbleSort {
    public Integer[] sort(Integer[] arr) {
        if (arr == null){
            return null;
        }

        int n = arr.length;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i - 1; j ++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}
