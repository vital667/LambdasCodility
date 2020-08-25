package codility2;

import java.util.Arrays;

public class Solution {

    public static int solution(int[] A) {

        int count0 = (int) Arrays.stream(A)
                .filter(x -> x == 0)
                .count();

        int count1 = (int) Arrays.stream(A)
                .filter(x -> x == 1)
                .count();

        return count0 > count1 ? count1 : count0;
    }
}
