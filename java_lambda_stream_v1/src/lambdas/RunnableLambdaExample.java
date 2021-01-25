package lambdas;

public class RunnableLambdaExample {




    public static void main(String[] args) {
        /*
         * Implementacion normal
         * */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("solo probando runnable ");
            }
        };

        runnable.run();

        /*
        * Con lambda
        * */

        Runnable runnablV2 = () -> {
            System.out.println("Runnable con lambda");
            System.out.println("Runable con lambda segundo print");
        };


        Thread thread = new Thread(runnablV2);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnablV2);

        thread.start();
        thread2.start();
        thread3.start();

    }

}
