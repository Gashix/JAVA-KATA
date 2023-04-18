public class Main {
    public static void main(String[] args) {
        int[] firstArray = {44,1,3,2,8};
        int[] secondArray = {6, 7, 5, 9, 0, 11};
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

        for (int i = 0; i < neres.length - 1; i++) {
            for (int b = 1; b < neres.length - i; b++) {
                if (neres[b] < neres[b - 1]) {
                    int z = neres[b];
                    neres[b] = neres[b - 1];
                    neres[b - 1] = z;
                }
            }
        }
        return neres;
    }
}