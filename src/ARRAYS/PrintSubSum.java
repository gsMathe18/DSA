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
    //     int prefixSum[] = new int[nums.length];

    //     prefixSum[0] = nums[0];
    //     for(int i=1; i<nums.length; i++){
    //         prefixSum[i] = prefixSum[i-1] + nums[i];
    //     }

    //     for(int i=0; i<nums.length; i++){
    //         for(int j=i; j<nums.length; j++){
    //             currSum = 0;

    //             currSum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i-1];
    //             System.out.println("currSum" + currSum);
    //             maxSum = Math.max(maxSum, currSum);
    //         }
    //     }

    //     System.out.println("maxSum" + maxSum);
    // }


    // //kadans
    public static void kadanes(int nums[]){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            currSum = currSum + nums[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println("max sum is :" + maxSum);
    }



    public static void main(String[] args) {
        int nums[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(nums);
        // MaxSubSumPre(nums);
    }
}
