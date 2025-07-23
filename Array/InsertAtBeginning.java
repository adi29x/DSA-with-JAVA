public class InsertAtBeginning {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 0 };
        int size = 5;
        int value = 5;
        if (size >= arr.length) {
            System.out.println("Array is full.");
        } else {
            for (int i = size; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = value;
            size++;
            System.out.println("Array after insertion: ");
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
