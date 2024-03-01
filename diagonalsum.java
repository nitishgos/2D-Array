public class diagonalsum {
    public static int diagonal(int[][] a) {
         // [Time complexity=O(n^2)] Brute force approach
        /*int s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == j) {
                    s += a[i][j];
                } else if (i + j == a.length - 1) {
                    s += a[i][j];
                }
            }
        }
        return s;*/
        //[Time complexity=O(n)]
        int s=0;
        for(int i=0;i<a.length;i++){
            //pd
            s+=a[i][i];
            //sd
            if(i!=a.length-1-i){
                s+=a[i][a.length-1-i];
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(diagonal(a));
    }
}
