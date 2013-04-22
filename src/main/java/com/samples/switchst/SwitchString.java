package com.samples.switchst;

/**
 * @author: reversekick
 * Date: 4/22/13
 */
public class SwitchString {

    static public void main (String args[]){
        String[] myArray = {"first","second","third"};
        SwitchString ss = new SwitchString();
        //let us take the fixed set of strings handle by our switch
        for(String s:myArray){
            ss.printSwitchOutput(s);
        }

        //let us prove it is working with any other non-handle
        ss.printSwitchOutput("non-expected");
    }

    private void printSwitchOutput(String s){
        switch(s){
            case "first":
                System.out.println("This is a first string");
            break;
            case "second":
                System.out.println("This is a second string");
             break;
            case "third" :
                System.out.println("This is a third string");
            break;
            default:
                System.out.println("This is a default string "+s);
                break;
        }
    }

}
