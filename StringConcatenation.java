package org.leetcode;

public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = "Mahesh";
        String s2 = "Sade";
        int i = 4;
        int j = 5;
        String s3 = s1 + s2;                            //MaheshSade
        String s4 = s1.concat(s2);                      //MaheshSade
        String s5 = s1+i;                               //Mahesh4
        String s6 = i+s1;                               //4Mahesh
        String s7 = j + s1;                             //5Mahesh
        String s8 = i + s1 + j;                         //4Mahesh5
        String s9 = i + s1 + j+ i;                      //4Mahesh54
        String s10 = j+ i + s1 + j+ i;                  //9Mahesh54
//        String s11 = s1.concat(null);                 //NPE
        String s12 = s1.concat("");                     //Mahesh
//        String s13 = s1.concat(i);                    //error
//        String s14 = j.concat(s2);                    //error
     
    }
}
