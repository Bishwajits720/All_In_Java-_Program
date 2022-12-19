package TCSpractice;

public class celingnumber {
    public static void main(String[] args) {
        int arr [] ={1,4,6,9,12,14,17,19};
        int target = 15;
        System.out.println(bs(arr,target));


    }
    static int bs(int arr[],int target){
         int start =0;
         int end =arr.length -1;
         while(start <=end){
             int mid = start +(end-start)/2;
             if (arr[mid] == target) {
                 return mid;
             } else if(arr[mid] < target){
                  start =mid +1;
                 } else if(arr[mid] >target){
                 end = mid -1;
             }

         }
         return arr[end] ;
    }

}
