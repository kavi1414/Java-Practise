public class Tutorial_01 {



    public static void main(String[] args) {
        int arr[] = {-1,20,30,40,50,-8};
        int newArr [] = new int[arr.length];
        rearrange(arr, newArr);
        print(newArr);
    }

    private static void rearrange( int arr [] ,int newArr[]) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
            {
                newArr[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
            {
                newArr[j] = arr[i];
                j++;
            }
        }

    }


    private static void print(int newArr[]){

          for(int element :newArr)
          System.out.print(element + " ");
    }

}
//At this point, all values in newArr are 0 (default for int in Java).
//int arr[] and int[] arr are exactly equal in Java
