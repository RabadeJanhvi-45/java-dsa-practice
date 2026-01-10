import java.util.*;
class BasicJava{

    //factorial
    public static int fact(int n){
        // int fact=0;
        if(n==0 || n==1) {
            return 1;
        }
        
        return fact(n-1) * n;
    }
    public static void main(String[] args){
        //
        System.out.println(fact(5));
    }
}