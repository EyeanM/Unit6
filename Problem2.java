public class Problem2 {
    public static void main (String[]args){
        // Demonstrates basic array declaration and use.
        final int LIMIT = 15, MULTIPLE = 10;
        int[] list = new int[LIMIT];

        // Initialize the array values
        for (int index = 0; index < LIMIT; index++){
            list[index] = index * MULTIPLE;
        }
        list[5] = 999; // Change one array value
        list[7] = 444; // Change one array value

        // Print the array values
        for (int value: list){
            System.out.print(value + " ");
        }
    }
}
