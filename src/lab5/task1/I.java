package lab5.task1;

public class I extends H {
    public String i;

    public I(String s) {
        super(s);
        this.i = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + i;
    }
}