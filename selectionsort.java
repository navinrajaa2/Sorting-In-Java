import java.util.Arrays;
public class selectionsort {
  public static void main(String[] args) {
      int[] arr ={9,8,7,6,5,4,3,2,1};
      System.out.println("BEFORE SORTED: "+Arrays.toString(arr));
      selection(arr);
      System.out.println("AFTER SORTED: "+Arrays.toString(arr));
  }
  public static void selection(int arr[]){
    for (int i = 0; i < arr.length; i++) {
      int last = arr.length - i - 1;
      int max=findmax(arr,0,last);    
      swap(arr, max, last);
    }
  }
  public static void swap(int[] arr,int first,int second){
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
  }
  public static int findmax(int arr[],int start,int end){
      int max=start;
      for (int i = start; i <=end; i++) {
          if(arr[max]<arr[i]){
            max=i;
          }
      }
      return max;
    }
}
//THIS IS THE USE FRIENDLY METHOD
/*import java.util.Arrays;

public class SelectionSortEasy {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Before Sort: " + Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("After Sort: " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;  // assume current index is smallest

            // find the actual smallest element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap smallest element with first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
*/ 

