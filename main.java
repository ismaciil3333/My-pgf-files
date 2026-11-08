package assigment;

import java.util.Arrays;



public class main {
    static void main() {

    }

    public static void main(String[] args) {

        // Original student IDs
        int[] studentIDs = {101, 102, 103, 104, 105};

        // Call reverseArray method
        int[] result = solution.reverseArray(studentIDs);

        // Display original array
        System.out.println("Original Array: "
                + Arrays.toString(studentIDs));

        // Display reversed array
        System.out.println("Reversed Array: "
                + Arrays.toString(result));
    }
}
