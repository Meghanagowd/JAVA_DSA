import java.util.*;

class ContainsDuplicate{

    // 👉 Return true if duplicate exists
    public static boolean containsDuplicate(int[] nums) {
        

        HashSet<Integer> set = new HashSet();
        for(int i = 0 ; i<nums.length ; i++){
           if(set.contains(nums[i]))
            return true;
           set.add(nums[i]) ;
        }
        // YOUR LOGIC HERE
        
        return false; // default
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 👉 Input
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // 👉 Function Call
        boolean result = containsDuplicate(nums);

        // 👉 Output
        System.out.println(result);

        sc.close();
    }
}