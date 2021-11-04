package lab5.task1;

public class J extends I {
    public String j;

    public J(String s) {
        super(s);
        this.j = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + j;
    }
}