public class DeleteAtIndex {
    public static void main (String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int size = 5;
        int index = 2; 
        if (size == 0) {
            System.out.println("Array is empty");
        } else if (index < 0 || index >= size) {
            System.out.println("Invalid indesx.");
        } else {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
            System.out.println("Array after deletion");
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i] + " ");
            }
        }

    }
}
