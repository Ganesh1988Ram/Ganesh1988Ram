package java_stream;

public class AnonymousInnerClassQuestoion {
	
	
	/**
	 * There are following differences:

1) Syntax

Lambda expressions looks neat as compared to Anonymous Inner Class (AIC)

public static void main(String[] args) {
    Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println("in run");
        }
    };

    Thread t = new Thread(r);
    t.start(); 
}

//syntax of lambda expression 
public static void main(String[] args) {
    Runnable r = ()->{System.out.println("in run");};
    Thread t = new Thread(r);
    t.start();
}
2)Scope

An anonymous inner class is a class, which means that it has scope for variable defined inside the inner class.

Whereas,lambda expression is not a scope of its own, but is part of the enclosing scope.

Similar rule applies for super and this keyword when using inside anonymous inner class and lambda expression. In case of anonymous inner class this keyword refers to local scope and super keyword refers to the anonymous class’s super class. While in case of lambda expression this keyword refers to the object of the enclosing type and super will refer to the enclosing class’s super class.

//AIC
    public static void main(String[] args) {
        final int cnt = 0; 
        Runnable r = new Runnable() {
            @Override
            public void run() {
                int cnt = 5;    
                System.out.println("in run" + cnt);
            }
        };

        Thread t = new Thread(r);
        t.start();
    }

//Lambda
    public static void main(String[] args) {
        final int cnt = 0; 
        Runnable r = ()->{
            int cnt = 5; //compilation error
            System.out.println("in run"+cnt);};
        Thread t = new Thread(r);
        t.start();
    }
	 */

}
