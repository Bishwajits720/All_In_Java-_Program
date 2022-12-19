package partice;

public class maxAndminElement {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9,10};

        int max =arr[0];
        int min =arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }else if(min >arr[i]){
                min= arr[i];

            }
        }
        System.out.println("largest number" +  max +" smallest number:"+ min);
    }
}
