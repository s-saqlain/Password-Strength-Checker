package Internship;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PassStrength {

    public static void printtype(String s){
        int n=s.length();
        boolean hasLower=false, hasUpper=false, hasDigit=false, hasCharac=false;
        Set<Character> set= new HashSet<Character>(Arrays.asList('~','!','@','#','$','%','^','&','*','(',')','_','+'));
        for(char i:s.toCharArray()){
            if(Character.isLowerCase(i)) hasLower=true;

            if(Character.isUpperCase(i)) hasUpper=true;

            if(Character.isDigit(i)) hasDigit=true;

            if(set.contains(i)) hasCharac=true;
        }
        System.out.println("Strength of Password:");
        if((hasDigit && hasLower && hasUpper && hasCharac )&&( n>=8))
            System.out.println("Strong Password");


        else if( (hasLower || hasUpper || hasCharac )&&( n>=6 && n<8))
            System.out.println("Moderate Password");

        else
            System.out.println("Weak Password");
    }

    public static void main(String[] args) {
        String input="HelloWorld@123";
        printtype(input);
    }
}
