public class InsertAtEnd {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 0 };
        int size = 5;
        int value = 60;
        if (size >= arr.length) {
            System.out.println("Array is full.");
        } else {
            arr[size] = value;
            size++;
            System.out.println("Array after insertion: ");
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
