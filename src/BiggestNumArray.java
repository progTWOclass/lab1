import java.util.Scanner;
public class BiggestNumArray {

    public static int getLargest(int[] arr){

        int largestNum = arr[0];
        for (int i = 0; i<arr.length; i++){
            if(arr[i] > largestNum)
                largestNum = arr[i];
        }
        return largestNum;
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a size for your array: ");
        int arrSize = input.nextInt();

        int[] arr = new int[arrSize];

        System.out.println("Please enter " + arrSize + " number for your array: ");
        for (int i = 0; i<arrSize; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("The largest number in your array is " + getLargest(arr));
    }
}
