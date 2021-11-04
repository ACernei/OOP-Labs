package lab5.task1;

public class E extends D {
    public String e;

    public E(String s) {
        super(s);
        this.e = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + e;
    }
}