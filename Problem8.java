import java.util.Arrays;

public class Problem8 {
    public static void main (String[]args){
        // Initializing an array original
        int[] org = new int[] {1, 2, 3};

        System.out.println("Original Array");
        for (int i = 0; i < org.length; i++){
            System.out.println(org[i] + " ");
        }

        // Copying array org to copy
        int[] copy = Arrays.copyOf(org, 5);

        // Changing some elements of copy
        copy[3] = 11;
        copy[4] = 55;
        System.out.println("\nNew array copy after modifications:");
        for (int i = 0; i < copy.length; i++){
            System.out.println(copy[i] + " ");
        }
    }
}
