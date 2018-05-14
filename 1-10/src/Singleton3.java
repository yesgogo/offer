/**
 * 线程安全的懒汉式
 *
 * @author HXP
 * @date 2018/05/14 21:07
 */
public class Singleton3 {
    private static Singleton3 singleton3;
    private Singleton3() {

    }
    public static synchronized Singleton3 getInstance() {
        if (singleton3 == null) {
            return new Singleton3();
        }
        return singleton3;
    }
}
