package varios;

public class EjecutarFoo {

     static class Ejem implements Runnable{

        @Override
        public void run() {
            System.out.println("first");
        }
    }

    static class Ejem2 implements Runnable{

        @Override
        public void run() {
            System.out.println("second");
        }
    }

    static class Ejem3 implements Runnable{

        @Override
        public void run() {
            System.out.println("third");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        Ejem ejem =  new Ejem();
        Ejem2 ejem2 = new Ejem2();
        Ejem3 ejem3 = new Ejem3();
        foo.first(ejem);
        foo.second(ejem2);
        foo.third(ejem3);

    }
}
