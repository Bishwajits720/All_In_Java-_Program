package arrayspractice;
class sol3{
    public int search(int[]arr , int target ){
     if (arr == null || arr.length == 0) return -1;

     int l = 0;
     int r =arr.length -1;

        //{4,5,6,7,0,1,2}

     while(l<r){
         int m = l +(r-l)/2;
         if (arr[m] >arr[r]){
             l =m+1;
         }else{
             r= m;
         }
     }
        int s= l;
        l=0;
        r=arr.length-1;

     if (target >= arr[s] && target <=arr[r]){
         l= s;
     }else {
         r= s;
     }
     //regular binary search
   while (l<=r){
       int m =l+(r-l)/2;
       if (arr[m] == target){
           return m;
       }else if (arr[m] < target){
          l=m+1;
       }else {
           r=m-1;
       }
   }
    return -1;

    }

}

public class searchinrotateed {
    public static void main(String[] args) {
        sol3 s=new sol3();
        int arr[] ={4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(s.search(arr,target));
    }
}
