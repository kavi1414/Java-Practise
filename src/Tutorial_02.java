public class Tutorial_02 {

    public static void main (String[] args){
        int[] arr = {10,0,0,20,30,40};
        int[] newArr = new int [arr.length] ;
        rearrange(arr,newArr);
        print(newArr); //Name is enough not need like (newArr[])
    }

    private static void rearrange(int arr[], int newArr[]){
        int j=0;
      for(int i = 0; i < arr.length; i++){
          if(arr[i] == 0){  //not = equal is written like ==
              newArr[j]=arr[i];
              j++;
          }
      }

      for(int i = 0; i <arr.length; i++){
          if(arr[i] != 0) {
              newArr[j] = arr[i];
              j++;
          }
      }
    }

    private static void print(int[] newArr){

        for( int element : newArr){
            System.out.print(element + " ");
        }
    }


    //Declaring a variable or parameter type		int[] arr;
    //Using the whole array	                    	print(arr);
    //Using a single element inside the array		int x = arr[0];

    //In one line: Use public for the main entry point, and private for all its helper methods. Your code does this perfectly.
}
