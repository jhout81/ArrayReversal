import java.util.ArrayList;
import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        //initialize and declare
        ArrayList<Integer> nums = new ArrayList<>();
        Integer numsAdd = 0;
        Scanner in = new Scanner(System.in);
        //while loop to read in integers and populate the arraylist
        while (numsAdd != -1) {
            System.out.println("Enter values (-1 to stop): ");
            numsAdd = in.nextInt();
            nums.add(numsAdd);
        }
        //gets the index size of the array list and and removes the last index integer (-1)
        int numsIndex = nums.size() - 1;
        nums.remove(numsIndex);
        //converting list array (nums) to array (numsArray)
        Object[] numsArray = nums.toArray();
        //for loop iterates backwards to display the values from the array in reverse order
        System.out.println("Your values, reversed:");
        for (int i = numsArray.length - 1; i >= 0; i--) {
            System.out.println(numsArray[i]);
        }

    }
}
