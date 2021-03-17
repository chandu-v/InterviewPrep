public class BinarySearch {
    
    public static void main(String[] args) {
        // Binary search works only on sorted array.
        int [] arr = new int[] {44,56,76,99,202};
        BinarySearch obj = new BinarySearch();
        obj.binarySearch(arr, 44, 0, arr.length-1);
    }

    public void binarySearch(int [] arr, int key, int start, int end) {
        if(start < end) {
            int mid = (start+end)/2;
            if(key == arr[mid]) {
                System.out.println(String.format("%S found at index %S", key, mid));
            }else if(key < arr[mid]) {
                binarySearch(arr, key, start, mid);
            }else {
                binarySearch(arr, key, mid+1, end);
            }

        }else if(start == end) {
            if(key == arr[start]) {
                System.out.println(String.format("%S found at index %S", key, start));
            }
        }
    }
}
