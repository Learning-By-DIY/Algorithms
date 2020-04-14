/**
 * @author longyunfeigu
 * @version v1.0
 */

public class BubbleSort {

    public void sort(int[] arr) {
        int length = arr.length;
        int count = 0;
        
        for(int i = 1; i < length; i++) {
            boolean flag = false;
            for(int j = 0; j < length - i; j++) {
                count++;

                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j + 1);
                    flag = true;
                }
            }
            if(!flag) {
                break;
            }
        }
        System.out.println("run ccount: " + count);
    }

    private void swap(int[] arr, int p, int q) {
        int length = arr.length;
        assert p >= 0 && p < length && q >= 0 && q < length;

        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
    }

    public void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort s = new BubbleSort();
        int[] arr = {100, 60, 80, 90, 54, 23};
//        int []arr = {1, 2, 3, 4};
        s.sort(arr);
        s.print(arr);
    }
}
