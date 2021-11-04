package lab5.task1;

public class H extends G {
    public String h;

    public H(String s) {
        super(s);
        this.h = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + h;
    }
}