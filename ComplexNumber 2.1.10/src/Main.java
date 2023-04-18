public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1, 2);
        ComplexNumber c2 = new ComplexNumber(1, 2);
        System.out.println(c1.equals(c2)); // true
        System.out.println(c1.hashCode() == c2.hashCode()); // true

        ComplexNumber c3 = new ComplexNumber(1, 2);
        ComplexNumber c4 = new ComplexNumber(3, 4);
        System.out.println(c3.equals(c4)); // false
        System.out.println(c3.hashCode() == c4.hashCode()); // false

        ComplexNumber c5 = new ComplexNumber(182, 2);
        ComplexNumber c6 = new ComplexNumber(182, 2);
        System.out.println(c5.equals(c6)); // true
        System.out.println(c5.hashCode() == c6.hashCode()); // true
    }

    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            ComplexNumber that = (ComplexNumber) o;
            return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(re, im);
        }
    }
}
