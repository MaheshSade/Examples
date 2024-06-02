package org.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {

    public int add(int i){
        int result = i+5;
        return result;
    }
    public static void main(String[] args) {
        StreamAPI s = new StreamAPI();
        int[] arr = {5,6,1,51,2,1,32,5,31,7,8,8,9};
        int[] arr1 = {};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        //Average
        double average1 = Arrays.stream(arr).average().getAsDouble();       //12.76923076923077
        OptionalDouble average2 = Arrays.stream(arr).average();             //OptionalDouble[12.76923076923077]
//        double average3 = Arrays.stream(arr1).average().getAsDouble();    //error
        OptionalDouble average4 = Arrays.stream(arr1).average();            //OptionalDouble.empty

        //FindAny
        int any = Arrays.stream(arr).findAny().getAsInt();                  //5 (first element)
        OptionalInt any1 = Arrays.stream(arr).findAny();                    //OptionalInt[5]
//        int any2 = Arrays.stream(arr1).findAny().getAsInt();              //error
        OptionalInt any3 = Arrays.stream(arr1).findAny();                   //OptionalInt.empty

        //Distinct
        List<Integer> distinct = Arrays.stream(arr).distinct()
                .boxed().collect(Collectors.toList());                      //[5, 6, 1, 51, 2, 32, 31, 7, 8, 9]
        int[] distinct1 = Arrays.stream(arr).distinct().toArray();

        for (int i : distinct1) {
//            System.out.print(i+",");                                      //5,6,1,51,2,32,31,7,8,9,
        }

        List<Integer> distinct2 = Arrays.stream(arr1).distinct()
                .boxed().collect(Collectors.toList());                      //[]
        int[] distinct3 = Arrays.stream(arr1).distinct().toArray();
        for (int i : distinct3) {
//            System.out.println(i);                                        //wont print anything
        }

        //Count
        long count = Arrays.stream(arr).count();                            //13
        long count1 = Arrays.stream(arr1).count();                          //0

        //ForEach
//        Arrays.stream(arr).forEach(element-> System.out.print(element));    //prints all elements
//        Arrays.stream(arr).forEach(System.out::print);                      //prints all elements with method reference
        Arrays.stream(arr).forEach(s::add);                                   // passes every element through add function
//        final int[] j = {0};
//        Arrays.stream(arr).forEach(element->{
//            int i = element + 5;                                              //replacing elements in array with +5
//            arr[j[0]] = i;
//            j[0]++;
//        });

        //Minimum
        int min = Arrays.stream(arr).min().getAsInt();                          //1
        OptionalInt min1 = Arrays.stream(arr).min();                            //OptionalInt[1]
//        int min2 = Arrays.stream(arr1).min().getAsInt();                      //error
        OptionalInt min3 = Arrays.stream(arr1).min();                           //OptionalInt.empty

        //Maximum
        int max = Arrays.stream(arr).max().getAsInt();                          //51
        OptionalInt max1 = Arrays.stream(arr).max();                            //OptionalInt[51]
//        int max2 = Arrays.stream(arr1).max().getAsInt();                        //error
        OptionalInt max3 = Arrays.stream(arr1).max();                           //OptionalInt.empty


        //Map
        List<Integer> map = Arrays.stream(arr).map(a-> a*a)
                .boxed().collect(Collectors.toList());                          //[25, 36, 1, 2601, 4, 1, 1024, 25, 961, 49, 64, 64, 81]
        List<Integer> map1 = Arrays.stream(arr1).map(a-> a*a)                   //[]
                .boxed().collect(Collectors.toList());
        Set<Integer> map2 = Arrays.stream(arr).map(a-> a*a)                     //[1024, 64, 1, 961, 49, 81, 36, 4, 25, 2601]
                .boxed().collect(Collectors.toSet());
        Set<Integer> map3 = Arrays.stream(arr1).map(a-> a*a)                    //[]
                .boxed().collect(Collectors.toSet());

        //Filter
        List<Integer> filter = Arrays.stream(arr).filter(a-> a<8)
                .boxed().collect(Collectors.toList());                          //[5, 6, 1, 2, 1, 5, 7]
        List<Integer> filter1 = Arrays.stream(arr1).filter(a-> a<8)
                .boxed().collect(Collectors.toList());                          //[]
        Set<Integer> filter2 = Arrays.stream(arr).filter(a-> a<8)
                .boxed().collect(Collectors.toSet());                           //[1, 2, 5, 6, 7]
        Set<Integer> filter3 = Arrays.stream(arr1).filter(a-> a<8)
                .boxed().collect(Collectors.toSet());                           //[]

        //Map & Filter
        List<Integer> mapfilter = Arrays.stream(arr).filter(a-> a<8)            //[25, 36, 1, 4, 1, 25, 49]
                .map(a->a*a).boxed().collect(Collectors.toList());
        List<Integer> mapfilter1 = Arrays.stream(arr1).filter(a-> a<8)          //[]
                .map(a->a*a).boxed().collect(Collectors.toList());
        Set<Integer> mapfilter2 = Arrays.stream(arr).filter(a-> a<8)            //[1, 49, 36, 4, 25]
                .map(a->a*a).boxed().collect(Collectors.toSet());
        Set<Integer> mapfilter3 = Arrays.stream(arr1).filter(a-> a<8)           //[]
                .map(a->a*a).boxed().collect(Collectors.toSet());

        //DropWhile
        List<Integer> drop = Arrays.stream(arr).dropWhile(a->a<7)               //[51, 2, 1, 32, 5, 31, 7, 8, 8, 9]
                .boxed().collect(Collectors.toList());                          //drop elements until the condition fails & print remaining elements
        List<Integer> drop1 = Arrays.stream(arr1).dropWhile(a->a<3)             //[]
                .boxed().collect(Collectors.toList());

        //Limit
        List<Integer> limit = Arrays.stream(arr).limit(5)               //[5, 6, 1, 51, 2]
                .boxed().collect(Collectors.toList());
        List<Integer> limit1 = Arrays.stream(arr1).limit(5)             //[]
                .boxed().collect(Collectors.toList());
        Set<Integer> limit2 = Arrays.stream(arr).limit(5)               //[1, 2, 51, 5, 6]
                .boxed().collect(Collectors.toSet());
        Set<Integer> limit3 = Arrays.stream(arr1).limit(5)              //[]
                .boxed().collect(Collectors.toSet());

        //AnyMatch
        boolean anyMatch = Arrays.stream(arr).anyMatch(a->a==4);                //false
        boolean anyMatch1 = Arrays.stream(arr).anyMatch(a->a==7);               //true
        boolean anyMatch2 = Arrays.stream(arr).anyMatch(a->a>51);               //false
        boolean anyMatch3 = Arrays.stream(arr1).anyMatch(a->a>51);              //false
        //AllMatch
        boolean allMatch = Arrays.stream(arr).allMatch(a->a<51);                //false
        boolean allMatch1 = Arrays.stream(arr).allMatch(a->a<52);               //true
        boolean allMatch2 = Arrays.stream(arr).allMatch(a->a==5);               //false

        //FlatMap
        int[][] flatarr = {{4,6,2},{4,3},{8,6}};
        int[][] flatarr1 = {{},{},{}};
        List<Integer> flatmap = Arrays.stream(flatarr)                           //[4, 6, 2, 4, 3, 8, 6]
                .flatMap(a-> Arrays.stream(a).boxed())
                .collect(Collectors.toList());
        List<Integer> flatmap1 = Arrays.stream(flatarr1)                         //[]
                .flatMap(a-> Arrays.stream(a).boxed())
                .collect(Collectors.toList());

        //Map To Double
        List<Double> mapDouble = Arrays.stream(arr).mapToDouble(a->a*3)           //[15.0, 18.0, 3.0, 153.0, 6.0, 3.0, 96.0, 15.0, 93.0, 21.0, 24.0, 24.0, 27.0]
                .boxed().collect(Collectors.toList());
        List<Double> mapDouble1 = Arrays.stream(arr1).mapToDouble(a->a*3)         //[]
                .boxed().collect(Collectors.toList());
        Set<Double> mapDouble2 = Arrays.stream(arr).mapToDouble(a->a*3)           //[18.0, 153.0, 21.0, 93.0, 3.0, 6.0, 96.0, 24.0, 27.0, 15.0]
                .boxed().collect(Collectors.toSet());

        //Map To Long
        List<Long> mapLong = Arrays.stream(arr).mapToLong(a->a*3)                 //[15, 18, 3, 153, 6, 3, 96, 15, 93, 21, 24, 24, 27]
                .boxed().collect(Collectors.toList());
        List<Long> mapLong1 = Arrays.stream(arr1).mapToLong(a->a*3)               //[]
                .boxed().collect(Collectors.toList());
        Set<Long> mapLong2 = Arrays.stream(arr).mapToLong(a->a*3)                 //[96, 18, 3, 21, 6, 24, 153, 27, 93, 15]
                .boxed().collect(Collectors.toSet());

        //forEachOrdered
//        Arrays.stream(arr).parallel().forEach(System.out::print);                 //5313289781512516
        //will keep order of the elements anytime
//        Arrays.stream(arr).parallel().forEachOrdered(System.out::print);          //5615121325317889
        Arrays.stream(arr1).forEachOrdered(System.out::println);

        //peek
//        List<Integer> peek = Arrays.stream(arr).peek(System.out::print)             //replacement for foreach which gives other stream
//                .boxed().collect(Collectors.toList());                              //5615121325317889
//        List<Integer> peek1 = Arrays.stream(arr1).peek(System.out::print)
//                .boxed().collect(Collectors.toList());                                //empty

        //skip
//        Arrays.stream(arr).skip(3).peek(System.out::print)                          //5121325317889
//                .boxed().collect(Collectors.toList());
//        Arrays.stream(arr).skip(3).peek(System.out::print);                         //empty
        Arrays.stream(arr1).skip(3).peek(System.out::print)                          //empty
                .boxed().collect(Collectors.toList());


    }
}
