package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0)
            return arr;
        int countBig = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > 1000)
                countBig++;
        int[] ans = new int[arr.length - countBig];
        int i1 = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] <= 100) {
                ans[i1] = arr[i];
                i1++;
            }
        arr = ans;
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        return arr;
    }

}