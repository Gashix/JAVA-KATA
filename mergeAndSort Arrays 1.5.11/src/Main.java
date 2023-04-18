import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = {2,3,5,8};
        int[] secondArray = {77,33,11,0,6};
        int[] res = mergeAndSort(firstArray, secondArray);
        for (int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] neres = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            neres[i] = firstArray[i];
        }
        for (int i = firstArray.length; i < neres.length; i++) {
            neres[i] = secondArray[i - firstArray.length];
        }
        Arrays.sort(neres);
        return neres;
    }
}