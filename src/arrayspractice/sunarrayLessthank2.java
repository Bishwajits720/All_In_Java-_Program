package arrayspractice;

public class sunarrayLessthank2 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,3,2,4,2};
        int k =3;
        int ans = max1(arr,k);
        System.out.println(ans);



    }
    static int maxsum(int arr[] , int k ){

        int wsum= 0;
        int max =0;

        for (int i = 0; i <k ; i++) {
             wsum +=arr[i];
        }
        for (int end = k; end <arr.length ; end++) {
            wsum += arr[end] - arr[end -k];
            max =Math.max(max,wsum);
        }

        return max;
    }

    static int max1(int arr[], int k){
         int wsum= 0;
         int max =0;

        for (int i = 0; i < k; i++) {
             wsum =wsum +arr[i];
        }
        // i =3   3<8
        // 6 =6 + 4 -1   (i =3  and  k=3  ) => i -k = 0
        //9 =9 + (i=4) +5  -(i =4 amd k =3) => i-k = 1 the i++ update the value of k
        //15 =15 + (i=5) +6 - (i =5 ans k =3) => i -k =2     k value will remain const
          for (int i = k; i< arr.length ; i++) {
            wsum =wsum +arr[i] -arr[i-k];
            max =Math.max(max,wsum);
        }
        return max;
    }

}
