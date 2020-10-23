public class ProblemSet7 {
    public static void main(String[] args) {

    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    public String surroundMe(String in, String out) {
        if ((in == null) || (out == null) || (out.length() != 4)) {
            return (in);
        } else {
            String firstTwo = out.substring(0,2);
            String lastTwo = out.substring(2, 4);
            String result = firstTwo + in + lastTwo;
            return (result);
        }
    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text (overlapping, as needed).
     */
    public String endsMeet(String text, int n) {
        if (text == null || (text.length() > 10 || text.length() < 1) || (n < 1 || n > text.length())) {
            return text;
        }
        else {
            String firstNChars = text.substring(0, n);
            String lastNChars = text.substring(text.length() - n, text.length());
            String finalString = firstNChars + lastNChars;
            return finalString;
        }
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */
    public String middleMan(String text) {
        if ((text == null) || (text.length() % 2 != 1) || (text.length() < 3)) {
            return text;
        } else {
            int length = text.length();
            double doubledCenter = Math.ceil(length / 2);
            int center = (int) doubledCenter;
            String finalString = text.substring(center - 2, center + 1);
            return (finalString);
        }
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    public boolean isCentered(String text, String target) {
        if ((text == null) || (text.length() % 2 != 1) || (text.length() < 3) || (target != null) || (target.length() != 3)) {
            return (false);
        } else {
            int length = text.length();
            double doubledCenter = Math.ceil(length / 2);
            int center = (int) doubledCenter;
            String comparativeString = text.substring(center - 2, center + 1);
            if (comparativeString.equals(target)) {
                return (true);
            } else {
                return (false);
            }
        }
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */
    public int countMe(String text, char suffix) {
        
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */
    public int triplets(String text) {

    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */
    public long addMe(String text) {

    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */
    public long sequence(String text) {

    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    public String intertwine(String a, String b) {

    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */
    public boolean isPalindrome(String text) {

    }
}
