package SIDinSortedArray;

public class InsertionAkshay {
	public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,8,9,11};
        int[] result = insert(arr, 0);
        for(int i:result)System.out.print(i+" ");
    }
    public static int Binary_search(int[] arr,int target){
        int size = arr.length;
        int low = 0;
        int high = size-1;
        while(low<high){
            int middle = (low+high)/2;
            if(arr[middle]==target) return middle;
            if(arr[middle]<target){
                low=middle+1;
            }else{
                high=middle;
            }
        }
        return low;
    }
    public static int[] insert(int[] arr,int number){
        int position = Binary_search(arr,number);
        int[] new_array = resize_array(arr, 1);
        new_array[position]= number;
        for(int i=position;i<arr.length;i++){
            new_array[i+1]=arr[i];
        }
        return new_array;
    }
    public static int[] resize_array(int[] arr,int count){
        int[] resize_array = new int[arr.length+count];
        for(int i=0;i<arr.length;i++){
            resize_array[i]=arr[i];
        }
        return resize_array;
    }
}
