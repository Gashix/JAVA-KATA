public class Main {
    public static void main(String[] args) {
        int [] op = new int[]{};
        int result[] = getArrayMiddle(op);
        for(int i = 0; i < getArrayMiddle(op).length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length == 0) {
            int[] res = new int[]{};
            return res;
        }
        int length = numbers.length;
        int chet = length % 2;
        if (chet > 0) {
            int indexNe = length / 2;
            int[] res = new int[]{numbers[indexNe]
            };
            return res;

        } else {
            double indexNeD = (double) length / 2;
            int indexNe = (int) Math.floor(indexNeD);
            int[] res = new int[]{numbers[indexNe - 1], numbers[indexNe]
            };
            return res;
        }
    }
}