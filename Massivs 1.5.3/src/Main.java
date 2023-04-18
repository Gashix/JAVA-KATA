public class Main {
    public static void main(String[] args) {
        printArray(new int[]{0, 79, 19, 9, 64, 96, 72, 39, 74});
      //  printArray2(new int[]{3,42,42,24,4,2,42,42});
    }

    public static void printArray2(int[] numbers) {
        for (int i : numbers) {
            System.out.println(i);
        }
    }

    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int n = 0; n < numbers.length; n++) {
            System.out.print(numbers[n]);
            if (n != numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}