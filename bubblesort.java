
import java.util.Arrays;

public class bubblesort {
  public static int[] bubblesor(int arr[]){
    for (int i=0; i < arr.length; i++) {
        for (int j=1;j<arr.length -i;j++){
          if(arr[j]>arr[j-1]){//Here the viceversa it decending
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
          }
        }
    }
    return arr;
  }
  public static void main(String[] args) {
      int[] arr ={9,8,7,6,5,4,3,2,1};
      System.out.println(Arrays.toString(bubblesor(arr)));
  }
}

