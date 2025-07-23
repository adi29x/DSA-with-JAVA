public class DeleteAtEnd {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int size = 5;
        if (size == 0) {
            System.out.println("Array is empty");
        } else {
            size--;
            System.out.println("Array after deletion");
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
