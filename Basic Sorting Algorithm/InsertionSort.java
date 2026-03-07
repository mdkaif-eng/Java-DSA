public class InsertionSort {
     public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length;i++){
        int current = arr[i];
        int previous = i-1;
        
        //finding out the correct postion to insert
        while(previous>=0 && arr[previous] > current){
            arr[previous+1] = arr[previous];
            previous--;
        }
        //insertion
        arr[previous+1] = current;
        }
     }
     public static void main(String[]args){
        int arr[] = {5,4,1,3,2,6};
        insertionSort(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ "");
        }
     } 
}

//output is in increasing order but if you want output is in decreasing order then change the of <
