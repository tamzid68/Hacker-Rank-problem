import java.util.Arrays;
import java.util.Scanner;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 3, 2, 3};
        int val = 3;

        int newLength = removeElement(nums, val);

        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[count++] = nums[i];

        }
        return count;
    }
}

