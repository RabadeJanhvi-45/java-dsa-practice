// import java.util.*;
public class AdvancedPatterns{

    public  static void hollow_rectangle(int totRows, int totCols){

        for(int i=1;i<=totRows;i++){
            //inner loop -col
            for(int j=1;j<=totCols;j++){
                //cell(i,j)
                if(i==1 || i== totRows || j==1 || j==totCols){
                    //boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
             System.out.println();
        }
    }
    public static void inverted_rotated_half_pyramid(int n)
    {
        //outer loop
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
public static void half_pyramid(int n)
    {
        //outer loop
        for(int i=1;i<=n;i++){
             //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
           
            System.out.println();
        }
    }
     public static void inverted_half_pyramid_with_Num(int n)
    {
        //outer loop
        for(int i=1;i<=n;i++){
            //star
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            //spaces
            for(int j=0;j<n;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n){
        int cnt=1;
        for(int i=1;i<=n;i++){//outer loop

        for(int j=1;j<=i;j++){
            System.out.print(cnt + " ");
            cnt++;
        }
        System.out.println();

        }
    }

    public static void _01triangle(int n){

        for(int i=1;i<=n;i++){//outer loop
            for(int j=1;j<=i;j++){//col / each line
                if((i+j) % 2==0)
                {
                 System.out.print(" 1 ");
                }
                 else
                 {System.out.print(" 0 ");}
                 
            }
            System.out.println();
        }
    }

    public static void ButterflyPattern(int n){
        //1st half
        for(int i=1;i<=n;i++){
            //stars = i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces 2x(n-i)
             for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars= i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
              System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces 2x(n-i)
             for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars= i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    
    public static void SolidRhombus(int n){
        for(int i=1;i<=n;i++){
            //space n-i
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");                
            }
            //star * n
            for(int j=1;j<=n;j++){
                    System.out.print(" * ");
                }
            //space n-i
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");                
            }
              System.out.println();
        }
    }
      public static void HollowRhombus(int n){
        // int cnt =1;
        for(int i=1;i<=n;i++){
            //space n-i
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");  
                            
            }
            // star * n
           for(int j=1;j<=n;j++){
            if(i==1||i==n||j==1||j==n){
                  System.out.print("*"); 
            }
            else{
                  System.out.print(" "); 
            }
           }
            // space n-i
            for(int k=1;k<=n-i;k++){
               
                System.out.print(" ");                
            }
              System.out.println();
        }
    }
    
    public static void Diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
        
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
           
            System.out.println();
        }
    }

    public static void number_Pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i - 1);j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void palindromic_pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+ " ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        // hollow_rectangle(4,4);
        // inverted_half_pyramid_with_Num(7);
        // floyds_triangle(7);
        // _01triangle(7);
        // ButterflyPattern(7);
        // SolidRhombus(7);   
        // HollowRhombus(7);  
        // Diamond(4);  
        // number_Pyramid(7); 
        palindromic_pattern(4); 
    }
}