package org.leetcode;

public class StringEquality {
    public static void main(String[] args) {
        String s1 = "s";
        String s2 = "s";
        String s3 = new String("s");
        String s4 = new String("s");
        System.out.println(s1.equals(s2));        //true
        System.out.println(s1.equals(s3));        //true
        System.out.println(s3.equals(s4));        //true
        System.out.println(s1==s2);               //true
        System.out.println(s3==s4);               //false
        System.out.println(s1==s3);               //false
        System.out.println(s1.compareTo(s2));     //0
        System.out.println(s3.compareTo(s4));     //0
        System.out.println(s1.compareTo(s3));     //0
        System.out.println(s1.compareTo("si"));   //-1
        System.out.println(s1.compareTo(""));     //1
    }
}
