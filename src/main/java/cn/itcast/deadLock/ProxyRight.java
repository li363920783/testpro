package cn.itcast.deadLock;

/**
 * ProxyRight class
 *
 * @author 李茂林
 * @date 2018/7/31
 */
public class ProxyRight extends Thread {
    private DeadLock lock;

    public ProxyRight(DeadLock Lock){
        this.lock=Lock;
    }

    @Override
    public void run() {
        try {
            lock.right();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
