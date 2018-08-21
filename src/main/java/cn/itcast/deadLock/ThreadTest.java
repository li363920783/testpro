package cn.itcast.deadLock;

/**
 * ThreadTest class
 *
 * @author 李茂林
 * @date 2018/7/31
 */
public class ThreadTest {

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        new ProxyLeft(deadLock).start();
        new ProxyRight(deadLock).start();

    }

}
