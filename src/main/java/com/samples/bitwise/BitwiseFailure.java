package com.samples.bitwise;

/**
 * @author: reversekick
 * Date: 4/25/13
 */
public class BitwiseFailure {
    static public void main (String args[]){
        //the below on will not compile as the + concatenation converts the last boolean to string and it cannot "|"
        // cannot be applied - you need to use paranthesis like below to make it work.
        //System.out.println(true|false|true +",");

        System.out.println((true|false & true) +",");
        System.out.println(true&false | false);
        System.out.println(""+true);
    }
}
