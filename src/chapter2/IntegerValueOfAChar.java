package practiceFromDeitel.chapter2;
//Ex. 2.29

import javax.swing.*;

public class IntegerValueOfAChar {
    public static void main(String[] args) {
      char ch = 'A';
      findIntOfChar(ch);

    }

    public static void findIntOfChar(char ch){
        System.out.println("String value of char: " + ch + " is : " + (int) ch);
    }
}
