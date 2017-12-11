package 排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
       int arr[] = {5,3,7,2,9,11};

//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j <arr.length-1 ; j++) {
//                if (arr[j] > arr[j+1]) {
//              int      tem =arr[j];
//                      arr[j] = arr[j+1];
//                      arr[j+1]=tem;                        //冒泡排序:从前到后相邻比较的比较，小的放在前面
//
//                }
//            }
//        }


//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length - 1; j++) {
//                if (arr[i] > arr[j + 1]) {
//                    int tem = arr[i];
//                    arr[i] = arr[j + 1];
//                    arr[j + 1] = tem;
//                                                选择排序：选定一个位置从前到后比一次，也可以进行局部排序
//
//                }
//
//            }
//
//        } int arr[] = {5,3,7,2,9,11};
       // {3,5,7,2,9,11}
        for (int i = 0; i <arr.length-1 ; i++) {

            for (int j = i+1; j>0; j--) {               //插入排序：将前面的要比较的部分看成一个有序数组，将后面的元素依次与前面
                                                         //进行比较，进行排序
                if (arr[j] > arr[j-1]) {
                    int tem = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tem;


                }


            }
        }



            System.out.println(Arrays.toString(arr));
        }


    }

