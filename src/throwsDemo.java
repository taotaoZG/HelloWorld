public class throwsDemo {
    static void throwOne() throws IllegalAccessException{
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try{
            throwOne();
        }catch (IllegalAccessException e){
            System.out.println("Caught " + e);
        }
    }
}


/*
throws是用来给子类继承的，告诉超类，该类可能会抛出相应的异常
 */

