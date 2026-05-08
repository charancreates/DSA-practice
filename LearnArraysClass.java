import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {

        int[] numbers = { 3, 4, 4, 1, 1000, 67 };
        System.out.println(numbers);

        LearnArraysClass L = new LearnArraysClass();
        L.printA(numbers);

        Arrays.sort(numbers);
        L.printA(numbers);

        Arrays.fill(numbers, 12);
        L.printA(numbers);

        int index = Arrays.binarySearch(numbers, 1000);
        System.out.println(index);

    }

    public void printA(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
