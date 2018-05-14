public enum Singleton6 {
    INSTANCE;
    public void otherMethod() {

    }
}
class Test {
    public static void main(String[] args) {
        Singleton6.INSTANCE.otherMethod();
    }
}