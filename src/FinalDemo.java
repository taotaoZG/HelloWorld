
public class FinalDemo {
    public static void main(String[] args) {
        System.out.println("aaaaaaaa");
    }

    class A {
        final void meth(){
            System.out.println("This is a final method.");
        }
    }

    class B extends A {
//        void meth(){   // 报错，A类中的方法加了final修饰，无法被重写
//            System.out.println("Illegal!");
//        }
    }

}

/**
 *     将方法声明为final，有时可以提高性能：编译器可以自由地内联对这类方法的调用，因为
 * 编译器知道这些方法不能被子类重写。当调用小的final方法时，Java编译器通常可以复制子例
 * 程的字节码，直接和调用方法的编译代码内联到一起，从而可以消除方法调用所需要的开销。内
 * 联是final方法才有的一个选项。通常，Java在运行时动态分析对方法的调用，这称为后期绑定。
 * 但是，因为final方法不能被重写，所以对final方法的调用可以在编译时解析，这称为早期绑定。
 *     final还可以阻止类被继承。
 */
