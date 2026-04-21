import java.util.*;


public class ArrayInsert {


    public static void printArray(int[] array , int size){
        for(int i = 0 ; i< size ; i++){
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public static int insertAtEnd(int [] arr , int size , int val ){
        if(arr.length == size){
            System.out.println("array is full ");
            return -1 ;
        }
        arr[size] = val ;
        return size+1;
    }

    public static int insertAtBegining(int [] arr , int size , int val){
        if(arr.length == size){
            System.out.println("array is full ");
            return -1 ;
        }

      for(int i = size -1 ; i>=0 ; i--){
        arr[i+1] = arr [i] ;
      }
      arr[0] = val ;
      return size + 1;


    }

    public static int insertAtIndex(int [] arr , int index , int size , int val){
        if(arr.length == size){
            System.out.println("array is full ");
            return size ;
        }
        if((index <0  && index > size)){
            System.out.println("invalid index ");
        }
        for(int i = size-1 ; i>=index ; i--){
            arr[i+1] =arr[i];
        }
        arr[index] = val ;
        return size + 1 ;

    }






    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []  arr = new int[10];
         
        
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();

        }
        int size = n; 

         size = insertAtBegining(arr ,  size , 12);
         printArray(arr,size);
        size = insertAtEnd(arr, size , 12 );
         printArray(arr,size);
        size = insertAtIndex(arr, 2 , size ,12 );
         printArray(arr,size);


    }
    
}
