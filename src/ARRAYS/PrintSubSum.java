public class PrintSubSum {

    // public static void maxSubSum(int nums[]){

    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;

    //     for(int i=0; i<nums.length; i++){
    //         for(int j=i; j<nums.length; j++){
    //             currSum = 0;

    //             for(int k=i; k<=j; k++){
    //                 // subarrysum
    //                 currSum += nums[k];
    //             }
    //             System.out.println(currSum);
    //             if(maxSum<currSum){
    //                 maxSum = currSum;
    //             }
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Max sum is" +" "+ maxSum);
    // }


    //max2
    // public static void MaxSubSumPre(int nums[]){
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     int prefix[] = new int[nums.length];

    //     prefix[0] = nums[0];
    //     //prefix cal
    //     for(int i=1; i<prefix.length; i++){
    //         prefix[i] = prefix[i-1] + nums[i];
    //     }

    //     for(int i=0; i<nums.length; i++){
    //         int star = i;
    //         for(int j=i; j<nums.length; j++){
    //             int end = j;
    //             currSum = star == 0 ? prefix[end] : prefix[end] - prefix[star-1];

    //             if(maxSum < currSum){
    //                 maxSum = currSum;
    //             }
    //         }
    //     }
    //     System.out.println("max sum = " + maxSum);
    // }


    //kadans
    public static void kadanes(int nums[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<nums.length; i++){
            cs = cs + nums[i];
            if(cs < 0){
                cs = 0;
            }

            ms = Math.max(cs, ms);
        }
        System.out.println("our max subarray sum is : " + ms);

    }

    public static void main(String[] args) {
        int nums[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(nums);
    }
}
