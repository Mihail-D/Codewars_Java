import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MergingSortedArrays {
  public static int[] mergeArrays(int[] first, int[] second) {
    Set<Integer> set = new HashSet<>();

    for (Integer t : first) {
      set.add(t);
    }
    for (Integer t : second) {
      set.add(t);
    }

    int[] arr = new int[set.size()];

    Iterator iter = set.iterator();
    int i = 0;
    while (iter.hasNext()) {
      arr[i] = (int) iter.next();
      i++;
    }
    Arrays.sort(arr);
    return arr;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(mergeArrays(new int[] {2, 4, 8}, new int[] {2, 4, 6})));
  }
}

//  2, 4, 6, 8
