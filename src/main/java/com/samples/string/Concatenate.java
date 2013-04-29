package com.samples.string;

/**
 * @author: syedbahm
 * Date: 4/25/13
 */
public class Concatenate {
    static public void main (String args[]){
        //note this will output 333 not 36
        System.out.println("3"+3+3);
        //this will also output 333
        System.out.println(3+"3"+3);
        //this will output 63
        System.out.println(3+3+"3");
    }
}
