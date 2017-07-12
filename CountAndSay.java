/* String simulation buclet */
/* Count And Say */

public class Solution {
    public String countAndSay(int A) {
        String current = "1";

        for (int i=1; i<A; i++) {
            StringBuffer buffer = new StringBuffer();
            int count = 0;

            // iterate through the current string and generate new one
            for (int j=0; j<current.length(); j++) {
                // first character, or current character same as previous character
                if (j == 0 || current.charAt(j) == current.charAt(j-1)) { 
                    count++;
                }
                // append to string buffer
                else {
                    buffer.append(Integer.toString(count));
                    buffer.append(current.charAt(j-1));
                    count = 1;
                }
            }

            // add last sequence to string
            buffer.append(Integer.toString(count));
            buffer.append(current.charAt(current.length() - 1));

            // assign new string to current
            current = buffer.toString();
        }

        return current;
    }
}

