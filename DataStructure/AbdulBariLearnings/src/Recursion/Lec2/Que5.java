package Recursion.Lec2;

public class Que5 {
    public static void main(String[] args) {
        fun1(5);
    }

    public static void fun1( int n){
        if(n < 1)
            return;
        System.out.println(n);
        fun1(n-1);
    }
}

