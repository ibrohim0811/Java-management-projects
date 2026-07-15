package Person;

public class Person {
    public String name;
    public static String nickname;

    static {
        System.out.println("Static block worked!");
        nickname = "halo";
    }
}