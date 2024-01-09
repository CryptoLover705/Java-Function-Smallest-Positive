import java.util.HashSet;

class Solution {
    public int solution(int[] A) {
        // Use a HashSet to store unique positive integers in the array
        HashSet<Integer> set = new HashSet<>();

        // Iterate through the array and add positive integers to the set
        for (int num : A) {
            if (num > 0) {
                set.add(num);
            }
        }

        // Check for the smallest positive integer not present in the set
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        // This line should not be reached, as there is always a solution
        return -1;
    }
}
