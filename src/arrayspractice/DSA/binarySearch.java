package arrayspractice.DSA;

public class binarySearch {
    public static void main(String[] args) throws Exception {

        int arr[] ={2,3,5,6,8,9,11};
        int target = 8;

        int ans = Bserach(arr,target);
        System.out.println(ans);

        // two  loop  is  bubble sort
    }
    static int Bserach(int [] arr , int target){
        int s = 0;
        int e = arr.length - 1;

        while (s <=e){

            int mid = s+(e -s)/2;

            if (target > arr[mid]){
                s = mid+1;
            }else if(target <arr[mid]){
                e = mid -1;
            }else {
                return mid;
            }

        }
        return -1;
    }
}
