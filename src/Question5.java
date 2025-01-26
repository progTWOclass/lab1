public class Question5 {
    public static void reverseArr(int[] arr){

        for(int i = 0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }

    public static void printArr(int[] arr){
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        System.out.print("your original array is \n");
        printArr(arr);

        reverseArr(arr);
        System.out.println("\nyour reverse array is ");
        printArr(arr);
    }
}
