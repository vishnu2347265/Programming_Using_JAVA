interface NumericTest{
    boolean computeTest(int n);
}

class Lambda1{
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n%2) == 0;
        NumericTest isNegative = (n) -> (n<0);

        System.out.println(isEven.computeTest(5));
        System.out.println(isNegative.computeTest(-5));

    }
}