

public class BinarySearch {
    public static int binarySearch(int [] arr , int target){

        int low = 0 ;
        int high = arr.length - 1 ;
        int mid = (low + high )/ 2;

        while(low<=high){
            if(arr[mid] == target)
                 return mid ;
            else if(arr[mid]<target){
                low = mid + 1;
            }
            else 
                high = mid - 1 ;     
               
        }

        return -1;



    }

    public static void main(String [] args){
        int [] arr ={  1, 2, 3, 4, 5, 6, 7 };
        int target = 4;
        int result  = binarySearch(arr , 4);

        if(result == -1 ){
            System.out.println("element not found");
        }
        else {
            System.out.println("element found at index : "+result);
        }
    }


}
