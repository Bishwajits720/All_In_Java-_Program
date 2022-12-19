package TCSpractice;



public class elementininfinite {
    public static void main(String[] args) {
       int arr[] ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50, 51, 52, 53, 54, 55, 56, 57, 58, 59,
               60, 61, 62, 63, 64, 65, 66, 67, 68, 69,
               70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
               80, 81, 82, 83, 84, 85, 86, 87, 88, 89,
               90, 91, 92, 93, 94, 95, 96, 97, 98, 99,
               100};
        System.out.println(infintesearch1(arr,38));


    }

    static int infintesearch1(int arr[],int target){
        int start = 0;
        int end = 1;
        while(target >arr[end]){
            int temp = end + 1;
            end = end +(end -start +1)*2;
            start =temp;
        }

  return infintesearch(arr,target,start,end);

    }
    static int infintesearch(int arr[],int target,int start, int end){

        while (start<=end){
            int mid = start +(end - start)/2;
            if (arr[mid] >target){

                end = mid-1;
            } else if(arr[mid] < target){
                start = mid +1;
            }else {
                return mid;
            }
        }
       return -1;


    }
}
