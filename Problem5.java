// Method can return multiple values of same type by returning an array
public class Problem5 {
    // Returns an array suck that first element of array is a+b, and second is a-b
    public static int[] getSumAndSUB(int a, int b){
        int[] ans = new int[2];
        ans[0] = a + b;
        ans[1] = a - b;

        // Returning array of elements
        return ans;
    }
    public static void main (String[]args){
        int[] ans = getSumAndSUB(100, 50);
        System.out.println("Sum = " + ans[0]);
        System.out.println("Sub = " + ans[1]);
    }
}
