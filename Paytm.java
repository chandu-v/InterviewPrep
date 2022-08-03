public class Paytm {
    
    public static void main(String[] args) {
        
        int [] arr = int[]{10,1,2,7,6,1,5};

        /**
         * o/p - 
                [
                [1,1,6],
                [1,2,5],
                [1,7],
                [2,6]
                ]
         */

        int target = 8;
        int n = arr.length;
        int sum = 0;
        // for(int i = 0 ; i < n ; i++ )  {
        //     for(int j = i+1 ; j < n ; j++) {
        //         if(arr[j] > target) {
        //             continue;
        //         }
        //     }
        // }{10,1,2,7,6,1,5};target = 8;

        /**
         * 
         */
        boolean [] visited = new boolean[n];
        sumOfSubArray(arr,n,0,0,target,new ArrayList<>());
    }


    static void sumOfSubArray(int [] arr, int n , int index, int sum , int target, List<Integer> indexes) {
        if(index >= n && sum != target) return;
        else if(sum == target) print(arr, indexes);
        else if(arr[index] > target) sumOfSubArray(arr, n, index+1, sum, target, indexes);
        else if(sum + arr[index] == target) {
            sumOfSubArray(arr, n, index+1, sum, target, indexes);
            print(arr, indexes);
            return;
        }
        else if(sum + arr[index] > target) sumOfSubArray(arr, n, index+1, sum, target);
        else { 
            sumOfSubArray(arr, n, index+1, sum, target, indexes);
            indexes.add(index);
            sumOfSubArray(arr, n, index+1, sum+arr[index], target, indexes);
        }
    }

    static void print(int [] arr, List<Integer> indexes) {
        for(int i : indexes) System.out.print(arr[i]+",");
            System.out.println();
    }
}
