public class Q3 {
    public static void printarr(int[][]a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][]a={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int row=2;
        int col=3;
        int [][]transpose=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=a[i][j];
            }
        }
        printarr(transpose);
    }
}
