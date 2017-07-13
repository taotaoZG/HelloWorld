// 可变长度参数测试
public class VarArgs {
    private static void vaTest(int ... v){
        System.out.println("Number of args: " + v.length);
        for (int x: v){
            System.out.println(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest(10);

        // 注意：可变长度参数必须是最后一个参数且只能有一个可变长度参数
        vaTest(1,2,3);

        vaTest();
    }


}

// 179
