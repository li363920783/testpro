package cn.itcast.deadLock;

/**
 * DeadLock class
 *
 * @author 李茂林
 * @date 2018/7/31
 */
public class DeadLock {

   private final Object left = new Object();
   private final Object right = new Object();

   public void left()throws Exception{
       synchronized (left){
           System.out.println("左线程获取到左锁,请求右锁.....");
           Thread.sleep(2000);
           synchronized (right){
               System.out.println("左边....");
           }
       }
   }

   public void right()throws Exception{
        synchronized (right){
            System.out.println("右线程获取到右锁,请求左锁....");
            Thread.sleep(2000);
            synchronized (left){
                System.out.println("右边....");
            }
        }
    }

}
