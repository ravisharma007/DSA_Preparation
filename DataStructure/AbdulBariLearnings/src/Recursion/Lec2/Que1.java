package Recursion.Lec2;

public class Que1 {
    public static void main(String[] args) {
        fun1("ravi",5);
    }

    public static void fun1(String name, int n){
        if(n < 1)
            return;
        System.out.println(name);
        fun1(name,n-1);
    }
}
