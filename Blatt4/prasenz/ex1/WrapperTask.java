package Blatt4.prasenz.ex1;

public class WrapperTask {
    public static void main(String[] args) {
        char[] values = {'1', 'a', '3', 'z', '9'};
        int[] nums = {10, 0, -4, 20, 5};

        // You can call your methods here and print results
        // Example:
        // System.out.println(countDigitsPrimitive(values));
    }

    // Task A: Count digits using only primitives (e.g., ASCII comparison)
    public static int countDigitsPrimitive(char[] values) {
        // TODO: Implement using primitive logic
        int count = 0;
        for (char value : values) {
            if (value >= '0' && value <= '9') {
                count++;
            }
        }
        return count;
    }

    // Task B: Count digits using Character.isDigit()
    public static int countDigitsWrapper(char[] values) {
        // TODO: Implement using wrapper method
        int count = 0;
        for (char value : values) {
            if (Character.isDigit(value)) {
                count++;
            }
        }
        return count;
    }

    // Task C: Find max using only primitives
    public static int maxPrimitive(int[] nums) {
        // TODO: Implement using primitive comparison
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Task D: Find max using Integer.compare()
    public static int maxWithWrapper(int[] nums) {
        // TODO: Implement using wrapper comparison
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (Integer.compare(num, max) > 0) {
                max = num;
            }
        }
        return max;
    }
}
