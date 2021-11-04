package lab5.task2;

public class A {
    protected String a;
    protected X x;

    public A(String s, X x) {
        this.a = s;
        this.x = x;
    }

    @Override
    public String toString() {
        return x.toString() + " " + a;
    }
}