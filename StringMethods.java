import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Mahesh Sade";
        int size = s1.length();                                          //11
        char ch = s1.charAt(2);                                          //h
        int idx1 = s1.indexOf("h");                                      //2
        int idx2 = s1.indexOf("a",5);                        //8

        String s2 = s1.replaceFirst("h","s");            //Masesh Sade
        String s3 = s1.replace("h","s");                //Masess Sade
        String s4 = s1.replace(" ","");                 //MaheshSade
        String s5 = s1.replace("es","vr");              //Mahvrh Sade
        String s6 = s1.replaceAll("he","d");            //Madsh Sade

        String sub1 = s1.substring(3);                         //esh Sade
        String sub2 = s1.substring(1,5);                                //ahes
        CharSequence c = s1.subSequence(1,5);                           //ahes

        boolean b1 = s1.contains("he");                                 //true
        boolean b2 = s1.contentEquals("he");                         //false
        boolean b3 = s1.contentEquals("Mahesh Sade");                //true
        s1.matches("Mahesh Sade");                                 //true
        s1.matches(" Mahesh Sade");                                //false

        int l1 = s1.lastIndexOf("e");                                //10
        int l2 = s1.lastIndexOf("e",9);                     //3
        int l3 = s1.lastIndexOf("e",10);                    //10
        int l4 = s1.lastIndexOf("ad");                               //8
        int l5 = s1.lastIndexOf(97);                                 //8

        //copying array
        char[] chars = new char[10];
        s1.getChars(0,6,chars,0);                  //Mahesh

        //covert into ascii values
        int c1 = s1.codePointAt(1);                                //97
        int c2 = s1.codePointBefore(4);                            //101
        int c3 = s1.codePointCount(1,5);                                 //4

        //space in start of a string
        String i1 = s1.indent(4);                                     //    Mahesh Sade
        String i2 = s1.indent(0);                                     //Mahesh Sade

        //removes white spaces front & back
        String si = "   Mahesh Sade ";
        si.stripIndent();                                               //Mahesh Sade
        i1.stripIndent();                                               //    Mahesh Sade
        si.stripLeading();                                              //Mahesh Sade
        si.stripTrailing();                                             //   Mahesh Sade
        si.trim();                                                      //Mahesh Sade

        int length = s1.transform(String::length);                      //11
        String t1 = s1.transform(s -> s.toUpperCase());                 //MAHESH SADE

        String r1 = s1.repeat(3);                                 //Mahesh SadeMahesh SadeMahesh Sade
        s1.startsWith("Ma");                                            //true
        s1.startsWith("he", 2);                             //true
        s1.endsWith("de");                                              //true

        " ".isEmpty();                                                  //false
        " ".isBlank();                                                  //true

        //created exact copy and ref also
        String intern = s1.intern();                                    //Mahesh Sade

        String sp1[] = s1.split("s");                              //[Mahe,h Sade]
        String sp2[] = s1.split("h",2);                       //[Ma,esh Sade]
        String sp3[] = s1.split("h",3);                       //[Ma,es, Sade]
        String sp4[] = s1.split("h",1);                       //[Mahesh Sade]



    }
}
