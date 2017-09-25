// Given an array of equal-length strings, check if it is possible to rearrange the strings in such a way that
// after the rearrangement the strings at consecutive positions would differ by exactly one character.
//
//        Example
//
//        For inputArray = ["aba", "bbb", "bab"], the output should be
//        stringsRearrangement(inputArray) = false;
//
//        All rearrangements don't satisfy the description condition.
//
//        For inputArray = ["ab", "bb", "aa"], the output should be
//        stringsRearrangement(inputArray) = true.
//
//        Strings can be rearranged in the following way: "aa", "ab", "bb".
//        Input/Output
//
//        [time limit] 3000ms (java)
//        [input] array.string inputArray
//
//        A non-empty array of strings of lowercase letters.
//
//        Guaranteed constraints:
//        2 ≤ inputArray.length ≤ 10,
//        1 ≤ inputArray[i].length ≤ 15.


public class StringsRearrangement {

    boolean stringsRearrangement(String[] inputArray) {
        boolean[][] graph = getGraph(inputArray, false);
        return false;
    }

    private boolean[][] getGraph(String[] inputArray, boolean addSentinel) {
        boolean[][] result = new boolean[inputArray.length][inputArray.length];
        for (int i = 0; i < inputArray.length; i++)
            for (int j = 0; j < inputArray.length; j++) {
                if (i != j)
                    result[i][j] = areClose(inputArray[i], inputArray[j]);
                else
                    result[i][j] = false;
            }
        return result;
    }

    private boolean areClose(String a, String b) {
        int diffCount = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                diffCount++;
            if (diffCount > 1)
                return false;
        }
        return diffCount == 1;
    }

    static boolean stringsRearrangementStatic(String[] inputArray) {
        return (new StringsRearrangement()).stringsRearrangement(inputArray);
    }
}
