/* String parsing */
/* Atoi */
c class Solution {

    public int atoi(final String A) {
        int result = 0;
        boolean neg = false;

        // iterate through the whole string
        for (int i=0; i<A.length(); i++) {
            // check for positive and negative signs
            if(i == 0 && A.charAt(i) == '+') {
                // skip to next charactr immediately to check for number
                continue;
            }
            else if (i == 0 && A.charAt(i) == '-') {
                // make whole result negative
                neg = true;
            }
            else if (Character.isDigit(A.charAt(i))) {
                int current = Character.getNumericValue(A.charAt(i));

                // check for overflows before multiplying
                // negative
                if (neg) {
                    if ((result * -1) >= (Integer.MIN_VALUE / 10)) {
                        result = result * 10;
                    }
                    else {
                        result = Integer.MIN_VALUE;
                        break;
                    }
                }
                // positive
                else {
                    if (result <= Integer.MAX_VALUE / 10) {
                        result = result * 10;
                    }
                    else {
                        result = Integer.MAX_VALUE;
                        break;
                    }
                }

                // check for overflows before adding
                // negative
                if (neg) {
                    if ( (result * -1) >= (Integer.MIN_VALUE + current) ) {
                        result += current;
                    }
                    else {
                        result = Integer.MIN_VALUE;
                        break;
                    }
                }
                // positive
                else {
                    if (result <= Integer.MAX_VALUE - 10) {
                        result += current;
                    }
                    else {
                        result = Integer.MAX_VALUE;
                        break;
                    }
                }
            }
            else {
                break;
            }
        }

        if (neg && result != Integer.MIN_VALUE) {
            result = result * -1;
        }

        return result;
    }
}


