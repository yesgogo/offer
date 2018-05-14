/**
 * 饿汉式，声明时直接创建
 *
 * @author HXP
 * @date 2018/05/14 20:58
 */
public class Singleton2 {
    private static Singleton2 singleton2 = new Singleton2();

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        return singleton2;
    }
}
