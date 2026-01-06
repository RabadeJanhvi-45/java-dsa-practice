import java.util.*;
class OddorEven{

    public static String oddeven(int num){
        if(num%2==0){
            return "Num is Even";
        }
        return "Num is Odd";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(oddeven(num));
        sc.close();
    }
}