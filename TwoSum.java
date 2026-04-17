 
import java.util.*;

public class TwoSum {

    // 👉 Write your logic inside this function
    public static int[] twoSum(int[] nums, int target) {
        
        // YOUR LOGIC HERE


    HashMap<Integer,Integer> map = new HashMap();
    for(int i = 0 ; i< nums.length ; i++){
        int diff = target - nums[i];
        if(map.containsKey(diff)){
            return new int[] {map.get(diff) , i};
        }

        map.put(nums[i],i);
    }    
        
        return new int[]{-1, -1}; // default return
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 👉 Input
        int n = sc.nextInt();
        int[] nums = new int[n];
        

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        // 👉 Function Call
        int[] result = twoSum(nums, target);

        // 👉 Output
        System.out.println(result[0] + " " + result[1]);

        sc.close();
    }
}