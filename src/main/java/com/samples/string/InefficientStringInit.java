package com.samples.string;

/**
 * @author  syedbahm
 * Date: 4/24/13
 */
public class InefficientStringInit {

    static public void main(String args[]){
        //the following makes string allocation twice
        String str = new String("hello");
        String str2 = "hello1";
        String str3 = str2 + "hello1";
    }

}
