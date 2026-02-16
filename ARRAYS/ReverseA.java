public class ReverseA {

    public static void Reverse(int nums[]){
        int st = 0, end = nums.length-1;

        while(st<end){
            int temp = nums[end];
            nums[end] = nums[st];
            nums[st] = temp;

            st++;
            end--;
        }

    }

    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};

        Reverse(nums);
        for(int i=0; i<=nums.length-1; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
