package com.OneDimensionalArray;

public class Main {

    public static void main(String[] args) {
        int[] array;
        array = new int[]{12, 3, 5, 7, 13, -1, -5};
        int  sum,mx;
        mx=0;
        sum=0;
       int max = array[0];
      for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = (array[i]);
            System.out.print(array[i]+" ");
    }
        System. out.println(" ");
        System.out.println("Найбільше значення массиву:  "+max);
        mx=max;
    while (Math.abs(mx)>0){
        sum += mx % 10;
        mx /= 10;
        }

        System. out.println("Сума цифер найлільшого числа масиву дорівнює: "+sum);
} }
