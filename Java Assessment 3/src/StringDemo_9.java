//9. Write a program to create a class called String Demo and use functions like
// length,CharAt,Concat,equals,startswith(),Endswith(),substring(),lastindex(),index(),reverse on them.
import java.lang.*;
import java.lang.StringBuilder;
import java.io.*;
import java.util.*;
public class StringDemo_9 {
    public static void main(String[] args){
        String str1 = "Hi I am Kanthimathi.";
        String str2 = "Working in Brimma Tech.";
        String str3 = "Kanthi";
        String str4 = "Kanthi";
        StringBuilder str5 = new StringBuilder();
        str5.append(str2);

        System.out.println("The String1 is: " + str1);
        System.out.println("The String2 is: " + str2);
        System.out.println("The String3 is: " + str3);
        System.out.println("The String4 is: " + str4);
        System.out.println("The String5 is: " + str5); //after appending the str2 into this string

        System.out.println("The length of the string 1 is: " + str1.length()); //length
        System.out.println("The charAt() method in string 1: " + str1.charAt(19));
        System.out.println("The concatenation of String 1&2: " + str1.concat(str2));
        System.out.println("The equals() method for string 3&4: " + str3.equals(str4));
        System.out.println("The equals() method for string 1&2: " + str1.equals(str2));
        System.out.println("The startsWith() method for string 3: " + str3.startsWith("Kan"));
        System.out.println("The endsWith() method for string 3: " + str3.endsWith("Kan"));
        System.out.println("The substring: "+ str2.substring(5,13));
        System.out.println("The lastIndexOf() method in string 1: " + str1.lastIndexOf("hi"));
        System.out.println("The indexOf() method in string 1: " + str1.indexOf("K")); // case-sensitive
        System.out.println("The reverse() method for string 1: " + str5.reverse());
    }
}
