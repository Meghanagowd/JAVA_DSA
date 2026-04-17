import java.util.*;

class ContainsDuplicateII {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // YOUR LOGIC HERE

        HashMap<Integer,Integer> map = new HashMap();
        for(int i = 0 ; i<nums.length ; i++){
            int var = nums[i];
            if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k)
                return true ;
            map.put(nums[i],i);
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        boolean result = containsNearbyDuplicate(nums, k);

        System.out.println(result);

        sc.close();
    }
}