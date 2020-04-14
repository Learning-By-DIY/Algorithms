public class SelectSort {

    public void sort(int[] arr) {
        int length = arr.length;
        for(int i = 0; i < length; i++) {
            // 选择无序序列最小的一个元素放在数组索引i的位置
            int minIndex = i;
            for(int j = i + 1; j < length; j++) {
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
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

    public static void main(String[] args) {
        SelectSort s = new SelectSort();
        // 数组类型推导
        int[] arr = {100, 60, 80, 90, 54, 23};
        s.sort(arr);
        s.print(arr);
    }

}
