public class Challenge3 {
    public static void main (String[]args){
        // Declares the range of numbers (1 - 100)
        int nums[] = new int[101];

        for (int i = 0; i < 100; i++){
            if (nums[i] >= 1){
                System.out.print("1 - 10  |  ");
            }
            else if (nums[i] >= 11){
                System.out.print("1 - 10  |  ");
            }
            else if (nums[i] >= 21){
                System.out.print("11 - 20  |  ");
            }
            else if (nums[i] >= 31){
                System.out.print("21 - 30  |  ");
            }
            else if (nums[i] >= 41){
                System.out.print("31 - 40  |  ");
            }
            else if (nums[i] >= 51){
                System.out.print("41 - 50  |  ");
            }
            else if (nums[i] >= 61){
                System.out.print("51 - 60  |  ");
            }
            else if (nums[i] >= 71){
                System.out.print("61 - 70  |  ");
            }
            else if (nums[i] >= 81){
                System.out.print("71 - 80  |  ");
            }
            else if (nums[i] >= 91){
                System.out.print("81 - 90  |  ");
            }
            else if (nums[i] < 101){
                System.out.print("91 - 100  |  ");
            }
        }
    }
}
