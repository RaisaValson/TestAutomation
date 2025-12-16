import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lab23_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        StringBuilder newStr = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            newStr.append(str.charAt(i));
        }
        if (str.equals(newStr.toString())) {
            System.out.println("Palindrome" +newStr);
        }
        else{
            System.out.println("Not palindrome"+newStr);
        }
    }}