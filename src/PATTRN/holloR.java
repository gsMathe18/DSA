public class holloR {

    public static void hollow_R(int tRows, int tCol){
        for(int i=1; i<=tRows; i++){
            for(int j=1; j<=tCol; j++){
                if(i==1 || i==tRows || j==1 || j==tCol){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        hollow_R(4, 5);
    }
    
}
