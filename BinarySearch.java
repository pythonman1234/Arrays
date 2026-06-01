package Arrays;

public class BinarySearch {
    public static int Search(int numbers[],int key){
        int low = 0;
        int high = numbers.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                low= mid + 1;
            }
            else{
                high = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
      int numbers [] =  {2, 5, 8, 12, 23, 45, 67, 89};
      int key = 45;

      int resultIndex = Search(numbers,key);
      if(resultIndex==-1){
          System.out.println("Key not found");
      }
      else{
          System.out.println("Key found"+resultIndex);
      }
    }
}
