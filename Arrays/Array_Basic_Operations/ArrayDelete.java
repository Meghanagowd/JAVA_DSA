import java.util.*;


public class ArrayDelete {

    public static void printArray(int [] arr , int size ){
        for(int i = 0 ; i<size ; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    public static int deleteAtBegining(int [] arr , int size){
        if(arr.length == 0){
            System.out.println("array is empty ");
            return size ;
        }
        for(int i = 1 ; i<size ; i++){
            arr[i-1] = arr[i];
        }

        return size-1;
    }

    public static int deleteAtEnd(int [] arr, int size){
         if(arr.length == 0){
            System.out.println("array is empty ");
            return size ;
        }

        return size-1;


    }

    public static int deleteAtIndex(int [] arr ,int size , int index){

        if(arr.length == 0 ){
             System.out.println("array is empty ");
            return size ;
        

        }
        if(index<0 || index >size)
            System.out.println("invalid index ");

        for(int i = index+1 ; i<size ; i++){
            arr[i] = arr[i+1];
        }

        return size-1;


    }



public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    int size= sc.nextInt();
    for(int i = 0 ; i<size ; i++){
        arr[i] = sc.nextInt();
    }

    
     

    printArray(arr , size);

    size = deleteAtBegining(arr , size );
    printArray(arr , size);
    size = deleteAtEnd(arr , size );
    printArray(arr, size);
    size = deleteAtIndex(arr , size  , 2);
    printArray(arr, size);







}
    
}
