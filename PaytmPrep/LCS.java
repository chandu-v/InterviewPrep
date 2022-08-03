package PaytmPrep;

public class LCS {

    public static void main(String[] args) {
        String X = "GeeksforGeeks";
        String Y = "GeeksQuiz";
        int [][] arr = makeArray(X,Y);
        printArray(arr);
        System.out.println(backTrace(arr,X,Y));
        System.out.println("Length of LCS is: "+arr[X.length()][Y.length()]);
    }

    private static String backTrace(int[][] arr, String X, String Y) {
        int m = X.length();
        int n = Y.length();
        int l = arr[m][n];
        int i = m ;
        int j = n ;
        String str = "";
        if(l==0) return str;
        while(l != 0) {
            if(arr[i][j] > arr[i-1][j] || arr[i][j] > arr[i][j-1]) {
                str = X.charAt(i-1)+(str);
                System.out.println(str);
                i--;
                j--;
                l--;
            } else {
                i--;
            }
        }
        return str;
    }

    private static int[][] makeArray(String X, String Y){
        int m = X.length();
        int n = Y.length();
        int [][] arr = new int[m+1][n+1];
        for(int i = 0 ; i <= m ; i++) {
            for(int j = 0 ; j <= n ; j++) {
                if(i == 0 || j == 0) continue;
                if(X.charAt(i-1) == Y.charAt(j-1)) arr[i][j] = arr[i-1][j-1]+1;
                else arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
            }
        }
        return arr;
    }

    private static void printArray(int [][] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr[i].length ; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

}