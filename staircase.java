public class staircase {
   /*  public static boolean stair(int[][]a,int k){
        int row=0;
        int col=a[0].length-1;
        while(row<a.length && col>=0){
            if(a[row][col]==k){
                System.out.println("Found at ( "+row+" , "+col+" ) ");
                return true;
            }
            else if(k<a[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Does not found! ");
        return false;
    }*/
    public static boolean stair(int[][]a,int k){
        int row=a.length-1;
        int col=0;
        while(row>=0 && col<a[0].length){
            if(a[row][col]==k){
                System.out.println("Found at ( "+row+" , "+col+" ) ");
                return true;
            }
            else if(k<a[row][col]){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("Does not found! ");
        return false;
    }

    public static void main(String[] args) {

        int[][] a = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
                int key=33;
                stair(a, key);
    }
}
