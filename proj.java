



public class proj {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 9, 8, 7, 5, 4, 3, 5, 6, 1, 45, 6, 88, 9, 1, 23 };
        printArr(nums);
        int[] result = merge_sort(nums); 
        
        printArr(result);
    }

    public static void printArr(int[] arr) {
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }


    public static int[] mergeArray(int[] bufOneArray, int[] arrayB) {
        int n1 = bufOneArray.length, n2 = arrayB.length;
        int n = n1 + n2, i1 = 0, i2 = 0;
        int[] resArray = new int[n];

        for (int i = 0; i < n; i++) {
            if (i1 == n1) {
                resArray[i] = arrayB[i2++];
            } else if (i2 == n2) {
                resArray[i] = bufOneArray[i1++];
            } else {
                if (bufOneArray[i1] < arrayB[i2]) {
                    resArray[i] = bufOneArray[i1++];
                } else {
                    resArray[i] = arrayB[i2++];
                }
            }
        }
        return resArray;
    }

    public static int[] merge_sort(int[] array) {
        if (array.length < 2) return array;

        int[] bufOneArray = new int[array.length / 2];
        System.arraycopy(array, 0, bufOneArray, 0, array.length / 2);

        int[] bufTwoArray = new int[array.length - bufOneArray.length];
        System.arraycopy(array, array.length / 2, bufTwoArray, 0, array.length - bufOneArray.length);

        bufOneArray = merge_sort(bufOneArray);
        bufTwoArray = merge_sort(bufTwoArray);

        return mergeArray(bufOneArray, bufTwoArray);
    }


}