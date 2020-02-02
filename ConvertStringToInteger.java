package com.oa.taboola;

public class ConvertStringToInteger {
    /**
     * This Java function takes a string input and converts it to an integer
     * Space Complexity: O(N)
     * Time Complexity: O(1)
     * @param str Ex:"123"
     * @return Integer Ex: 123
     */
    public static Integer convertStringToInteger(String str) {
        // Special Cases : input is null or input is empty
        if (str == null || str.length() == 0) {
            return null;
        }

        // Convert String to Integer
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            char singleNumber = str.charAt(i);
            res = res * 10 + singleNumber - '0';
        }
        return res;
    }

    public static void main(String[] args) {

        String str1 = "123";
        Integer res1 = ConvertStringToInteger.convertStringToInteger(str1);
        System.out.println("Convert String " + str1 + " to Integer " + res1);


        String str2 = "0012";
        Integer res2 = ConvertStringToInteger.convertStringToInteger(str2);
        System.out.println("Convert String " + str2 + " to Integer " + res2);

        String str3 = "";
        Integer res3 = ConvertStringToInteger.convertStringToInteger(str3);
        System.out.println("Convert String " + str3 + " to Integer " + res3);

        String str4 = "0012";
        Integer res4 = ConvertStringToInteger.convertStringToInteger(str4);
        System.out.println("Convert String " + str4 + " to Integer " + res4);

    }
}
