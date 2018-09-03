public class Task12 {

    /**
     * https://stepik.org/lesson/44228/step/1?adaptive=true&unit=24724
     *
     * <p>
     * How do you start a new Thread in Java?
     */
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Started")).start();
    }

}


