import java.util.ArrayList;
import java.util.Collections;


public class proj_3 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(); 
        fillArrayList(nums, 10);
        System.out.print("Исходный список: ");
        printArr(nums);
        System.out.println("");

        int minValue = Collections.min(nums); 
        System.out.println("Минимально значение списка: " + minValue);

        int maxValue = Collections.max(nums); 
        System.out.println("Максимально значение списка: " + maxValue);

        int sumList = nums.stream().mapToInt(Integer::intValue).sum(); 
        int average = sumList / 10; 
        System.out.println("Среднее арифметическое значение списка: " + average);

    }

    public static void fillArrayList(ArrayList<Integer> nums, int size) { 
        for (int i = 0; i < size; i++) {
            nums.add((int) (Math.random() * 100));
        }
    }

    public static void printArr(ArrayList<Integer> nums) { 
        for (int item : nums) {
            System.out.printf("%d ", item);
        }
    }
}
