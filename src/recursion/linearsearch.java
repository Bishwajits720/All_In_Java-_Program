package recursion;

public class linearsearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int target =7;
        System.out.println(linear(arr,target,0));
        System.out.println(index(arr,target,0));
    }
    static boolean linear(int [] arr,int target ,int index){

        if (index == arr.length){
            return false;
        }
        return arr[index] == target || linear(arr,target,index+1);

    }

    static int index(int []arr,int target,int index){
        if (index ==-1){
            return -1;
        }
        if (arr[index] ==target){
            return index;
        }else {
            return index(arr,target,index+1);
        }
    }
}
