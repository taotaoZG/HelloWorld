public class throwDemo {
    static void demoproc(){
        try{
            throw new NullPointerException("demo");  // 创建Java的标准异常对象
        }catch (NullPointerException e){
            System.out.println("Caught inside demoproc.");
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Recaught:" + e);
        }
    }
}
