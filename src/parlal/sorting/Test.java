package parlal.sorting;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] lIntegerArray = {9, 7, 5, 3, 4, 1, 2};
        String[] lStrArray = {"hi", "hello", "how", "are", "you", "b", "a"};
        Arrays.parallelSort(lIntegerArray);
        Arrays.parallelSort(lStrArray);
        for (int i = 0; i < lStrArray.length; i++) {
            System.out.println(lStrArray[i]);
        }
        for (int i = 0; i < lIntegerArray.length; i++) {
            System.out.println(lIntegerArray[i]);
        }
    }
}
