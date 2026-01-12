import java.util.*;

public class ArrayCC{
    //Input and output in array
    public static void IOPArray(){
            Scanner sc = new Scanner(System.in);

        int marks[] =new int[100];

        marks[0]=sc.nextInt();//physics
        marks[1]=sc.nextInt();//math
        marks[2]=sc.nextInt();//bio

        System.out.println("physics"+marks[0]);
        System.out.println("math"+marks[1]);
        System.out.println("bio"+marks[2]);

        marks[2] = marks[2]+1;
    System.out.println("bio"+marks[2]);
    System.out.println(marks.length);
    }
    //updating array
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
        
    }
    //linear Search
    public static int linearsearch(int number[],int key){
        for(int index=0;index<number.length;index++){
            if(number[index]==key){
                return index;
            }
            
        }
        return -1;
    }

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest Value is : "+smallest);
        return largest;
    }

    public static int binarySearch(int numbers[],int key)
    
    {
        int start=0,end = numbers.length-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }
            else{
                end =mid -1;
            }
        }
        return -1;

    }
    public static void rev_arr(int arr[]){
        int start=0;
        int end=arr.length-1;
        //sorted arr
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;

            start++;
            end--;
        }
       
    }

    public static void pairs_arr(int arr[]){
        int totalpairs=0;
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+current+" , " +arr[j]+" )");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println(totalpairs);
    }

    public static void print_subarr(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            int start=arr[i];
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+ "  ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
         System.out.println("Total Subarray = "+ts);
    }
    public static void maxSubayyay(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            int start=arr[i];
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+ "  ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
         System.out.println("Total Subarray = "+ts);
    }
    public static void main(String[] args){
    
    
    int numbers[] = {1,2,5,6,7,8,9,10,12,15};
    int arr[]={1,2,3,4,5};
    // int key =20;
    // update(marks);
    // int index= linearsearch(numbers,key);
    // if(index== -1){
    //     System.out.println("Key Not FOund");
    // }
    // else{
    //     System.out.println("Key is at Index : " +index);
    // }
    // }

    // System.out.println("Largest Value is: "+getLargest(numbers));
    // int key = 10;
    // System.out.println("index for key is found at : "+binarySearch(numbers,key));

    // int v=0x000f;
    // int m=0x2222;
    // System.out.println(A());
    // rev_arr(arr);
    // for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]+ "  ");
    // }


    // pairs_arr(arr);
    print_subarr(arr);
    }
}