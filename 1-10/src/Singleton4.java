/**
 * 静态内部类
 *
 * @author HXP
 * @date 2018/05/14 21:14
 */
public class Singleton4 {

    private Singleton4() {

    }

    private static class SingletonHolder {
        private static Singleton4 singleton4 = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.singleton4;
    }
}
