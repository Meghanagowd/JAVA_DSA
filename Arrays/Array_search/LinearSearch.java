
public class LinearSearch {

    public static int linearSearch(int [] arr , int target){

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]==target){
                System.out.println(" target found at index : "+i);
                return 1;
            }
        }

        return -1 ;


    }






    public static void main(String [] args){

        int [] arr = { 34, 54, 67 ,1 , 89 };

        int target = 1 ;
        int result = linearSearch(arr , target);
        if(result == -1){
            System.out.println("element not found ");
            
        }




    }

    
}


