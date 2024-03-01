public class Q2 {
    public static void main(String[] args) {
        int s=0;
        int[][]a={{1,4,9},{11,4,3},{2,2,3}};
        for(int j=0;j<a[0].length;j++){
            s+=a[1][j];
        }
        System.out.println(s);
    }
}
