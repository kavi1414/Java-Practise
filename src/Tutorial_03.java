public class Tutorial_03 {
    public static void main(String[] args){ //Not add , between String[] and args
        String str1 = "Hello I am Kavishka";
        String Arr [] = str1.split(" ");//split() is wrong split("") is correct()
        for(int i = Arr.length - 1 ; i>=0; i--){
            System.out.print(Arr[i] + " ");
        }
    }
}
