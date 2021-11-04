package lab5.task1;

public class C extends B {
    public String c;

    public C(String s) {
        super(s);
        this.c = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + c;
    }
}