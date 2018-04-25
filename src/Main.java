public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a = 1;
        int b = 2;
        int c = 4;

        int d = (a+b)*c;

        System.out.println(printSum(a, b));


    }

    void printSum(int a, int b) {
        int result = a + b;
        if (result>0) {
            System.out.println("Result smaller than 0: " + result);
        } else {
            System.out.println("Result bigger than 0: " + result);
        }
    }
}
