public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int a ) {
        if (a >= 90) {
            return 'A';
        }
        if (a >= 80) {
            return 'B';
        }
        if (a >= 70) {
            return 'C';
        }
        if (a >= 60) {
            return 'D';
        }
        if (a >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }
    // Question 2 - fizzBuzz
    public static String fizzbuzz(int num){
        if (num % 3 == 0 && num % 5 == 0) {
            return "fizzbuzz";
        } else if (num % 3 == 0) {
            return "fizz";
        } else if (num % 5 == 0) {
            return "buzz";
        } else {
            return "unlucky";
        }
    }

    // Question 3 - frontBack
    public static String frontBack(String str){
        if (str.length() < 2) {
            return str;
        } else {
            String firstTwo = str.substring(0, 2);
        }
            return str.substring(0,2) + str + str.substring(0,2);
        }
        }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c) {
         return(a + b == c) || (a + c == b) || (b + c == a);
    }

    // Question 5 - endUp
    public static String endUp(String str){
        if (str.length() <= 3) {
            return str.toUpperCase();
        }
        else {
            String start = str.substring(0, str.length() - 3);
            String end = str.substring(str.length() - 3).toUpperCase();
            return start + end;
        }
    }
    }
