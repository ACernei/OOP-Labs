package lab5.task2;

public class H extends G {
    protected String h;

    public H(String s, X x) {
        super(s, x);
        this.h = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + h;
    }
}