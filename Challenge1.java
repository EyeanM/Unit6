import java.util.Arrays;

public class Challenge1 {
    public static void main(String[]args){
        int arr1[] = {1, 4, 2, 6, 7, 5};

        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println();

        int total = 0;
        System.out.println("Array Total Length: " + arr1.length);
        for (int i = 0; i < arr1.length; i++){
            total += arr1[i];
        }
        System.out.println("Total: " + total);
        System.out.println();

        double arr1Avg = 0;
        arr1Avg = (total / arr1.length);
        System.out.println("Average: " + arr1Avg);
        System.out.println();

        int max = 0;
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] > max);{
                max = arr1[1];
            }
        }
        System.out.println("Maximum: " + max);

        int min = 0;
        for (int i = 0; i > arr1.length; i--){
            if (arr1[i] < min){
                min = arr1[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println();

        Arrays.sort(arr1);
        System.out.println("Sorted arrays: " + Arrays.toString(arr1));
    }
}
