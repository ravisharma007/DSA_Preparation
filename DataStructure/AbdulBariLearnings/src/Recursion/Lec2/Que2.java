package Recursion.Lec2;

public class Que2 {
    public static void main(String[] args) {
        fun1(1,5);
    }

    public static void fun1(int i,int n){
        if(i>n)
            return;
        System.out.println(i);
        fun1(i+1,n);
    }
}

