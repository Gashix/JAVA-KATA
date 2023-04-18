import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int number[] = {1, 3, 5, 7, 11, 122};
        int[] vivod = getSubArrayBetween(number, 4, 8);
        for (int i = 0; i < number.length; i++) {
            System.out.println(vivod[i]);
        }
    }
    /*Этот метод принимает массив целых чисел и два целых числа,
    начинающихся и заканчивающихся в качестве входных данных.
    Затем метод использует два цикла for, чтобы найти индексы
    первого числа в массиве, которое больше или равно началу,
    и последнего числа в массиве,
    которое меньше или равно концу.
    Если какой-либо из этих индексов не найден,
    метод возвращает пустой массив. Если найдены оба индекса,
    метод вычисляет длину нужного подмассива и создает новый массив с этой длиной.
    Наконец, метод копирует числа из исходного массива в новый массив и возвращает его в качестве результата.*/
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start) {
                startIndex = i;
                break;
            }
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] <= end) {
                endIndex = i + 1;
                break;
            }
        }

        if (startIndex == -1 || endIndex == -1) {
            return new int[]{};
        }

        int length = endIndex - startIndex;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = numbers[startIndex + i];
        }

        return result;
    }
}