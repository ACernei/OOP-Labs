package lab5.task1;

public class Main {
    public static void main(String[] args) {
        var letters = new Object[]{
                new A("a"),
                new B("b"),
                new C("c"),
                new D("d"),
                new E("e"),
                new F("f"),
                new G("g"),
                new H("h"),
                new I("i"),
                new J("j"),
        };
        for (var letter : letters) {
            System.out.println(letter);
        }
    }
}