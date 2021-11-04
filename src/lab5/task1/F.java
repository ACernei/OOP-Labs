package lab5.task1;

public class F extends E {
    public String f;

    public F(String s) {
        super(s);
        this.f = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + f;
    }
}