package nl.weber.lambdas;

public class RunnableLamdaExample {

    public static void main(String[] args) {
        /**
         * prior to Java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1.1");
            }
        }).start();

        /**
         * java 8 lambda
         * ()->{}
         */
        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2");
        };
        new Thread(runnableLambda).start();

        /**
         * short
         */
        Runnable runnableLambdaShort = () -> System.out.println("Inside Runnable 3");
        new Thread(runnableLambdaShort).start();


        /**
         * shorter
         */
        new Thread(() -> System.out.println("Inside Runnable 4")).start();


    }
}
