 
import java.util.*;


public class Basic_Arrays {



    public static void  TraverseArray(int[] array){
        for(int  i : array){
        System.out.println(i);
    }
    }

    public static  void  accessindex(int [] array , int index) {
        if(array.length  == 0){
            System.out.println("array is empty ");
            
        }
         if(index>=0 && index < array.length ){
            System.out.println("value is "+array[index]);
         }
         else {
            System.out.println("invalid index ");
         }
    }

    public static void  updateelement(int [] array , int index , int value){
        if(array.length == 0){
            System.out.println("empty ");
            
        }

        if(index>=0 && index < array.length){
            array[index] = value ;
            System.out.println("successfully updated");
        }
        else{
            System.out.println("invalid index");
        }

    }

    public static void findlength(int [] array){
        System.out.println("lenth is "+array.length);
    }


public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] array = new int[n];
    for(int i = 0 ; i< n ; i++){
        array[i] = sc.nextInt();
    }

     TraverseArray(array);
     System.out.println("enter index ");
     int index = sc.nextInt();
     accessindex(array , index);
     System.out.println("enter value ");
     int val = sc.nextInt();
     updateelement(array,index,val);
     findlength(array);

    


}
    
}
