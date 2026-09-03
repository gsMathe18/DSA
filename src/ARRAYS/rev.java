class rev {
    public static void rev(int[] arr){
        int st = 0;
        int ed = arr.length-1;

        while(st < ed){
            int temp = arr[ed];
            arr[ed] = arr[st];
            arr[st] = temp;

            st++;
            ed--;
        }
    }

    public static void pairs(int[] arr){

        int tp = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + arr[i] +","+ arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs:   " + tp);
    }

    public static void sub(int[] arr){
        int curr = 0;
        int maxSum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                curr = 0;
                for(int k=i; k<=j; k++){
                    curr = curr +  arr[k];
                }
                System.out.println(curr);

                if(maxSum < curr){
                    maxSum = curr;
                }
                // System.out.println();
            }
            // System.out.println(); 
        }
        System.out.println("max sum: " + maxSum);
    }

    public static void prefix(int[] arr){
        int curr = 0;
        int maxSum = 0;

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }


        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){

                curr = i == 0  ? prefix[j] : prefix[j] - prefix[i-1];

                if(maxSum < curr){
                    maxSum = curr;
                }
                // System.out.println();
            }
            // System.out.println(); 
        }
        System.out.println("max sum: " + maxSum);
    }

    public static void kadanes(int[] arr){
        // int ms = Integer.MIN_VALUE;
        // int cs = 0;

        int ms = arr[0];
        int cs = arr[0];


        for(int i=1; i<arr.length; i++){
            // cs = cs + arr[i];

            // if(cs < 0){
            //     cs = 0;
            // }
            cs = Math.max(arr[i], cs + arr[i]);     
            ms = Math.max(cs, ms);
        }
        System.out.println("max sum: " + ms);
    }

    public static int rain(int[] height){
        int n = height.length;

        //left
        int[] leftmax = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        //right
        int[] rightmax = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trapwater = 0;
        for(int i=0; i<n; i++){
            int waterlavel = Math.min(leftmax[i], rightmax[i]);
            trapwater += waterlavel - height[i];
        }

        return trapwater;
    }

    public static int buyandsell(int[] prices){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String args[]){
        int[] prices = {7, 1, 5, 3, 6, 4};

        // rev(arr);
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // pairs(arr);
        // prefix(arr);
        // kadanes(arr);
        System.out.println(buyandsell(prices));
    }
}