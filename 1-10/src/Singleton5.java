/**
 * 双重校验锁
 *
 * @author HXP
 * @date 2018/05/14 21:31
 */
public class Singleton5 {
    private static volatile Singleton5 singleton5;

    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        if (singleton5 == null) {
            synchronized (Singleton5.class) {
                if (singleton5 == null) {
                    singleton5 = new Singleton5();
                }
            }
        }
        return singleton5;
    }
}
