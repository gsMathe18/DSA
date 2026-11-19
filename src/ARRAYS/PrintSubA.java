public class PrintSubA {

    public static void printSub(int nums[]){
        int ts = 0;
        int sum = 0 ;
        int maxsm = Integer.MIN_VALUE;
        int minsm = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(nums[k]);
                    sum += nums[k];
                }
                ts++;
                maxsm = Math.max(maxsm, sum);
                minsm = Math.min(minsm, sum);

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub" +" "+ ts);
        System.out.println("total sub" +" "+ maxsm);
        System.out.println("total sub" +" "+ minsm);
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};

        printSub(nums);
    }
}
