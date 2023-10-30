public class JavaDoc {
    /**
     * @param number
     * @return
     */
    public static String checkOddEven(int number) {
        if (number % 2 == 0) {
            return "Genap";
        } else {
            return "Ganjil";
        }
    }

    public static void main(String[] args) {
        int numberToCheck = 10;
        String result = checkOddEven(numberToCheck);
        System.out.println(numberToCheck + " adalah bilangan " + result + ".");
    }
}
