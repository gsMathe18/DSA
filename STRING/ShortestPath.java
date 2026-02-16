public class ShortestPath {
    public static float shortestP(String str){
        int x=0, y=0;
        for(int i=0; i<str.length(); i++){
            // char dir = str.charAt(i);
            if(str.charAt(i) == 'W'){
                x--;
            }
            else if(str.charAt(i) == 'N'){
                y++;
            }
            else if(str.charAt(i) == 'S'){
                y--;
            }
            else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";

        System.out.print(shortestP(str));
    }
}
