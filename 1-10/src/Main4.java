/**
 * 将一个字符串中的空格替换成“%20”
 *
 * @author HXP
 * @date 2018/05/16 10:46
 */
public class Main4 {
    public String replaceSpace(String str) {
        if (str == null) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Main4().replaceSpace("hello world  java"));
    }
}
