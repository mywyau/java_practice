package dsa;

// Complexity Analysis
// Time Complexity: O(log x) - Due to binary search.
// Space Complexity: O(1) - Uses constant space.
 
public class Sqrt {

    // Returns the integer part of the square root of x
    public int sqrt(int x) {
        if (x < 2) return x;

        int left = 1, right = x / 2;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Use division to prevent overflow: mid * mid <= x
            if (mid <= x / mid) {
                result = mid;        // mid is a possible answer
                left = mid + 1;      // try to find a larger one
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Sqrt sqrtCalc = new Sqrt();

        System.out.println("sqrt(0)  = " + sqrtCalc.sqrt(0));   // 0
        System.out.println("sqrt(1)  = " + sqrtCalc.sqrt(1));   // 1
        System.out.println("sqrt(4)  = " + sqrtCalc.sqrt(4));   // 2
        System.out.println("sqrt(8)  = " + sqrtCalc.sqrt(8));   // 2
        System.out.println("sqrt(10) = " + sqrtCalc.sqrt(10));  // 3
        System.out.println("sqrt(1000000) = " + sqrtCalc.sqrt(1000000));  // 1000
    }
}
