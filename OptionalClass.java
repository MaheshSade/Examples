package org.leetcode;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(4);
//        Optional<Integer> optional1 = Optional.of(null);                        //null error
        Optional<Integer> optional2 = Optional.ofNullable(null);
        System.out.println(optional.isEmpty());                                   //false
        System.out.println(optional2.isEmpty());                                  //true
        System.out.println(optional.orElse(6));                             //4
        System.out.println(optional2.orElse(6));                            //6
        System.out.println(optional.get());                                       //4
//        System.out.println(optional2.get());                                      //NoSuchElementException
        System.out.println(optional.isPresent());                                 //true
        System.out.println(optional2.isPresent());                                //false
        optional.ifPresent(a-> System.out.println(a));                            //4
        optional2.ifPresent(a-> System.out.println(a));                           //won't print because condition fails
        System.out.println(optional.orElseThrow());                               //4
//        System.out.println(optional2.orElseThrow());                              //NoSuchElementException


    }
}
