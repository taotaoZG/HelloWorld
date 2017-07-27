/**
 * 超类变量可以引用子类对象
 * 可以将指向继承自某个超类的任何子类对象的引用，赋值给这个超类的引用变量
 */
public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
        Box plainbox;
        double vol;
        vol = weightbox.volume();
        System.out.println("Volume of weightbox is " + vol);
        System.out.println("Weight of weightbox is " + weightbox.weight);
        System.out.println();

        plainbox = weightbox;

        vol = plainbox.volume();
        System.out.println("Volume of plainbox is 测试用" + vol);

        /*在此，weightbox是指向BoxWeight对象的引用，plainbox是指向Box对象的引用。因为BoxWeight是Box的子类，所以可以将指向weightbox对象的引用赋值给plainbox*/

    }
}
