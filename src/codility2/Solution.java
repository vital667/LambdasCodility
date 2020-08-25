package codility2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

    public static int solution2(int [] A){
        return Math.min(
                (int) Arrays.stream(A).filter(x->x==1).count(),
                (int) Arrays.stream(A).filter(x->x==0).count()
                );
    }

    public static int solution3(List<Integer> list){
        return Math.min(
                Collections.frequency(list,1),
                Collections.frequency(list,0)
        );
    }

}
