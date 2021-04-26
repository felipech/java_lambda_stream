package varios;

public class Foo {

    private volatile int mutex = 0;

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.

        printFirst.run();
        Thread.yield();
        mutex = 1;

    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(mutex != 1){
            Thread.yield();
        }
        // printSecond.run() outputs "second". Do not change or remove this line.

        printSecond.run();
        mutex = 2;
        Thread.yield();


    }

    public void third(Runnable printThird) throws InterruptedException {
        while(mutex != 2){
            Thread.yield();
        }
        printThird.run();


        // printThird.run() outputs "third". Do not change or remove this line.



    }

}

