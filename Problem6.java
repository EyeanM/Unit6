import java.util.Arrays;

public class Problem6 {
    public static void main (String[]args){
        // Let us create different integer arrays

        int[] arr1 = new int[] {1, 2, 3, 4, 5};
        int[] arr2 = new int[] {1, 2, 3, 4, 5};
        int[] arr3 = new int[] {1, 2, 4, 3, 7};

        System.out.println("is arr1 equals to arr2: " + Arrays.equals(arr1, arr2));
        System.out.println("is arr1 equals to arr3: " + Arrays.equals(arr1, arr3));

        int ar[] = {2, 2, 1, 8, 3, 2, 2, 4, 2};

        // To fill complete array with a particular value
        Arrays.fill(ar, 10);
        System.out.println("Array completely filled" + " with 10\n" + Arrays.toString(ar));
    }
}
