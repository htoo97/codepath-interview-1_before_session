/* Bucketing / Sorting / Repeated number */

/* Find Duplicate in Array */

public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        HashSet set = new HashSet();

        ListIterator<Integer> iter = a.listIterator();
        while (iter.hasNext()) {
            Integer current = iter.next();
            if (set.contains(current)) {
                return current.intValue();
            }
            else {
                set.add(current);
            }
        }

        return 0;
    }
}
