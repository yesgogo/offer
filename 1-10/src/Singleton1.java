/**
 * 懒汉式：用的时候再创建实例
 *
 * @author HXP
 * @date 2018/05/14 20:26
 */
public class Singleton1 {
    private static Singleton1 singleton1;
    private Singleton1() {

    }
    public static Singleton1 getInstance() {
        if (singleton1 == null) {
            return new Singleton1();
        }
        return singleton1;
    }
}
