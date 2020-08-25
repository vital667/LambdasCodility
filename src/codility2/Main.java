package codility2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int[] A = {1, 0, 0, 1, 0, 0};
        System.out.println("Minimum coins to swap: " + Solution.solution(A));

        System.out.println("Minimum coins to swap: " + Solution.solution2(A));

        List<Integer> list= Arrays.stream(A).boxed().collect(Collectors.toList());
        System.out.println("Minimum coins to swap: " + Solution.solution3(list));
    }
}
