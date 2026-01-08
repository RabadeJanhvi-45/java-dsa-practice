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
    public static void main(String[] args){

    
    int numbers[] = {1,2,5,6,7,8,9,10,12,15};
    int key =20;
    // update(marks);
    int index= linearsearch(numbers,key);
    if(index== -1){
        System.out.println("Key Not FOund");
    }
    else{
        System.out.println("Key is at Index : " +index);
    }
    }
}