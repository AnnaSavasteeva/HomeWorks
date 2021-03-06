package Java_3.j3_lesson4;

public class AbcApp {
    private volatile char currentLetter = 'A';
    private final Object monitor = new Object();


    public static void main(String[] args) {
        AbcApp abcApp = new AbcApp();

        Thread threadA = new Thread(abcApp::printA);
        Thread threadB = new Thread(abcApp::printB);
        Thread threadC = new Thread(abcApp::printC);

        threadA.start();
        threadB.start();
        threadC.start();
    }


    private void printA() {
        synchronized (monitor) {

            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'A') {
                        monitor.wait();
                    }

                    System.out.print("A");
                    currentLetter = 'B';
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void printB() {
        synchronized (monitor) {

            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'B') {
                        monitor.wait();
                    }

                    System.out.print("B");
                    currentLetter = 'C';
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void printC() {
        synchronized (monitor) {

            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'C') {
                        monitor.wait();
                    }

                    System.out.print("C");
                    currentLetter = 'A';
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
