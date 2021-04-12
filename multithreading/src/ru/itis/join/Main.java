package ru.itis.join;

public class Main {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
//        Thread thread = new Thread(sumThread);
//        SumThread thread = new SumThread();
//        thread.start();
//        try {
//            Thread.sleep(1000);
//            thread.join();
//        } catch (InterruptedException e) {
//            throw new IllegalStateException(e);
//        }
        System.out.println(sumThread.getSum());
    }
//    Main          SumThread
//     |
// thread.start();
//     |
//                      |
//                      |
// thread.join();
//                      |
//                      |
//                      |
//           run отработал (закончил исполнение)
//                     <-
//    |
//    |





//    Main          SumThread
//      |
//  thread.start();
//      |
//                      |
//                      |
//      |
//                      |


}
