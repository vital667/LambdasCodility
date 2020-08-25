package codility1;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] A) {

        return Arrays.stream(A)
                .filter(x -> x % 2 == 0)
                .sum();
    }
}
