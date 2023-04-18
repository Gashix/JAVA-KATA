public class Main {
    public static void main(String[] args) {
        System.out.println(getAgeDiff(4,2));
        System.out.println(getAgeDiff((byte) 2,4));
    }
    public static byte getAgeDiff(byte age1, byte age2) {
        byte res = (byte) (age1 - age2);
        byte result = (byte) Math.abs(res);
        return result;
    }
}