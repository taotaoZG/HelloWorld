// 链式异常
public class LinkException {
    static void demoproc(){
        NullPointerException e = new NullPointerException("top layer");
        // add a cause
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            // 显示顶级异常
            System.out.println("Caught:" + e);
            // 显示原因异常
            System.out.println("Original cause:" +  e.getCause());
        }
    }
}
