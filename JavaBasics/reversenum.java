import java.util.*;
public class reversenum{
    public static void main(String[] args){
        // int num =1089;
        // while(num>0){
        //     int lastdigit = num%10;
        //     System.out.print(lastdigit);
        //     num = num/10;
        // }
        Scanner sc = new Scanner(System.in);
        int num;
        do{
             num=sc.nextInt();
              System.out.println("Enter your num");
             if(num%10==0){
               continue;
             }
             
System.out.print("your num was  : "+num);
          
        }
        while(true);

    }
}