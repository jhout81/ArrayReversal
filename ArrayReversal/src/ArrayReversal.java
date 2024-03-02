import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] numsUser = new int[1];
        Integer numsAdd = 0;
        Scanner in = new Scanner(System.in);
        int count = -1;
        //loop to read in users integers into each new copy of the array
        while (numsAdd != -1) {
            System.out.println("Enter values (-1 to stop): ");
            //increments 1 each time so the user input gets put into the next index
            count += 1;
            numsAdd = in.nextInt();
            numsUser[count] = numsAdd;
            //creates a new copy of the array 1 index bigger every iteration
            numsUser = Arrays.copyOf(numsUser, numsUser.length + 1);
        }
        //decreases array size by 2 to get rid of the -1 in the array
        numsUser = Arrays.copyOf(numsUser, numsUser.length - 2);
        //prints out the array in reverse order
        System.out.println("Your values, reversed:");
        for (int i = numsUser.length - 1; i >= 0; i--) {
            System.out.println(numsUser[i]);
        }

    }
}
