public class InsertSort {
    public static void main(String[] args) {
        InsertSort s = new InsertSort();
        int[] arr = {100, 60, 80, 90, 54, 23};
        s.sort(arr);
        s.print(arr);
    }

    public void sort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int j = i + 1;
            while (j >= 1 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j = j - 1;
            }
        }
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

}
