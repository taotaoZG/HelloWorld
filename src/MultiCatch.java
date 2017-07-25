//多重捕获特性
public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int vals[] = {1, 2, 3};
        try {
            // ArithmeticException
            int result = a / b;
            // ArrayIndexOutOfBoundsException
//            vals[10] = 19;

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught:" + e);
        }
        System.out.println("After multi-catch.");
    }
}
