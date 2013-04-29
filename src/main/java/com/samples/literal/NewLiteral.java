package com.samples.literal;

/**
 * The following is an example of new Java 7 stuff
 * This will output the literals as
 *
 * 5555555555555555
 *1000000
 *3.14159
 *
 * The syntax is their to make the code more readable
 *
 * @author: syedbahm
 * Date: 4/29/13
 */
public class NewLiteral {
    long credit_card_number = 5555_5555_5555_5555L;
    int largeNumber = 1_000_000;
    float pi = 3.14_159f;

    static public void main(String args[]){
        NewLiteral newLiteral = new NewLiteral();
        System.out.println(newLiteral.credit_card_number);
        System.out.println(newLiteral.largeNumber);
        System.out.println(newLiteral.pi);

    }
}
