import java.util.*;
public class print1to10{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=1;
        int sum=0;
        while(cnt<=n){
            System.out.print(cnt +" ");
            sum=sum+cnt;
            
            cnt++;
        }
        System.out.println(sum);
    }
}