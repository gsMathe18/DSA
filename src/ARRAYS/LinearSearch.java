public class LinearSearch {

    public static int LineS(int num[], int key){

        for(int i=0; i<num.length; i++){
            if(num[i]==key){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 20;

        int index = LineS(num, key);
        if(index==-1){
            System.err.println("NOT FOUND");
        }else{
            System.err.println(" Key is at index"+" "+ index);
        }
    }
}
