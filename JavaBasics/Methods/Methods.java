import java.util.*;
public class Methods{

    public static void binToDec(int binNum){
        int MyNum = binNum;
        int pow=0;

        int decNum=0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }

        System.out.println("Decimal of " + MyNum + " = "+decNum);
    }
        public static void dectobin(int decNum){
        int MyNum = decNum;
        int pow=0;

        int binNum=0;

        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            decNum=decNum/2;
        }

        System.out.println("Decimal of " + MyNum + " = "+binNum);
    }

    public static int avg3num(int n1,int n2,int n3){
        int avg=(n1+n2+n3)/3;
        return avg;
    }

    public static boolean iseven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }

    public static String isPalindrom(int num){
        int MyNum = num;

        int rev=0;
        int rem=0;

        while(num>0){
            rem= num%10; //last digit
            rev=rev * 10 +rem; //building reverse num
            num=num/10; //remove last digit
        }
        System.out.println("Orginal num : "+ MyNum + "\n Reverse Num: "+rev);
    if (MyNum == rev) {
        return "Is palindrome ";   // palindrome
    } else {
        return "not palindrome";   // not palindrome
    }
    }

    public static int SumofDigits(int num){
        int sum = 0;
        while(num>0){
            int rem = num %10; //last digit
            sum = rem + sum; //sum
            num=num/10; //remove last digit
        }
        return sum;
    }
    
    public static void main(String args[])
    {
    //     binToDec(1001);
    //     dectobin(7);
        // System.out.println(avg3num(3,4,3));
        // System.out.println(iseven(3));
        // System.out.println(iseven(4));
        // System.out.println(isPalindrom(421));
        // System.out.println(isPalindrom(121));
        System.out.println(SumofDigits(123));
    }
}