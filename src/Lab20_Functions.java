import java.util.Scanner;

public class Lab20_Functions {
    public static void main(String[] args) {
        sumOfTwoNumbers(4.89,50);
        sumOfTwoNumbers(5,8);
        sumOfTwoNumbers(45.6,34);
    }

    static void sumOfTwoNumbers(int a,int b){
        System.out.printf("Sum1 is %d \n",a+b);
    }

    static void sumOfTwoNumbers(float a, float b)
    {
        System.out.printf("Sum2 is %5.2f \n",a+b);
    }

    static void sumOfTwoNumbers(double a, int b){
        System.out.printf("Sum3 is %5.2f \n",a+b);
    }

}