import java.util.Scanner;

public class Lab21_Function_Arth_Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=readNum(sc,"Enter the first num:");
        int b=readNum(sc,"Enter the second num:");
        int add = add(a,b);
        System.out.println(add);
        int sub = sub(a,b);
        System.out.println(sub);
        float mod = mod(a,b);
        System.out.println(mod);
        int div = div(a,b);
        System.out.println(div);
    }
    static int readNum(Scanner sc, String promt){
        System.out.println(promt);
        if(sc.hasNextInt()){
            return sc.nextInt();
        }
        else{
            System.exit(0);
            return 0;
        }
    }

    static int add (int a, int b){
    return a+b;
    }

    static int div(int a,int b){
        if(b==0){
            throw new ArithmeticException();
        }
        else{
            return a/b;
        }
    }
    static int sub(int a, int b){
        return a-b;
    }
    static float mod(int a,int b){
        return a%b;
    }
}

