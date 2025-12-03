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
