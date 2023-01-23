package Recursion.Lec2;

public class Que4 {
    public static void main(String[] args) {
        fun1(5);
    }

    public static void fun1(int n){
        if(n < 1)
            return;
        fun1(n-1);
        System.out.println(n);
    }
}

