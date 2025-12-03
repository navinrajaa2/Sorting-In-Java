import java.util.Arrays;
public class bubblesort {
  public static int[] bubblesor(int arr[]){
    for (int i=0; i < arr.length; i++) {
      boolean swapped=false;
        for (int j=1;j<arr.length -i;j++){
          if(arr[j]<arr[j-1]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            swapped=true;
          }
        }
        if(!swapped){// this is used to when the array this already sorted this break at the first iteration
          break;
        }
    }

    return arr;
  }
  public static void main(String[] args) {
      int[] arr ={9,8,7,6,5,4,3,2,1};
      System.out.println(Arrays.toString(bubblesor(arr)));
  }
}
