package com.oa.taboola;

public class DetectHasInteger {
    /**
     * This Java function detects whether there is an Integer in the input String
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     * @param str Ex:"This Is A Test4me"
     * @return boolean whether there is an Integer
     */
    public static boolean hasInteger(String str) {
        // Special cases : input is null or input is empty
        if (str == null || str.length() == 0) {
            return false;
        }

        // Detect whether there is an Integer
        for (int i = 0; i < str.length(); i++) {
            char singleChar = str.charAt(i);
            if (Character.isDigit(singleChar)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {


        String str1 = "IAMGOOD";
        boolean containsInteger1 = DetectHasInteger.hasInteger(str1);
        System.out.println("Has Integer? " + containsInteger1);

        String str2 = "45222";
        boolean containsInteger2 = DetectHasInteger.hasInteger(str2);
        System.out.println("Has Integer? " + containsInteger2);

        String str3 = "This Is A Test4me ";
        boolean containsInteger3 = DetectHasInteger.hasInteger(str3);
        System.out.println("Has Integer? " + containsInteger3);

        String str4 = "";
        boolean containsInteger4 = DetectHasInteger.hasInteger(str4);
        System.out.println("Has Integer? " + containsInteger4);


    }
}
