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
            String lastNChars = text.substring(text.length() - n);
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
            double length = text.length();
            double doubledCenter = Math.ceil(length / 2);
            int center = (int) doubledCenter;
            String finalString = text.substring(center - 2, center + 1);
            return finalString;
        }
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    public boolean isCentered(String text, String target) {
        if ((text == null) || (text.length() % 2 != 1) || (text.length() < 3) || (target == null) || (target.length() != 3)) {
            return (false);
        } else {
            double length = text.length();
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
    public static int countMe(String text, char suffix) {
        if (text == null || !Character.isLetter(suffix)) {
            return -1;
        }
        int count = 0;
        String[] arr = text.split(" ");
        for (String i : arr) {
            if (i.charAt(i.length()-1) == suffix) {
                count++;
            }
        }
        return count;
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */
    public static int triplets(String text) {
        if (text == null) {
            return -1;
        }
        int tripCount = 0;
        for (int i = 0; i < text.length()-1; i++) {
            if (text.charAt(i) == text.charAt(i+1) && text.charAt(i) == text.charAt(i+2)) {
                tripCount++;
            }
        }
        return tripCount;
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */
    public static long addMe(String text) {
        if (text == null) {
            return -1;
        }
        long sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char dig = text.charAt(i);
            if (Character.isDigit(dig)) {
                sum += Integer.parseInt(Character.toString(dig));
            }
        }
        return sum;
    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */
    public static long sequence(String text) {
        if (text == null) {
            return -1;
        }
        int length = text.length();
        boolean end = true;
        long count = 0;
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            if (i < length - 1) {
                if (current == text.charAt((i+1)) && end) {
                    end = false;
                }
                if (i > 0) {
                    if(current == text.charAt(i - 1) && current != text.charAt(i+1)){
                        end = true;
                        count ++;
                    }
                }
            } else if (i == length - 1) {
                if (current == text.charAt((i-1))) {
                    end = true;
                    count ++;
                }
            }
        }
        return count;
    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    public static String intertwine(String a, String b) {
        String intertwine = "";
        int alength = a.length();
        int blength = b.length();
        int length;
        if (alength >= blength) {
            length = alength;
        }else {
            length = blength;
        }
        for (int i = 0; i < length; i++) {
            if(i < alength){
                intertwine+=Character.toString(a.charAt(i));
            }
            if (i < blength) {
                intertwine+=Character.toString(b.charAt(i));
            }
        }
        return intertwine;
    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */
    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        String reverseText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText += Character.toString(text.charAt(i));
        }
        if (reverseText.equals(text)) {
            return true;
        }else{
            return false;
        }
    }
}