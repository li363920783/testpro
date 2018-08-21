package cn.itcast.deadLock;

/**
 * ProxyLeft class
 *
 * @author 李茂林
 * @date 2018/7/31
 */
public class ProxyLeft extends Thread {
    private DeadLock lock;

    public ProxyLeft(DeadLock lock){
        this.lock=lock;
    }

    @Override
    public void run() {
        try {
            lock.left();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
