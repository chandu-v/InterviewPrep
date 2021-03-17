public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = new int [] {5,3,2,6,11,4};
        int key = 6;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == key) {
                System.out.println(String.format("%S found at index %S", key,i));
                break;
            }
        }
    }
}