import java.util.ArrayList;
import java.util.Iterator;

public class proj_2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(); 

        fillArrayList(nums, 10);

        System.out.print("Исходный список: ");
        printArr(nums);
        System.out.println(""); 

        deliteItem(nums); 
        System.out.print("Cписок с удаленными чётными значениями: ");
        printArr(nums);

    }

    public static void deliteItem(ArrayList<Integer> nums) { 
        for (Iterator<Integer> iterator = nums.iterator(); iterator.hasNext();) { 
            Integer item = iterator.next();
            if (item % 2 == 0) {
                System.out.println("Delite: " + item);
                iterator.remove();
            }
        }
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
