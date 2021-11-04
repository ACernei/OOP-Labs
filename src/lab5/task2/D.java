package lab5.task2;

public class D extends C {
    protected String d;

    public D(String s, X x) {
        super(s, x);
        this.d = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + d;
    }
}