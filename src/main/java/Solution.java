public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        int length = x.length();
        if (length < 2) {
            return false;
        } else {
        String end = x.substring(length - 2);
        if (end.equals("ly")) {
            return true;
        } else {
            return false;
        }
    }
    }

    public String conCat(String s1, String s2) {
        String s1end = "";
        String s2beg = "";
        if (s1.length () > 0) {
            s1end = s1.substring(s1.length() - 1);
        }
        if (s2.length () > 0) {
            s2beg = s2.substring(0, 1);
        }
        if (s1end.equals(s2beg)) {
            return s1 + s2.substring(1);
        } else {
            return s1 + s2;
        }
    }

    public String withoutX(String s1) {
        String news1 = s1;
        if (news1.substring(0, 1).equals("x")) {
            news1 = s1.substring(1);
        }
        if (news1.substring(news1.length() - 1).equals("x")) {
            news1 = news1.substring(0, news1.length() - 1);
        }
        return news1;
    }

    public String fizzString(String s1) {
        String news1 = "";
        if (s1.substring(0, 1).equals("f")) {
            news1 = "Fizz";
        }
        if (s1.substring(s1.length() - 1).equals("b")) {
            news1 += "Buzz";
        }
        return news1;
    }

    public String fizzString2(int x) {
        if (x % 3 == 0) {
            return "Fizz!";
        }
        if (x % 5 == 0) {
            return "Buzz!";
        }
        if (x % 15 == 0) {
            return "FizzBuzz!";
        }
        return x + "!";
    }

}
