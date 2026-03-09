public class Ques3 {
    public static void insertionSort(int arr[]){
        for(int i = 0; i<arr.length;i++){
            int current = arr[i];
           int previous = i-1;
           
           //founding out the correct postion to insort
           while(previous>=0 && arr[previous]<current){
            arr[previous+1] = arr[previous];
            previous--;
           }
           //insertion
           arr[previous+1] = current;
        }
    }
    public static void main(String[] args) {
        int arr [] ={3,6,2,1,8,7,4,5,3,1};
        insertionSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+"");
        }
    }
    
}
