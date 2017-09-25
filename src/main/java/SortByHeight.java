import java.util.*;
import java.util.stream.Collectors;

public class SortByHeight {

    static int[] sortByHeightV1(int[] a) {
        ArrayList<Integer> tmpArr = new ArrayList<>(a.length);
        for (int el : a)
            if (el > -1)
                tmpArr.add(el);
        Collections.sort(tmpArr);
        Iterator<Integer> it = tmpArr.iterator();
        for (int i = 0; i < a.length; i++)
            if (a[i] > -1)
                a[i] = it.next();
        return a;
    }

    static int[] sortByHeightV2(int[] a) {
        List<Integer> sortedPeople = Arrays.stream(a)
                .boxed()
                .filter(i -> i != -1)
                .sorted()
                .collect(Collectors.toList());

        Queue<Integer> peopleQueue = new ArrayDeque<>(sortedPeople);

        return Arrays.stream(a)
                .boxed()
                .map(i -> i == -1 ? i : peopleQueue.poll())
                .mapToInt(i -> i)
                .toArray();
    }

    static int[] sortByHeightV3(int[] a) {
        int i, j, temp;
        for (i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                for (j = i + 1; j < a.length; j++) {
                    if (a[i] > a[j] && a[j] != -1) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
    }
}
