package lab5.task1;

public class D extends C {
    public String d;

    public D(String s) {
        super(s);
        this.d = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + d;
    }
}