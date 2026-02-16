public class Larges {

    public static int LargesA(int num[]){
        // int larg = Integer.MIN_VALUE;
        int Small = Integer.MAX_VALUE;


        // for(int i=0; i<num.length; i++){
        //     if(larg < num[i]){
        //         larg = num[i];
        //     }
        // }

        // return larg;

        //small
        for(int i=0; i<num.length; i++){
            if(Small > num[i]){
                Small = num[i];
            }
        }

        return Small;

    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12};

        // int largest = LargesA(num);
        // System.out.print(largest);
        System.out.print(LargesA(num));
    }
}
