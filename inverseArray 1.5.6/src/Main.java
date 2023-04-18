public class Main {
    public static void main(String[] args) {
        int[] result = {2, 3, 4, 7, 9};
        int [] results = inverseArray(result);

        for (int i = 0; i < results.length; i++){
            System.out.println(results[i]);
        }
    }

    public static int[] inverseArray(int[] numbers) {
        int[] inverse = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            inverse[i] = numbers[numbers.length - 1 - i];
        }
        return inverse;
    }
}