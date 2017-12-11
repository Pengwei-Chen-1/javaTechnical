package com.cpw.equals;

/**
 * Created by epeicen on 11/12 0011.
 * Compare equals and ==
 */
public class CompareEquals {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println("n == m:" + (n == m));

        String str = new String("chen");
        String str1 = new String("chen");
        String str2 = new String("chen");
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1.equals(str2): " + str1.equals(str2));

        String str3 = "chen";
        System.out.println("str3 == str2: " + (str3 == str2));
        System.out.println("str3.equals(str2): " + str3.equals(str2));

        str1 = str;
        str2 = str;
        System.out.println("str1 == str2: " + (str1 == str2));
    }
}
