//public class MultiplicationTable {
//
//    void printTable(int n) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n + "x" + i + "=" + n * i);
//            try {
//                Thread.sleep(400);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//class Thread1 extends Thread {
//    MultiplicationTable t;
//    Thread1(MultiplicationTable t) {
//        this.t = t;
//    }
//    public void run() {
//        t.printTable(5);
//    }
//}
//
//class Thread2 extends Thread {
//    MultiplicationTable t;
//    Thread2(MultiplicationTable t) {
//        this.t = t;
//    }
//    public void run() {
//        t.printTable(5);
//    }
//}
//
//class WithoutSynchronization {
//    public static void main(String args[]) {
//        MultiplicationTable obj = new MultiplicationTable();
//        Thread1 t1 = new Thread1(obj);
//        Thread2 t2 = new Thread2(obj);
//        t1.start();
//        t2.start();
//    }
//}
