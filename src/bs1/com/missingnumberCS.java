package bs1.com;

 class missingnumberCS {
    public static void main(String[] args){
        int arr[] = {4,0,1,3};
        System.out.println(missingnumber(arr));
    }
    static int missingnumber(int []arr){
        int i =0 ;
        while (i < arr.length){
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]){
                swap(arr,i,arr[i]);

            }else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j){
                return  j;
            }
            
        }
        return arr.length;
        
    }

      static void swap(int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
     }
 }
