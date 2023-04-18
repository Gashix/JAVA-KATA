public class Main {
    public static void main(String[] args) {
        String str = new String("1200");
        Person person1 = new Person();
        person1.parseAndPrintNumber(str);

    }
}
class Person{

    public void parseAndPrintNumber(String str) {
        int i = Integer.parseInt(str);
        i = i / 2;
        System.out.println(i);
    }
}