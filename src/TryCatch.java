
public class TryCatch {
    public static void main(String[] args) {
        try {
            int a = 3;
            System.out.println("a=" + a);
            int b = 42/a;
            int c[]={1};
            c[42]=99;
        }catch (ArithmeticException e){   // 捕获除0异常
            System.out.println("Divide by 0:" + e);
        }catch (ArrayIndexOutOfBoundsException e){  //捕获数组越界
            System.out.println("Array index oob:" + e);
        }
        System.out.println("After try/catch blocks.");
    }
}

/**
 * 当使用多条catch语句时，要重点记住异常子类必须位于所有超类之前，因为使用了某个超类的catch语句会捕获这个超类及其所有子类的异常。
 * 因此，如果子类位于超类之后的话，永远也不会到达子类。此外在Java中,不可到达的代码被认为是错误的。
 */
