//use the following sorting algorithms to sort an array in DESCENDING order:
/* a. Bubble Sort
   b. Selection Sort
   c. insertion sort
   d. Counting sort         
   you can use this array as an example : [3,6,2,1,8,7,4,5,3,1]  */ 

   public class Ques1{
      public static void bubbleSort(int arr[]){
         for(int turn = 0; turn<arr.length-1; turn++){
            for(int j = 0; j<arr.length-1-turn; j++){
               if(arr[j]< arr[j+1]){


                  //swap 
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;

               }
            }
            }
         }
         public static void printArr(int arr[]){
            for(int i = 0; i<arr.length;i++){
               System.out.print(arr[i] + "");
            }
            System.out.println();
         }
         public static void main(String args[]){
            int arr[] = {3,6,2,1,8,7,4,5,3,1};
            bubbleSort(arr);
            printArr(arr);
         }
      }
   

