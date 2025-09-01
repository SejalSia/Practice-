import java.util.Scanner;

public class rotatearray {

    public static void rotateclockwise(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return;
        }

        int n = arr.length;

        // rotate right by one position
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        // recursive call for k - 1
        rotateclockwise(arr, k - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take array size input
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Take array elements input
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Take rotation count input
        System.out.print("Enter number of rotations: ");
        int k = scanner.nextInt();

        // Perform rotation
        rotateclockwise(arr, k);

        // Print rotated array
        System.out.println("Rotated array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
}
