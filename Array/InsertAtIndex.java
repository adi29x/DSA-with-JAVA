public class InsertAtIndex {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 0 };
        int size = 5;
        int value = 25;
        int index = 2;
        if (size >= arr.length) {
            System.out.println("Array is full.");
        } else if (index < 0 || index > size) {
            System.out.println("Invalid index.");
        } else {
            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = value;
            size++;
            System.out.println("Array after insertion: ");
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
