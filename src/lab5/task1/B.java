package lab5.task1;

public class B extends A {
    public String b;

    public B(String s) {
        super(s);
        this.b = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + b;
    }
}