import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void swapFirstandLast(int[] nums) {
        if (nums.length < 1) {
            return;
        }
        int temp = nums[nums.length-1]; // nums.length-1 возращаем последний элемент массива
        // переменную temp инициализировали последним эдементом массива
        nums[nums.length-1] = nums[0]; // nums[0] первый элемент массив по индексу
        nums[0] = temp; //присвоили первому элементу массива последний элемент
        System.out.println(Arrays.toString(nums)); // используем Arrays.toString() чтобы вывод был корректным
        // потому что без этого, компилятор старается массив превратить в String

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i=0; i < size;i++) {
            nums[i] = scanner.nextInt();
        }
        swapFirstandLast(nums);
    }
}