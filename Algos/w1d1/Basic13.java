import java.util.Arrays;

public class Basic13 {

    //TODO: Print all the integers from 1 to 255.

    public void print1to255(){
        for (int i = 1; i <=255; i++){
            System.out.println(i);
        }
    }

    //TODO: Print integers from 0 to 255, and with each integer print the sum so far.

    public void printIntsAndSum(){
        int sum = 0;
        for (int i = 0; i <= 255; i++){
            sum  += i;
            System.out.println(i + " " + sum);
        }
    }

    //TODO: Given an array, find and print its largest element.

    public void findAndPrintLargest(int[] arr){
        // System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}