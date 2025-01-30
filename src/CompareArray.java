public class CompareArray {

    //method to check if the array is the same length
    public static boolean checkIfSameLength(char[] arr1, char[] arr2){
        return arr1.length == arr2.length;
    }

    //method to compare both array and see if they are the same
    public static boolean compareBothArr(char[] arr1, char[] arr2){

        //start by saying they are the same
        boolean sameArr = true;

        //outer loop tracks the element currently being processed
        //it doesn't have to be arr1 for i, it could be arr2 too
        for(int i = 0; i < arr1.length; i++) {
            int frequencyElementArr1 = 0;
            // the inner loop Iterates through the arrays (array1 or array2)
            // to calculate how many times the element appears.
            //count frequency of arr1[i] in arr1
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] == arr1[j])
                    frequencyElementArr1++;
            }

            int frequencyElementArr2 = 0;
            //count frequency of arr1[i] in arr2
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j])
                    frequencyElementArr2++;
            }
            //if frequency is not equal, they are not the same
            if(frequencyElementArr1 != frequencyElementArr2) {
                sameArr = false;
                break;
            }
        }
        return sameArr;
    }
    public static void main(String[] args) {

        char[] arr1 = {'a', 'b', 'c', 'd'};
        char[] arr2 = {'b', 'c', 'a', 'c'};

        if(!checkIfSameLength(arr1,arr2)) {
            System.out.println("the array is not the same");
        }else if (compareBothArr(arr1,arr2)){
            System.out.println("the array is the same");
        }else{
            System.out.println("the array is not the same");
        }
    }
}
