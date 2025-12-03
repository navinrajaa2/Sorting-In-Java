import java.util.Arrays;
public class cyclicsort {
  public static void main(String[] args) {
    int[] arr ={9,8,7,6,5,4,3,2,1};
      System.out.println("BEFORE SORTED: "+Arrays.toString(arr));
      cyclicsor(arr);
      System.out.println("AFTER SORTED: "+Arrays.toString(arr));
  }
  public static void cyclicsor(int[] arr){
    int i=0;
    while(i<arr.length){
      int correct=arr[i]-1;
      if(arr[i]!=arr[correct]){
        swap(arr, i, correct);
      }
      else{
        i++;
      }
    } 
  }
  public static void swap(int[] arr,int first,int second){
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
  }
}
