public class BubbleSort {
    static void bubbleSort(int[] arr){
        boolean swapped = false;
        for(int i=0; i<arr.length; i++){
            swapped = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {8,3,4,5,1,2,7,6};
        bubbleSort(arr);
    }
}
